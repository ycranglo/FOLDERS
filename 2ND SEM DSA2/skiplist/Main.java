import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static int countSkip;
  public static int countList;
  public static int length;
  public static int number;
  public static int nodesToSkip = 0;
  public static int lastValue = 0;
  public static int choice;
  public static int search;
  public static Date date = new Date();
  public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) {
    try {
      // Creates the objects for the linked list and skip list
      doublyLinkedList linkedList = new doublyLinkedList();
      SkipList skipList = new SkipList();

      // Sets the initial length of the linked list
      do {
        promptUser("length");
        length = Integer.parseInt(reader.readLine());
      } while (length < 1);

      // Inserts elements to the linked list
      for (int i = 1; i <= length; i++) {
        promptUser("element");
        number = Integer.parseInt(reader.readLine());
        linkedList.addNode(new Node(number));
      }

      // Sorts the linked list in ascending order
      displaySuccessfulMessage("\nSorting the linked list...");
      linkedList.bubbleSort();
      displaySuccessfulMessage("\nOperation successful. The linked list has been successfully sorted.");

      linkedList.displayList();

      do {
        System.out.println("\nOPERATIONS");
        System.out.println("[1] Create Skip List");
        System.out.println("[2] Add Node");
        System.out.println("[3] Display List from Head");
        System.out.println("[4] Display Skip List from Head");
        System.out.println("[5] Display List from Tail");
        System.out.println("[6] Display Skip List from Tail");
        System.out.println("[7] Search from Head");
        System.out.println("[8] Search from Tail");
        System.out.println("[9] Exit\n");

        // Prompts the user to select an operation
        do {
          promptUser("");
          choice = Integer.parseInt(reader.readLine());
        } while (choice < 1 || choice > 9);

        // Performs an operation depending on user choice on the menu
        // Creates the new skip list
        if (choice == 1) {
          if (skipList.getHead() != null)
            displayErrorMessage("A skip list is already created.");
          else {
            // Creates the first node of the skip list
            SkipNode skipNode = new SkipNode();

            // Creates the remaining nodes of the skip list
            Node currentNode = linkedList.getHead();

            // Computes the number of nodes to be skipped
            nodesToSkip = (int) Math.sqrt(linkedList.getLength());

            skipNode.setData(linkedList.getHead().getData());
            skipNode.setBottom(linkedList.getHead());
            skipList.addNode(skipNode);

            while (currentNode != null) {
              for (int i = 1; i <= nodesToSkip + 1; i++) {
                if (currentNode != null)
                  currentNode = currentNode.getNext();
                else
                  break;
              }

              if (currentNode != null) {
                skipNode = new SkipNode();
                skipNode.setData(currentNode.getData());
                skipNode.setBottom(currentNode);
                skipList.addNode(skipNode);
              }
            }

            System.out.print("\nSkip list created!");
          }
        }

        if (choice == 2) {
          do {
            // input for the new node's data
            System.out.print("\nEnter a number: ");
            number = Integer.parseInt(reader.readLine());
            // retrieves the last node's value
            Node currentNode = linkedList.getHead();
            while(currentNode.getNext()!=null)
            currentNode = currentNode.getNext();
            lastValue = currentNode.getData();
            // the new node's data must not be lower than the last node's data
            if(lastValue >= number)
            System.out.print("\nNumber must be higher than the last value.");
            // repeat the input if new node's data is lower than last node's data
            } while(lastValue >= number);
            // adds the new node to the linked list
            Node node = new Node(number);
            linkedList.addNode(node);
            // checks if the existing skip list needs an update
            if(skipList.getHead()!=null) {
            // retrieves the last node of the skip list
            SkipNode currentSkipNode = skipList.getHead();
            while(currentSkipNode.getNext()!=null)
            
            currentSkipNode = currentSkipNode.getNext();
            // checks if there's a need to create a new node for the skip list
            // based on the calculated number of nodes to be skipped
            Node currentNode = currentSkipNode.getBottom();
            for(int i=1; i<= nodesToSkip + 1; i++)
            if(currentNode!=null)
            currentNode = currentNode.getNext();
            // if number of nodes to be skipped was met then create a
            // new node for the skip list
            if(currentNode!=null) {
            
            SkipNode skipNode = new SkipNode();
            
            skipNode.setData(currentNode.getData());
            skipNode.setBottom(currentNode);
            skipList.addNode(skipNode);
            }
        }
      }

        if (choice == 3) {
          linkedList.displayList();
        }

        if (choice == 4) {
          if (skipList.getHead() == null)
          displayErrorMessage("skip list is not created");
        else {
          skipList.displayList();
        }
      }
        if (choice == 5) {
          linkedList.displayReversedList();
        }

        if (choice == 6) {
          if (skipList.getHead() == null)
          displayErrorMessage("skip list is not created");
        else {
          skipList.displayReversedList();
        }
        }

        if (choice == 7) {
          if (skipList.getHead() == null){
          displayErrorMessage("skip list is not created");
          }else {
          SkipNode currentNodeSkip = skipList.getHead();
          System.out.println("Enter a number to search");
          int search = Integer.parseInt(reader.readLine());
          Node currentNode = null;
          boolean findhead = false;
          while (currentNodeSkip != null) {
              if (currentNodeSkip.getData() <= search){
                  currentNode = currentNodeSkip.getBottom();
                  countSkip++;
              } else {
                  break;
              }
              currentNodeSkip = currentNodeSkip.getNext();
          }
          if (currentNode == null) {
              System.out.println("Element not found!");
          } else {
              while (currentNode!= null) {
                  if (currentNode.getData() == search) {
                      findhead = true;
                      break;
                  }
                  countList++;
                  currentNode = currentNode.getNext();
              }
              if (findhead) {
                  System.out.println("Element found.");
                  System.out.println("Skip list count: " + countSkip);
                  System.out.println("List count: " + countList);
              } else {
                  System.out.println("Element not found!");
              }
          }
          countSkip=0;
          countList=0;
        }
        }

        if (choice == 8) {
          if (skipList.getHead() == null){
            displayErrorMessage("skip list is not created");
          }else {
          System.out.println("Enter a number to search");
          int searchtail = Integer.parseInt(reader.readLine());
          Node currentNode = null;
          boolean findTail = false;
          SkipNode currentNodeSkip = skipList.getHead();
          
          while (currentNodeSkip != null) {
            if (currentNodeSkip.getData() <= searchtail){
              currentNode = currentNodeSkip.getBottom();
              countSkip++;
          } else {
              break;
          }
            currentNodeSkip = currentNodeSkip.getNext();
          }

          if (currentNode == null) {
            System.out.println("Element not found!");
        } else {

          while (currentNode.getNext() != null)
          currentNode = currentNode.getNext();

            while(currentNode!=null){
              if (currentNode.getData() == searchtail) {
                findTail = true;
                break;
            }
            currentNode = currentNode.getPrevious();
            countList++;
            }
            countList++;
            if (findTail) {
              System.out.println("Element found.");
              System.out.println("Skip list count: " + countSkip);
              System.out.println("List count from tail: " + countList);
          } else {
              System.out.println("Element not found!");
          }
          }
        }
          countSkip=0;
          countList=0;
        }
      } while (choice >= 1 && choice <= 8);
      displaySuccessfulMessage("\nApplication closed. Thank you.\n");
    } catch (Exception error) {
      displayErrorMessage("Appropriate numerical characters are only allowed. Please restart the application.\n");
    }
  }

  // Prompts user to get different type of data depending on it's type
  public static void promptUser(String type) {
    if (type.equals("length")) {
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert length $ ");
      return;
    }

    if (type.equals("element")) {
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert element $ ");
      return;
    }

    if (type.equals("search")) {
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert element to search $ ");
      return;
    }

    System.out.print("[" + simpleDate.format(timestamp) + "]" + " Select an operation $ ");
  }

  // Displays a dividing lines for every operation for proper formatting
  public static void divider(int spacing) {
    if (spacing == 1)
      System.out.println("\n------------------------------------------\n");
    else
      System.out.println("\n\n------------------------------------------\n");
  }

  // Prints an successful message depending on the passed argument
  public static void displaySuccessfulMessage(String message) {
    System.out.println(message);
  }

  // Prints an error message depending on the passed argument
  public static void displayErrorMessage(String message) {
    System.out.println("\nError: " + message);
  }

  static {
    // Prints an informational messages
    System.out.println("SKIP LIST");
    System.out.println("Midterm Case Study 2");
    System.out.println(new Timestamp(date.getTime()) + " GMT+8 Philippine Standard Time\n");
  }
}

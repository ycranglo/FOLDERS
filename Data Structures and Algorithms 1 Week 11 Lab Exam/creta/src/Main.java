import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  // Declares variables and creates instances needed for crucial processes
  public static DoublyLinkedList doublyLinkedList;
  public static int userData;
  public static int userChoice;
  public static Date date = new Date();
  public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  public static BufferedReader inputGetter = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    // Prints an informational messages
    System.out.println("DOUBLY LINKED LIST OPERATIONS");
    System.out.println("Midterm Exam");
    System.out.println(new Timestamp(date.getTime()) + " GMT+8 Philippine Standard Time");
    System.out.println("Group Task\n");

    // Handles potential errors
    try {
      int doublyLinkedListSize = 0;

      // Prompts the user for the size of doubly linked list
      do {
        promptUser("size");
        doublyLinkedListSize = Integer.parseInt(inputGetter.readLine());
      } while (doublyLinkedListSize <= 0);
                  
      doublyLinkedList = new DoublyLinkedList();

      // Prompts the user to insert nodes on the doubly linked list
      for (int i = 0; i < doublyLinkedListSize; i++) {
        promptUser("insert");
        userData = Integer.parseInt(inputGetter.readLine());

        doublyLinkedList.addNode(new Node(userData));

        doublyLinkedList.setSize(doublyLinkedList.getSize() + 1);
      }

      displaySuccessfulMessage("\nThe doubly linked list has been successfully created.");
      divider(1);

      // Displays a menu for different doubly linked list operations
      do {
        System.out.println("OPERATIONS");
        System.out.println("1: APPEND NODE");
        System.out.println("2: DISPLAY NODES");
        System.out.println("3: DELETE ALL NODES");
        System.out.println("4: EXIT\n");

        // Prompts the user to select an operation
        do {
          promptUser("choice");
          userChoice = Integer.parseInt(inputGetter.readLine());
        } while(userChoice < 1 || userChoice > 6);

        // Performs a doubly linked list operation depending on user choice on the menu
        // Appends a new node
        if (userChoice == 1) {
          promptUser("insert");
          userData = Integer.parseInt(inputGetter.readLine());

          doublyLinkedList.addNode(new Node(userData));

          doublyLinkedList.setSize(doublyLinkedList.getSize() + 1);

          displaySuccessfulMessage("\nThe element has been successfully appended.");

          divider(1);
        }
        // Displays all nodes
        else if (userChoice == 2) {
          if (doublyLinkedList.getSize() == 0) {
            displayErrorMessage("Operation unavailable. Linked list is empty.");
            divider(1);
          } else {
            doublyLinkedList.displayNodes();
            divider(2);
          }
        }
        // Deletes all nodes
        else if (userChoice == 3) {
          if (doublyLinkedList.getSize() == 0) {
            displayErrorMessage("Operation unavailable. Linked list is empty.");
            divider(1);
          } else {
            promptUser("delete");
            userData = Integer.parseInt(inputGetter.readLine());

            doublyLinkedList.deleteNodes(userData);

            displaySuccessfulMessage("\nThe specific node and all it's instances has been successfully deleted.");

            divider(1);
          }
        }
        else
          displaySuccessfulMessage("\nApplication closed. Thank you.\n");
      } while (userChoice >= 1 && userChoice <= 3);
    } catch (Exception error) {}
  }

  // Prompts user to get different type of data depending on it's type
  public static void promptUser(String type) {
    if (type.equals("size"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter A Doubly Linked List Size $ ");
    else if (type.equals("choice"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Select An Operation $ ");
    else if (type.equals("insert"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert A Doubly Linked List Element $ ");
    else if(type.equals("delete"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter A Doubly Linked List Element $ ");
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
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  // this is the intance of what we need in opur program
  // this variable holds the value that we append
  public static int appeddElement;
  // this is for the users choice
  public static int choice;
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws NumberFormatException, IOException {
    // intance of object of LinkedList class
    LinkedList list = new LinkedList();

    try {
      do {
        System.out.println("PLEASE CHOICE A OOPERATION");
        System.out.println("1> APPEND");
        System.out.println("2> MERGE ALL DUPLICATES");
        System.out.println("3> DISPLAY");
        System.out.println("4> EXIT");
        System.out.println();
        do {
          // this code is for the checking if the user input for choice is
          // more than 6 or lessthan 1
          System.out.print(">");
          choice = Integer.parseInt(reader.readLine());
        } while (choice < 1 || choice > 6);
        System.out.println();
        // it will appear if the users choose 1
        if (choice == 1) {
          // if the user choose 1,this code is for
          // appending a Node to linkedList
          //first is we ask the user to put a integer
          System.out.println("PLEASE ENTERT A ELEMENT TO APPEND");
          System.out.print(">");
          //we parse it to int
          appeddElement = Integer.parseInt(reader.readLine());
          //then we put that integer to the addnode method
          //by calling the addNode()
          list.addNode(new Node(appeddElement));
          System.out.println();
        }
        // it will appear if the users choose 2
        if (choice == 2) {
          // if the user choose 2,this code is for
          // merging all duplicates
          // by calling the method MergeAllDuplicates()
          list.MergeAllDuplicates();
        }
        // it will appear if the users choose 3
        if (choice == 3) {
          // if the user choose 3,this code is for
          // displaying the values of circular doubly LinkedList
          // by calling the method displayList()
          list.displayList();
        }
      } while (choice == 1 || choice == 2 || choice == 3);
      //this code will display after the users choose 4 for
      System.out.println("EXITED PROGRAM...");
      System.out.println("THANK YOU...");
    } catch (Exception error) {
      //this code will show if theres a error
      System.out.println("WRONG INPUTS...");
    }
  }

  static {
    //this code will simpy display above the program
    System.out.println("Data Structures and Algorithms Week 17 Case Study");
    System.out.println();
  }

}

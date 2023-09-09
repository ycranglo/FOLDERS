import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  //instantiate the variables that needed in program
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public static int data;
  public static int counter;
  public static int choice;

  public static void main(String[] args) throws NumberFormatException, IOException {

    //instantiate the object for class Queue
    Queue queue = new Queue();

    //this is the menu driven for Queue
    do {
      System.out.println();
      Border();
      System.out.println("Queue Maximum :6");
      System.out.println("Queue :" + counter);
      System.out.println("Please choice a operation in Queue");
      System.out.println("1 :Enqueue");
      System.out.println("2 :Dequeue");
      System.out.println("3 :Peek");
      System.out.println("4 :Display");
      System.out.println("5 :Exit");
      System.out.print(">");
      do{
        //This will double check input if it exceeds greater that 4 or less than 1 it will not proceed.
        if (choice > 4 || choice < 1) {  
          System.out.println("Please enter the right operation ");
        }
        choice = Integer.parseInt(reader.readLine());
      }while(choice > 5 || choice < 1);
      Border();

      if (choice == 1) {
        //checks if the Queue is not full
        if (counter != 6) {
          //ask the user for data
          System.out.println("ENTER DATA :");
          System.out.print(">");
          data = Integer.parseInt(reader.readLine());
          //add the data to the Queue
          queue.enqueue(new Node(data));
          //increment the counter
          counter++;
        } else {
          //if the Queue is full
          System.out.println("THE QUEUE IS FULL");
        }
      }
      if (choice == 2) {
        //checks if the Queue is empty
        if(counter==0){
          System.out.println(" QUEUE IS EMPTY. NO DATA TO BE DELETE");
        }else{
          //if the Queue is not empty,we call the method in Queue class to delete
          System.out.println("DELETED VALUE :" + queue.dequeue());
          counter--;
        }
      }
      if (choice == 3) {
        if(counter==0){
          System.out.println("NO DATA TO PEEK. EMPTY QUEUE");
        }else{
          //This line calls the method from the Queue class and display the Peek 
          System.out.println("PEEK VALUE :" + queue.peek());
        }
      }
      if (choice == 4) {
         //This line calls the method from the Queue class to Display all the elements
        queue.display();
      }
    } while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
    System.out.println("Thank you!");
  }
  // this is well be display at the top of the program
  static {
    System.out.println("Data Structures and Algorithms 1 Week 15 Case Study");
    System.out.println("                    11/21/2022");
    System.out.println();
  }
  //mehod for the borders
  public static void Border(){
    System.out.println("----------------------------------------------------");
  }
}

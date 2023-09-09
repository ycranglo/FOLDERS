import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  //this is the intance of variable that we need in the program
  public static int choice;
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  //this is for the array
  public static int array[];
  //this variable is for counter for the inqueue and dequeue
  public static int counter = 0;
  //this is variable is for the size of the array
  public static int arraySize;
  //this is variable is for the data that we enqueue
  public static int data;

  public static void main(String[] args) throws NumberFormatException, IOException {

    try {
      System.out.println("CREATED BY :Yocor, Angelo T");
      System.out.println("DATE CREATED :NOV 24,2022");
      System.out.println("ACTIVITY USING QUEUE");
      System.out.println();
      //asking the user for the size of the array
      System.out.println("ENTER THE SIZE OF THE ARRAY :");
      System.out.print(">");
      arraySize = Integer.parseInt(reader.readLine());
      //initialize the size of the array
      array = new int[arraySize];
      do {
        // this is for the selecting of the operations
        System.out.println();
        System.out.println("PLEASE ENTER A OPERTION :");
        System.out.println("[1] ENQUEUE");
        System.out.println("[2] DEQUEUE");
        System.out.println("[3] PEEK");
        System.out.println("[4] IS EMPTY");
        System.out.println("[5] IS FULL");
        System.out.println("[6] EXIT");
        do {
          // this is the error handling if the user not choose the operation 1-6
          System.out.print(">");
          choice = Integer.parseInt(reader.readLine());
          if (choice <= 0 || choice > 6) {
            System.out.println("PLEASE ENTER A VALID OPERATION");
          }
        } while (choice <= 0 || choice > 6);

        //if the user choose 1
        if (choice == 1) {
          //this if statement is for the cheking of the array if it is full
          if (array.length == counter) {
            System.out.println("THE QUEUE IS FULL");
          } else {
            System.out.println("ENTER A DATA");
            System.out.print(">");
            data = Integer.parseInt(reader.readLine());
            //calling the enqueue method
            enqueue(data);
          }
        }
         //if the user choose 2
        if (choice == 2) {
           //this if statement is for the cheking of the array if it is empty
          if (counter == 0) {
            System.out.println("EMPTY QUEUE,NO DATA TO DELETE");
          } else {
            //calling the dequeue method
            dequeue();
          }
        }
          //if the user choose 3
        if (choice == 3) {
           //this if statement is for the cheking of the array if it has no firts element or empty
          if (counter == 0) {
            System.out.println("NO 1ST ELEMENT");
          } else {
            diverder();
                                      //calling the peek method
            System.out.println("PEEK :" + peek());
          }
        }
          //if the user choose 4
        if (choice == 4) {
          //calling the isEmpty method
          diverder();
          System.out.println("IS EMPTY :" + isEmpty());
        }
          //if the user choose 5
        if (choice == 5) {
          //calling the isFull method
          diverder();
          System.out.println("IS FULL :" + isFull());
        }
        diverder();
        //displaying the elements of the Queue
        System.out.print("QUEUE :");
        //calling the displayArray method
        displayArray();
        diverder();
      } while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5);
      System.out.println("*EXITED THE PROGRAM*");
    }
    //this is for the error handling if the user inpout a Stringg and not a int
    catch (Exception error) {
      System.out.println("PLEASE ENTER A VALID INPUT, PLEASE TRY AGAIN.");
    }
  }

  //this is the method for enqueue
  public static void enqueue(int data) {
    //this line of code is we add the data to the array
    array[counter] = data;
    //then we increment the counter
    counter++;
  }
  //this method is for the dequeue
  public static void dequeue() {
    //first we create a local variable
    //then we set the size of it to less than 1 of the size of the array
    int tempArray[] = new int[counter - 1];
    //we loop the array to put the data of it to the tempArray
    //we start the iteration to 1
    for (int i = 1; i < counter; i++) {
      //in this line of code is we start the trasfering of data in 1 so that
      //the first element[0] we not trasfer to the tempArray
      tempArray[i - 1] = array[i];
    }
    //in this for loop is we trasfering the data of the tempArray to the array
    for (int h = 0; h < tempArray.length; h++) {
      // moving the element of the tempArray to array
      array[h] = tempArray[h];
    }
    //then we decrement the counter
    counter--;
  }
  //this is the method for the peek
  public static int peek() {
    //we returning the first element
    return array[0];
  }
  //this is the method for the isEmpty
  public static boolean isEmpty() {
    //this if statment is for cheking if the array is empty
    if (counter == 0) {
      return true;
    }
    return false;
  }
    //this is the method for the isFull
  public static boolean isFull() {
    //this if statment is for cheking if the array is full
    if (counter == array.length) {
      return true;
    }
    return false;
  }
  //this method is for displaying the array
  public static void displayArray() {
    for (int a = 0; a < counter; a++) {
      System.out.print(array[a] + " ");
    }
  }
  //this method is for diverder
  public static void diverder() {
    System.out.println();
    System.out.println("-------------------------------");
  }
}

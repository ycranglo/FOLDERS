import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int IntPush;
  public static int Choice;
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws NumberFormatException, IOException {
  
    Stack stack= new Stack();
    try{
      do{
        System.out.println("\nOPERATIONS");
        System.out.println("[1] Push");
        System.out.println("[2] Pop");
        System.out.println("[3] History");
        System.out.println("[4] Exit");
        do {
          System.out.print(">");
          Choice = Integer.parseInt(reader.readLine());
        } while (Choice < 1 || Choice > 4);

        if(Choice==1){
          System.out.println("Please enter a integer nummber:");
          IntPush=Integer.parseInt(reader.readLine());
          stack.push(IntPush);
          System.out.println("The item was added successfully!");
          stack.view();
        }
        
        if(Choice==2){
          System.out.println("The recently added item was deleted!");
          stack.pop();
          stack.view();
        }

        if(Choice==3){
          stack.view();
          System.out.println();
          System.out.println("Previous states of the stack data structure:");
          System.out.println();
          System.out.println();
          stack.History();
        }

      }while(Choice==1 || Choice==2 || Choice==3);
    } catch (Exception error) {
      System.out.println("Appropriate numerical characters are only allowed. Please restart the application");
    }
  }
  static{
        // Prints an informational messages
        System.out.println("Midterm Lab Exercise 2");
  }
}

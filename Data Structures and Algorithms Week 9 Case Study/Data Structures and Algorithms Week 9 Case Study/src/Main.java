import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static int size;
  public static int value;
  public static int   values=1;
  public static int Choice;
  public static int append;
  public static int after;
  public static int afterNode;
  public static int beforeNode;
  public static int before;
  public static int deletePosition;
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    LinkedList list=new LinkedList();

    //inputing the users size of the linked list
    System.out.println("--LINKED LIST--");
    System.out.println("PLEASE ENTER THE SIZE OF THE LINKED LIST  :");
    size=Integer.parseInt(reader.readLine());

    //inputing the values

    for(int a=0;a<size;a++){
     
      System.out.println("PLEASE ENTER THE VALUES AT "+values+" IN LINKED LIST:");
      value=Integer.parseInt(reader.readLine());
    list.addNote(new Node(value));
    values++;
    }
    
    System.out.println("THE LINKED LIST HAS BEEN SUCCESSFULLY CREATED");
    list.divider();
    do{
      System.out.println("PLEASE SELECT THE OPERATION YOU WANT");
      System.out.println("1.DISPLAY");
      System.out.println("2.APPEND");
      System.out.println("3.INSERT AFTER");
      System.out.println("4.INSERT BEFORE");
      System.out.println("5.DELETE ELEMENT");
      System.out.println("6.EXIT MENU");
      Choice=Integer.parseInt(reader.readLine());

      if(Choice==1){
        list.displayDetails();
        list.divider();
      }if(Choice==2){
        System.out.println("");
      System.out.println("PLEASE ENTER A NUMBER TO APPEND :");
      append=Integer.parseInt(reader.readLine());
    list.AppendList(new Node(append));
      list.displayDetails();
      list.divider();
      }
      if(Choice==3){
        System.out.println("PLEASE ENTER A POSITION :");
        after=Integer.parseInt(reader.readLine());
        System.out.println("PLEASE ENTER A element :");
        afterNode=Integer.parseInt(reader.readLine());
        list.insertAfter(new Node(afterNode), after);
        list.displayDetails();
        list.divider();
      }if(Choice==4){
        System.out.println("PLEASE ENTER A POSITION :");
        before=Integer.parseInt(reader.readLine());
        System.out.println("PLEASE ENTER A element :");
        beforeNode=Integer.parseInt(reader.readLine());
        list.insertBefore(new Node(beforeNode), before);
        list.displayDetails();
        list.divider();
      }if(Choice==5){
        System.out.println("PLEASE ENTER A POSITION :");
        deletePosition=Integer.parseInt(reader.readLine());
        list.deleteNode(deletePosition);
        list.displayDetails();
        list.divider();
      }
    }while(Choice!=6);
    list.divider();
    System.out.println("EXITED FROM TEH PROGRAM ");
    list.divider();

  



  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
  public static int choice;
  public static int appendData;
  public static void main(String[] args) throws NumberFormatException, IOException {

    LinkedList list= new LinkedList();
  do{
    System.out.println("SELECT A OPERATION");
    System.out.println("1 : Append");
    System.out.println("2 : Display");
    System.out.println("3 : Delete all Duplicates");
    System.out.println("4 : Delete All Unique");
    System.out.print(">");
    choice=Integer.parseInt(reader.readLine());

    if(choice==1){
      System.out.println("ENTER A INTEGER");
      appendData=Integer.parseInt(reader.readLine());
      list.addNode(new Node(appendData));
    }
    if(choice==2){
      list.displayList();
    }
    if(choice==3){
      list.deleteAllDuplicates();
    }


  }while(choice==1||choice==2||choice==3||choice==4);


    
  }
  static{
    System.out.println("Data Structures and Algorithms Week 16 Case Study");
    System.out.println("Nov 28,2022");
    System.out.println();
    System.out.println();
  }
}

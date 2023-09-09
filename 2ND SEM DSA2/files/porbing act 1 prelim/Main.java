import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public static String message;
  public static String search;
  public static String delete;
  public static int choice;

  public static void main(String[] args) {

    hashTable hash = new hashTable();

    try {
      do {
        System.out.println("choice a operation :");
        System.out.println("1-Add New Key");
        System.out.println("2-Display Hash Table");
        System.out.println("3-Search");
        System.out.println("4-Delete");
        System.out.println("5-Exit");
        System.out.print(">");
        do {
          choice = Integer.parseInt(reader.readLine());
          System.out.print(">");
        } while (choice < 1 || choice > 5);
      
      if(choice==1){
        System.out.println("ENTER A MESSAGE");
        System.out.print(">");
        message=reader.readLine();
        hash.addNewKey(message);
        System.out.println("succesfull added a message in hash table");
      }
      if(choice==2){
        hash.displayhashTable();
      }
      if(choice==3){
        System.out.println("ENTER A MESSAGE TO SEARCH");
        search=reader.readLine();
        hash.search(search);
      }if(choice==4){
        System.out.println("ENTER A MESSAGE TO DELETE");
        delete=reader.readLine();
        hash.delete(delete);
      }

      } while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
      System.out.println("thank for using this program!");
    } catch (Exception error) {
      System.out.println("invalid inputs,try again");
    }
  }
  static {
    System.out.println("PRELIM LAB CASE STUDY 1");
    System.out.println("HASH TABLE");
    System.out.println();
    System.out.println();
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static int ASCII = 97;
  public static TreeNode currentNode;
  public static String first;
  public static boolean clearDisplay = false;
  public static char character;
  public static char[] children = new char[27];
  public static String item = "";
  public static char option;
  public static String data;
  public static int size;
	public static String pick;
	public static int position;
  public static Date date = new Date();
  public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    // Handles potential errors
    // try {
      Tree tree;

      // Prompts the user for the number of strings to be inserted
      do {
        promptUser("size");
        size = Integer.parseInt(reader.readLine());
      } while (size <= 0);

      tree = new Tree();

      // Prompts the user for the strings to be inserted
      for (int i = 0; i < size; i++) {
        promptUser("insert");
        tree.insert(reader.readLine());
      }

      displaySuccessfulMessage("\nOperation successful. The tree was successfully created.");

      for (int i = 0; i <= 26; i++) {
        ASCII += i;
        character = (char) ASCII;

        if (currentNode.hasChild(character)) {
          if (character != '|')
            option = character;
          else
            option = 0;

          children[i] = character;
          tree.setCount(tree.getCount() + 1);
          first += option;
        }
      }

      if (tree.getCount() > 1) {
        if (clearDisplay) {
          System.out.println("Characters > " + item);
          clearDisplay = false;
        }

        promptUser("select");

        for (int i = 0; i <= 26; i++) {
          ASCII = 97;
          ASCII += i;
          character = (char) ASCII;

          if (currentNode.hasChild(character)) {
            if (character != '|')
              option = character;
            else
              option = 0;

            if (option == '0')
              System.out.println("\\0");
            else
              System.out.println(option);

            System.out.print(" | ");

            children[i] = character;
            tree.setCount(tree.getCount() + 1);

            if (option != '0')
              first += option;
              System.out.println("Characters > " + item);
          }
        }

        System.out.print(" > ");
        pick = reader.readLine();

        if (currentNode.hasChild(pick.charAt(0))) {
          item += pick.charAt(0);
          currentNode = currentNode.getChild(pick.charAt(0));

          if (countCharacters(currentNode) > 1) {
            System.out.println("Characters > " + item);
          }
        }
      } else {
        item += first;
        currentNode = currentNode.getChild(first.charAt(0));
        clearDisplay = true;
      }
                // String currentWord = word.charAt(word.length()-1) == '0' ? word.substring(0, word.length()-1) : word;
                // System.out.println(node.hasChild('{') ? "Display: "+currentWord : "Invalid Input");
                // System.out.print("\nTry Again?: ");
                // continueProgram = reader.readLine();
                // System.out.println();

                // if(continueProgram.charAt(0) == 'Y' || continueProgram.charAt(0) == 'y'){
                //     node = this.root;
                //     word = "";
                //     isValidPrint = false;
                // }else{
                //     System.out.println("End of Program...");
                //     break;
                // }

    // } catch (Exception error) {

    // }
  }
  
  // Counts the charactes of the given TreeNode
	public static int countCharacters(TreeNode node) {
    int count = 0;
    
    for (int i = 0; i <= 26; i++) {
      int ASCII = 97;
      char character;
      
			ASCII += i;
			character = (char) ASCII;

			if (node.hasChild(character))
				count++;
		}
			
		return count;
	}

  // Prompts user to get different type of data depending on it's type
  public static void promptUser(String type) {
    if (type.equals("size"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter String Number > ");
    else if (type.equals("insert"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert String > ");
    else if (type.equals("select"))
			System.out.print("[" + simpleDate.format(timestamp) + "]" + " Select Character > ");
    else
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter Position > ");
  } 

  // Displays a dividing lines for every operation for proper formatting
  public static void divider() {
		System.out.println("\n------------------------------------------\n");
  }

  // Prints an successful message depending on the passed argument
	public static void displaySuccessfulMessage(String message) {
    System.out.println(message);
  }

  // Prints an error message depending on the passed argument
  public static void displayErrorMessage(String message) {
    System.out.println("\nError: " + message);
  }

	// Prints an informational messages
	static {
		System.out.println("SUFFIX TREE");
		System.out.println("Finals Laboratory Activity One");
		System.out.println(new Timestamp(date.getTime()) + " GMT+8 Philippine Standard Time\n");
	}
}

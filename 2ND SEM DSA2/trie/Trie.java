import java.util.Scanner;

// this is the class of Trie
public class Trie {

  private static class Node {
    // instance of datatype that we needed in the program
    private char character;
    private Node[] children;
    private boolean isEndOfWord;

    // parametarized constructor that creates a node with initial data specified by
    // the parameter
    public Node(char character) {
      this.character = character;
      this.children = new Node[26];
      this.isEndOfWord = false;
    }
  }

  private Node root;

  public Trie() {
    this.root = new Node('\0');
  }

  // this is the function for adding a word to the trie
  public void addWord(String word) {
    Node currentNode = this.root;
    // The character in the String is 1 by 1 added in the trie
    for (char c : word.toCharArray()) {
      int index = c - 'a';
      if (currentNode.children[index] == null) {
        currentNode.children[index] = new Node(c);
      }
      // putting the chracter in the trie
      currentNode = currentNode.children[index];
    }
    currentNode.isEndOfWord = true;
  }

  // this function is for traversing the Node of trei
  public void traverse(Node node) {
    if (node.isEndOfWord) {
      System.out.print(node.character);
    }
    for (Node child : node.children) {
      if (child != null) {
        traverse(child);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // this prompt asking the user to input the size or how many String
    System.out.print("How many strings? ");
    int numStrings = scanner.nextInt();

    // this for loop is for putting the Strings in the array of String
    String[] strings = new String[numStrings];
    for (int i = 0; i < numStrings; i++) {
      System.out.print("Enter a string: ");
      strings[i] = scanner.next();
    }
    // creating the object of trie
    Trie trie = new Trie();

    for (String string : strings) {
      // calling the function of trie which is addWord() and putting the String or
      // word that the user inputted
      trie.addWord(string);
    }
    // displaying that the trie is created
    System.out.println("Standard trie created!");

    // this while loop is for traversing the trie
    // asking the user to choice a input
    // and it will only stop when the user Choice N or no
    while (true) {

      System.out.print("Select child from root node (b,s): ");
      char childChar = scanner.next().charAt(0);
      if (childChar == '\0') {
        break;
      }

      Node childNode = trie.root.children[childChar - 'a'];
      // this if statement is for checking if the childNode or the user's search is
      // null or non in the trie
      if (childNode == null) {
        System.out.println("Invalid child character");
        continue;
      }
      // this line will display the outcome of search
      System.out.print("Display: ");
      trie.traverse(childNode);

      System.out.println();

      // asking the user to tru again
      // if yes or Y the loop will proceed
      // if no or N the program will terminate
      System.out.print("Try again? ");
      System.out.println("Y= yes, N=no");
      String answer = scanner.next();
      if (answer.equals("N") || answer.equals("n")) {
        break;
      }
    }
  }
}
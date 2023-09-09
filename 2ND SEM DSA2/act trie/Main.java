import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Get the number of strings from the user.
        System.out.println("How many strings? ");
        int numberOfStrings = Integer.parseInt(System.console().readLine());

        // Create a list of strings.
        List<String> strings = new ArrayList<>();

        // Get the strings from the user.
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            strings.add(System.console().readLine());
        }

        // Create a trie.
        Trie trie = new Trie();

        // Add the strings to the trie.
        for (String string : strings) {
            trie.add(string);
        }

        // Display the trie.
        trie.display();

        // Prompt the user to select a child node.
        while (true) {
            System.out.println("Select child from root node (b,s): ");
            char child = System.console().readLine().charAt(0);

            // If the user enters 'q', quit.
            if (child == 'q') {
                break;
            }

            // Display the child node.
            trie.display(child);
        }
    }
}
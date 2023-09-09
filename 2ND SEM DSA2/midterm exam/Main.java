import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static PersistentLinkedList persistentLinkedList;
  public static int data;
	public static int choice;
	public static int position;
  public static Date date = new Date();
  public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
			// Handles potential errors
			try {
				int persistentLinkedListSize = 0;

      // Prompts the user for the size of linked list
      do {
				promptUser("size");
				data = Integer.parseInt(reader.readLine());

				persistentLinkedListSize = data;
      } while (persistentLinkedListSize <= 0);

      persistentLinkedList = new PersistentLinkedList();

      // Prompts the user to insert nodes on the linked list
      for (int i = 0; i < persistentLinkedListSize; i++) {
        promptUser("insert");
        data = Integer.parseInt(reader.readLine());

				persistentLinkedList.addNode(new PersistentNode(data));
				
        persistentLinkedList.setSize(persistentLinkedList.getSize() + 1);
      }

			displaySuccessfulMessage("\nThe linked list has been successfully created.");
			
      divider(1);

        do {
					System.out.println("OPERATIONS");
					System.out.println("[1] ADD NODE");
					System.out.println("[2] DELETE NODE");
					System.out.println("[3] DISPLAY NODES");
					System.out.println("[4] CHANGE VALUE");
					System.out.println("[5] NODE HISTORY");
					System.out.println("[6] LIST HISTORY");
					System.out.println("[7] EXIT");

				// Prompts the user to select an operation
				do {
					promptUser("choice");
					choice = Integer.parseInt(reader.readLine());

          if(choice < 1 || choice > 7)
            displayErrorMessage("Select only the operations available.\n");

				} while (choice < 1 || choice > 7);

				// Inserts a new node on the persistent linked list
				if (choice == 1) {
					promptUser("insert");
					data = Integer.parseInt(reader.readLine());

					persistentLinkedList.addNode(new PersistentNode(data));

					persistentLinkedList.setSize(persistentLinkedList.getSize() + 1);

					displaySuccessfulMessage("\nOperation successful. The node was successfully added.");

					divider(1);
				}

				// Removes a new node on the persistent linked list
				if (choice == 2) {
					if (persistentLinkedList.getSize() == 0)
						displayErrorMessage("Persistent linked list is currently empty. Push at least one node first.\n");
					else {
            do {
              promptUser("position");
              position = Integer.parseInt(reader.readLine());

              if (position <= 0 || position > persistentLinkedList.getSize())
                displayErrorMessage("Position must be greater than or equal to 1 but not higher than the current size.\n");
						} while (position <= 0 || position > persistentLinkedList.getSize());
						
						persistentLinkedList.deleteNode(position);

						persistentLinkedList.setSize(persistentLinkedList.getSize() - 1);

						displaySuccessfulMessage("\nOperation successful. The node was successfully deleted.");
					}

					divider(1);
				}

				// Displays all of the nodes of the persistent stack
				if (choice == 3) {
					if (persistentLinkedList.getSize() == 0)
						displayErrorMessage("Persistent linked list is currently empty. Push at least one node first.");
					else {
						persistentLinkedList.displayNodes();

						displaySuccessfulMessage("\n\nOperation successful. All nodes was successfully retrieved.");
					}

					divider(1);
				}

				// Changes the value of a node of the persistent stack
				if (choice == 4) {
					if (persistentLinkedList.getSize() == 0)
						displayErrorMessage("Persistent linked list is currently empty. Push at least one node first.\n");
					else {
						do {
							promptUser("position");
							position = Integer.parseInt(reader.readLine());

							if (position <= 0 || position > persistentLinkedList.getSize())
								displayErrorMessage(
										"Position must be greater than or equal to 1 but not higher than the current size.\n");
						} while (position <= 0 || position > persistentLinkedList.getSize());

						promptUser("update");

						data = Integer.parseInt(reader.readLine());

						persistentLinkedList.changeValue(position, data);

						displaySuccessfulMessage("\nOperation successful. The node was successfully updated.");
					}
					
					divider(1);
				}

				// Displays the history of a node of the persistent stack
				if (choice == 5) {
					if (persistentLinkedList.getSize() == 0)
						displayErrorMessage("Persistent linked list is currently empty. Push at least one node first.\n");
					else {
						do {
							promptUser("position");
							position = Integer.parseInt(reader.readLine());

							if (position <= 0 || position > persistentLinkedList.getSize())
								displayErrorMessage(
										"Position must be greater than or equal to 1 but not higher than the current size.\n");
						} while (position <= 0 || position > persistentLinkedList.getSize());

						persistentLinkedList.nodeHistory(position);

						displaySuccessfulMessage("\nOperation successful. The node was successfully retrieved.");
					}

					divider(1);
				}

				// Displays the value of all nodes of the persistent stack
				if (choice == 6) {
					if (persistentLinkedList.getSize() == 0)
						displayErrorMessage("Persistent linked list is currently empty. Push at least one node first.");
					else {
						persistentLinkedList.listHistory();

						displaySuccessfulMessage("\n\nOperation successful. All nodes was successfully retrieved.");
					}
					
					divider(1);
				}

				if(choice == 7)
					displaySuccessfulMessage("\nApplication closed. Thank you.\n");
				
      } while (choice >= 1 && choice <= 6);
    } catch (Exception error) {
      	System.out.println("Appropriate numerical characters are only allowed. Please restart the application");
    }
  }

  // Prompts user to get different type of data depending on it's type
  public static void promptUser(String type) {
    if (type.equals("size"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter Persistent Linked List Size $ ");
    else if (type.equals("insert"))
			System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert Persistent Linked List Element $ ");
    else if (type.equals("update"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Insert Persistent Linked List New Value $ ");
    else if (type.equals("choice"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Select An Operation $ ");
    else if (type.equals("position"))
      System.out.print("[" + simpleDate.format(timestamp) + "]" + " Enter Position $ ");
  }

  // Displays a dividing lines for every operation for proper formatting
  public static void divider(int spacing) {
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
		System.out.println("PERSISTENT LINKED LIST");
		System.out.println("Midterm Laboratory Exam");
		System.out.println(new Timestamp(date.getTime()) + " GMT+8 Philippine Standard Time\n");
	}
}

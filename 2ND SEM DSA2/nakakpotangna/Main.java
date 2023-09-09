import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListStack stack = new LinkedListStack();

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    stack.displayHistory();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
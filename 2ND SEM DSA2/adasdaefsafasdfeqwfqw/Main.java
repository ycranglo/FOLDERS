import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int setNum[] = new int[10];
  public static int choice;
  public static int numbers;
  public static int union1;
  public static int union2;
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws NumberFormatException, IOException {

    UnionFind union = new UnionFind();

    System.out.println("Please enter 10 number to form a set :");

    for (int a = 0; a < 10; a++) {
      setNum[a] = numbers = Integer.parseInt(reader.readLine());
    }
    try {
      do {
        System.out.println("choice a operation :");
        System.out.println("[1] Union");
        System.out.println("[2] Find");
        System.out.println("[3] Exit");
        System.out.print(">");
        do {
          choice = Integer.parseInt(reader.readLine());
          System.out.print(">");
        } while (choice < 1 || choice > 3);

        if (choice == 1) {
          System.out.println("Enter first number for Union operation:");
          System.out.print(">");
          union1 = Integer.parseInt(reader.readLine());
          while (checkSet1(union1)) {
            System.out.println("The number is not paart of the set,try again:");
            System.out.print(">");
            union1 = Integer.parseInt(reader.readLine());
          }
          System.out.println("Enter Second number for Union operation:");
          System.out.print(">");
          union2 = Integer.parseInt(reader.readLine());
          while (checkSet1(union2)) {
            System.out.println("The number is not paart of the set,try again:");
            System.out.print(">");
            union2 = Integer.parseInt(reader.readLine());
          }
          union.Union(union1, union2);
          System.out.println("Operation successful!");
        }

        if (choice == 2) {
          System.out.println("Enter first number for Find operation:");
          System.out.print(">");
          union1 = Integer.parseInt(reader.readLine());
          System.out.println("Enter second number for Find operation:");
          System.out.print(">");
          union2 = Integer.parseInt(reader.readLine());
          System.out.println("The Two Numbers are connected :" + union.UnionFindd(union1, union2));
        }

      } while (choice == 1 || choice == 2);
    } catch (Exception error) {
      System.out.println("invalid inputs,try again");
    }
    System.out.println("thank you");

  }

  static {
    System.out.println("Data Structures and Algorithms 2");
    System.out.println("Prelim Lab Exam");
    System.out.println();
    System.out.println();
  }

  public static boolean checkSet1(int num1) {
    boolean checkNum1 = true;
    for (int i = 0; i < setNum.length; i++) {
      if (num1 == setNum[i]) {
        checkNum1 = false;
      }
    }
    return checkNum1;
  }
}

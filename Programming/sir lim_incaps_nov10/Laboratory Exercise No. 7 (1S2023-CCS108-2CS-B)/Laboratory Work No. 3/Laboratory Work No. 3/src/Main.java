import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    Student stud= new Student();

    System.out.println("ENTER YOUR FULLNAME :");
    System.out.print(">");
    stud.setFullname(reader.readLine());
    System.out.println("ENTER YOUR AGE :");
    System.out.print(">");
    stud.setAge(Integer.parseInt(reader.readLine()));
    System.out.println("ENTER YOUR GWA :");
    System.out.print(">");
    stud.setGPA(Double.parseDouble(reader.readLine()));
    System.out.println();
    stud.displayDetails();

  }
}

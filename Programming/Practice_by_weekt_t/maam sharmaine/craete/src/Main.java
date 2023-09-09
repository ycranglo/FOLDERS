import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
  public static void main(String args[]) throws IOException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("ENTER YOUR FIRSTNAME :");
     String fname=reader.readLine();
     System.out.println("ENTER YOUR LASTNAME :");
     String lname=reader.readLine();
     System.out.println("ENTER YOUR AGE :");
     int age=Integer.parseInt(reader.readLine());
     System.out.println("ENTER YOUR number :");
     float number=Float.parseFloat(reader.readLine());

     Person person= new Person();
     Person person2= new Person(fname, lname);
     Person person3 = new Person(fname, lname, number);
     Person person4 = new Person(age, number);
     Person person5 = new Person(fname, lname, age);
     Person person6 = new Person(fname, lname, age, number);

     person2.greet();
     person3.introduce();
     person6.smallTalks();
     person2.mylastName();
     person3.myNumber();







  }
}

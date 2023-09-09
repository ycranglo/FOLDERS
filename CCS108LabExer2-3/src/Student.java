import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
  public  String name;
  public  String addresss;
  public   int yr;
  public   int month;
  public   int day;
  public   String email;
  public   int grade;

public static void main (String args[]) throws IOException{

  Student CCE = new Student();

  BufferedReader read= new BufferedReader( new InputStreamReader (System.in));

  System.out.println("Enter your name  :");
  
  CCE.name= read.readLine();

  System.out.println("Enter your address  :");
  
  CCE.addresss= read.readLine();
  System.out.println("Enter your birth year  :");
  
  CCE.yr=  Integer.parseInt(read.readLine());
  System.out.println("Enter your  birth Month  :");
 
  CCE.month=  Integer.parseInt(read.readLine());
  System.out.println("Enter yourday of birth :");
 
  CCE.day=  Integer.parseInt(read.readLine());
  System.out.println("Enter your email  :");
 
  CCE.email= read.readLine();
  System.out.println("Enter your grade  :");
 CCE.grade= Integer.parseInt(read.readLine());

 System.out.println();
 System.out.println("------------------------------------------------------");
System.out.println("NAME  :"+CCE.name+"\n"
                 +"ADDRESS  :"+CCE. addresss+"\n"
                 +"BIRTHDAY  :"+CCE.month+"/"+CCE.day+"/"+CCE.yr+"\n"+
                  "EMAIL  :"+CCE.email+"\n"+
                  "GRADE  :"+CCE.grade); 
 System.out.println("------------------------------------------------------");
}
}

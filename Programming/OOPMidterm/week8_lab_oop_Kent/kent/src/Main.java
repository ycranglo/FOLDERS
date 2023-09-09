import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
  
  public static String manufacturer;
  public static String model;
  public static String simCardNumber;
  public static int balance;
  public static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
  public static void main(String args[]) throws IOException{

    BasicPhone phone;
     //randomAccountNumber for simcardNumber
     Random random = new Random();
     int RandomAccountNumber = random.nextInt(1000000000); 
     //getter the input of the users

    System.out.println("WELCOME IN BASIC PHONE!");
    System.out.println("PLEASE ENTER YOUR MANUFACTURER");
    manufacturer=reader.readLine();
    System.out.println("");
    System.out.println("PLEASE ENTER YOUR MODEL OF YOUR PHONE");
    model=reader.readLine();
    System.out.println("");
    System.out.println("YOUR SIM CARD NUMBER IS : ");
    simCardNumber="09"+RandomAccountNumber+"";
    System.out.println(simCardNumber);
    


    

    

  }
}

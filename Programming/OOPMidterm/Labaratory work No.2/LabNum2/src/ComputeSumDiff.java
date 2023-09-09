import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeSumDiff {
  public static int num1;
  public static int num2;

public static void main(String args[]) throws NumberFormatException, IOException{

  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("ENTER 1ST NUMBER");
num1=Integer.parseInt(reader.readLine());

System.out.println("ENTER 2ND NUMBER");
num2=Integer.parseInt(reader.readLine());

ShowResult();

  //method for calculating the sum of 2 number
} static int sum(int num1, int num2){
  
  return num1+num2;

   //method for calculating the diff of 2 number
}static int diff(int num1, int num2){
  return num1-num2;

  //method for displaying the result of 2 number 
}static void ShowResult(){
  System.out.println();
  System.out.println("------------------------------------------");
  System.out.println("THE SUM OF 2 NUMBER IS  :"+sum(num1, num2));
  System.out.println("------------------------------------------");
  System.out.println("THE DIFF OF 2 NUMBER IS  :"+diff(num1, num2));
  System.out.println("------------------------------------------");
}
}

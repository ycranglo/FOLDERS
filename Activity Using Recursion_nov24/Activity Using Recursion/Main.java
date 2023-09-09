import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  //intance of the variables that we need in the program
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public static int data;

  public static void main(String[] args) throws NumberFormatException, IOException {
    // CREATED BY :Yocor, Angelo T
    // DATE CREATED :NOV 24,2022
    // Activity Using Recursion
    System.out.println("CREATED BY :Yocor, Angelo T");
    System.out.println("DATE CREATED :NOV 24,2022");
    System.out.println("ACTIVITY USING RECURSION");
    System.out.println();

    //asking the user to input a number
    System.out.println("ENTER A NUMBER");
    data = Integer.parseInt(reader.readLine());
    System.out.println();
    System.out.println();
    //printing the result of the square number
    //calling the square method
    System.out.println("THE SQUARE OF NUMBER IS :" + square(data));

  }
  //this is the method for the square
  //that have a parameter of data or int
  public static int square(int data) {
    //this is the case base of our method
    if(data == 0){
      return 0;
  }else{
    //
      return ((square(data-1)+ (2*data)-1));
  }
}
}

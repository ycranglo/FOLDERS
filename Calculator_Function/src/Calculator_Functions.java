import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator_Functions {    

   static int a;
   static double first_term;
   static double second_term;
   static double ANSWER;
   static BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
          
        public static void main(String[] args) throws NumberFormatException, IOException  {
        
            Display();


        } static double sum() throws NumberFormatException, IOException{
        System.out.print("enter first number");
        first_term=Double.parseDouble(read.readLine());
        System.out.print("enter second number");
        second_term=Double.parseDouble(read.readLine());
        ANSWER=first_term+second_term;
        System.out.println();
            return ANSWER;   

        }static double subtract() throws NumberFormatException, IOException{
            System.out.print("enter first number");
            first_term=Double.parseDouble(read.readLine());
            System.out.print("enter second number");
            second_term=Double.parseDouble(read.readLine());
            ANSWER=first_term-second_term;
            System.out.println();
            return ANSWER;

        }static double divide() throws NumberFormatException, IOException{
            System.out.print("enter first number");
            first_term=Double.parseDouble(read.readLine());
            System.out.print("enter second number");
            second_term=Double.parseDouble(read.readLine());
            ANSWER=first_term/second_term;
            System.out.println();
            return ANSWER;

        }static double multiply() throws NumberFormatException, IOException{
            System.out.print("enter first number");
            first_term=Double.parseDouble(read.readLine());
            System.out.print("enter second number");
            second_term=Double.parseDouble(read.readLine());
            ANSWER=first_term*second_term;
            System.out.println();
            return ANSWER;
        } static void Display() throws NumberFormatException, IOException{
            do{
                System.out.println("---enter your operations---");
                System.out.println("One for add");
                System.out.println("two for subtract");
                System.out.println("three for divide");
                System.out.println("four for multiply");
                System.out.println("five for exit the program");
                System.out.println(" ----------------------- ");
                a=Integer.parseInt(read.readLine());
                if( a==1) {
                   System.out.println("the asnwer is "+sum());
                }else if( a==2) {
                    System.out.println("the asnwer is "+subtract());
            }  if( a==3) {
                System.out.println("the asnwer is "+sum());
             }else if( a==4) {
               
                System.out.println("the asnwer is "+ multiply());
            
            }if(a>5){
                a=5;
            }
            
            }while(a!=5);
            System.out.println("EXITED FORM THE PROGRAM");
        }
    
    }


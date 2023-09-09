import java.io.BufferedReader;
import java.io.InputStreamReader;



public class App {
    static int prime;
    static int not;

    public static void main(String[] args) throws Exception {
       

int [] array;
int n;




         BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER A THE SIZE");
         n= Integer.parseInt(read.readLine());
         array=new int[ n];


       
         for(int a=0;a<array.length;a++){
           
            System.out.println("ENTER A NUMBER");
            array[a]= Integer.parseInt(read.readLine());

         }
         System.out.println("-----------------------------------------------------------------------------");
         for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1){
                isPrime = false;
               
            }   
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        not++;
                        isPrime = false;
                        break;
                    }
                }
            }
            // print the number
            if (isPrime){
                if (array[i] == 0){
                   
                }
                else {
                    prime++;
                }
        }
    
    }
        System.out.println("prime number count :"+prime);
        System.out.println("not prime number count :"+not);
    }
     }


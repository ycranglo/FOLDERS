import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int size;
  public static int array[];
  public static String duplicate;
  public static  Integer currVal;       
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER A SIZE");
    size=Integer.parseInt(reader.readLine());
    array=new int[size];
    System.out.println("ENTER THE VALUES");
    for(int a=0;a<size;a++){
      array[a]=Integer.parseInt(reader.readLine());
    }
      for(int i = 0;  i <size; i++){              
         currVal = array[i];                     
        int count = 1;                                  
        if(currVal != null){                        
            for( int j = i + 1; j < size; j++){   
                if(array[j] == currVal){              
                    count++;    
                    d();     
                } 
                
            }
            System.out.print("Number : "  + currVal + "  Count : " + count + "\n");
        }
      }
    }
public static void d(){
  System.out.println(currVal);
}
  }
  


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCS108LabExerOne_Three {
    
        public static int size;
        public static int[] myArray= new int[size];
       
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        public static void main(String[] args, Object inputArray) throws Exception {
    
    
            inputArray();
            voiddisplayArray(size);
    
    
        } 
        
        public static int inputArray() throws NumberFormatException, IOException{
    System.out.println("enter a size of array :");
    size = Integer.parseInt(reader.readLine());
    return size;
    
    
    
        }public static void voiddisplayArray(int size2) throws NumberFormatException, IOException{
            for(int i=0; i<myArray.length; i++) {
                System.out.print("\nEnter a number: ");
                myArray[i] = Integer.parseInt(reader.readLine());
                }
    
        }
    }


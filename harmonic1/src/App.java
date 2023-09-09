import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
   
        static int N;
         static double harmonic;

    public static void main(String[] args) throws Exception {
        
      
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER  :");
        N = Integer.parseInt(reader.readLine());  
        
        harmonicSum();
        
    }  static void harmonicSum(){
        
        while(N > 0){
            // harmonic is the storage value for answer
            //1+1/1+1/2+1/3+1/4
            harmonic+=1.0/N;
            N--;
        }
       DecimalFormat RoundFormat= new DecimalFormat("0.00");
       String rounded=RoundFormat.format(harmonic);
        System.out.println("harmonic series is    :"+rounded);
    }
    }


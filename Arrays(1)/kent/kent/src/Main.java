import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  
  public static int size;
  public static int array[];
  public static String duplicate;
  public static int uniques[];
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER A SIZE");
    size=Integer.parseInt(reader.readLine());
    array=new int[size];

    System.out.println("ENTER THE VALUES");
    for(int a=0;a<size;a++){
      array[a]=Integer.parseInt(reader.readLine());
    }
    
    System.out.println();
    System.out.print("Values with duplicates :");
    for(int j=0;j<size;j++){
      for(int k=j+1;k<size;k++){
        if(array[j]==array[k]){
          duplicate=array[k]+", ";
          System.out.print(duplicate);
       }
    }
  } 
  Arrays.sort(array);     
  int i=0;
  System.out.println("Unique Elements in array:");
  while(i<array.length)
  {
      if(array[i]!=array[i+1])
      {
          System.out.println(array[i]);
      }
      i=i+2;
  }
 
  }
}
  


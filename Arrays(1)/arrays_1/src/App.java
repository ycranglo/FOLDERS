


public class App {

    
    static int size;
    public static void main(String[] args) throws Exception {
        


        int[] numbers = {6,3,-4,1,-5};
        //0
        for(int i=0; i<numbers.length-1; i++){
            
        numbers[i+1] = ++numbers[i] + numbers[i+1];
        System.out.print(numbers[i]+" ");

     
        }
    }
    }


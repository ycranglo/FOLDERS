
  //Created by: YOCOR, ANGELO T
  // Date Created: 10/27/22
  // Activity Using Stack
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  public class Main {
    public static int arraySize;
    public static int[] array;
    public static int choice;
    public static int countIndex=0;
    public static int push;
    public static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException {
    try{
      System.out.println("ENTER THE SIZE OF THE ARRAY :");
      System.out.print(">");
      arraySize=Integer.parseInt(reader.readLine());
      array=new int[arraySize];
      divided();
      do{
        //this is for the selecting the operations
        System.out.println("PLEASE ENTER A OPERTION :");
        System.out.println("[1] PUSH");
        System.out.println("[2] POP");
        System.out.println("[3] PEEK");
        System.out.println("[4] IS EMPTY");
        System.out.println("[5] IS FULL");
        System.out.println("[6] EXIT");
        divided();
        do{
          //this is the error handling if the user not choose the operation 1-6
          System.out.print(">");
          choice=Integer.parseInt(reader.readLine());
          if(choice<=0 || choice>6){
            System.out.println("PLEASE ENTER A VALID OPERATION");
          }
        }while(choice<=0 || choice>6);
        //if the user choose 1 or push,this code is for adding a element in the array stack
        if(choice==1){
          //calling the method for push
          push();
          displayArray();
          divided();
        }
        //if the user choose 2 or pop,this code is for deleting a element in the array stack
        if(choice==2){
          pop();
          displayArray();
          divided();
        }
         //if the user choose 3 or peek,it will return the last element
        if(choice==3){
          peek();
          divided();
          }
         //if the user choose 4 or isEmpty,it checks if the stack is empty
        if(choice==4){
          isEmpty();
          divided();
        }
         //if the user choose 5 or full,it checks if the stack is full
        if(choice==5){
          isFull();
          divided();
        }
      }while(choice==1||choice==2||choice==3||choice==4||choice==5);
        System.out.println("*EXITED THE PROGRAM*");
    } catch (Exception error) {
        System.out.println("PLEASE ENTER A VALID INPUT, PLEASE TRY AGAIN.");
        }
    }
    public static void divided(){
      System.out.println("-----------------------------------------------");
    }
    //method for the push operaation
    public static void push() throws NumberFormatException, IOException{
      //checks if the array is not full
      if(countIndex<array.length){
        System.out.println("PLEASE ENTER A NUMBER :");
        System.out.print(">");
        array[countIndex] =Integer.parseInt(reader.readLine());
        countIndex++;
        divided();
        //if the array is full
      }else{
        System.out.println("THE ARRY IS FULL");
        divided();
      }
    }
    public static void pop(){
      if(countIndex==0){
        System.out.println("NO ELEMENT TO DELETE");
      }else{
        //creating a temporary array to hold the values
       //creating the size of tempArray by countIndex-1
        int tempArray[]=new int[countIndex-1];
        //traversing the array
        for(int a=0;a<tempArray.length;a++){
          //moving the element of  the array to the tempArray
          //and leaving the last element of the array
          tempArray[a]=array[a];
        } 
        //travering the array
        for(int b=0;b<tempArray.length;b++){
          //moving the element of the tempArray to array
          array[b]=tempArray[b];
        }
        //decrement the count of the index 
        countIndex--;
        System.out.println("THE LAST ELEMENT HAS BEEN DELETED");
    }
  }
  //this is the method for the displaying the element of the array
    public static void displayArray(){
      System.out.print("\n"+"THE ELEMENTS OF THE ARRAY ARE :");
      //traverse and display all off the element of the array
      for(int c=0;c<countIndex;c++){
        System.out.print(array[c]+" ");
      }
      System.out.println("");
    }
    //method for peek or returning the last or top element
    public static void peek(){
      if(countIndex==0){
        System.out.println("NO TOP ELEMENT FOUND");
      }else{
      System.out.println("THE LAST TOP ELEMENT IS :"+array[countIndex-1]);
      }
    }
    public static void isEmpty(){
      //cheking if the count is equal to 0 or empty
      if(countIndex==0){
        System.out.println("THE STACK IS EMPTY");
      }else{
        System.out.println("FALSE");
      }
    }
    public static void isFull(){
       //cheking if the count is equal to the size of the array
      if(countIndex==arraySize){
        System.out.println("THE STACK IS FULL");
      }else{
        System.out.println("FALSE");
      }
    }
  }

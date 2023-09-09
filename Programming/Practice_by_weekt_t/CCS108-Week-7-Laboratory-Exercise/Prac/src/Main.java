import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;   

public class Main {

  static String AccountName;
  static int choice;
  static int deposit;
  static int withdraw;
  static int tempbalance;
  static int temp2Balance;

  
  
  
  public static void main(String args[]){
    //randomAccountNumber for Bank Account
    Random random = new Random();
    int RandomAccountNumber = random.nextInt(100000000); 
    //getter the input of the users
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    //casting the object of Bankaccount
   BankAccount account= new BankAccount(RandomAccountNumber, AccountName);
   try{
    System.out.println("--------------------------------------------------");
    System.out.println("WELCOME TO KENT'S BANKO DI INFALTION");
    System.out.println("PLEASE LOGIN YOUR ACCOUNT");
    System.out.println("--------------------------------------------------");
    System.out.println("ENTER YOUR ACCOUNT NAME");
    AccountName=reader.readLine();
    System.out.println("YOUR ACCOUNT NUMBER IS :"+RandomAccountNumber);
     account= new BankAccount(RandomAccountNumber, AccountName);
     System.out.println("--------------------------------------------------");

    do{
    
      System.out.println("PLEASE SELECT A OPTION");
      System.out.println("1 :DEPOSIT");
      System.out.println("2 :WITHDRAW");
      System.out.println("3 :EXIT PROGRAM");
      choice=Integer.parseInt(reader.readLine());
     
      

         if(choice==1){
          do{
          System.out.println("YOUR ACCOUNT BALANCE IS  :"+account.getAccountBalance()+" ₱");
          System.out.println("ENTER YOUR AMOUNT YOU WANT TO DEPOSIT :");
          deposit=Integer.parseInt(reader.readLine());
          tempbalance+=tempbalance+deposit;
          account.setDepositAccountBalance(tempbalance);
          System.out.println("YOUR BALANCE NOW IS :"+account.getAccountBalance()+" ₱");
          System.out.println("--------------------------------------------------");
          //checking if the deposit is greater than 0
          if(deposit<0){
            System.out.println("PLEASE ENTER A AMOUNT GREATER THAN 0");
          }
          }while(deposit<0);

        }
        else if(choice==2){
          do{
            System.out.println("YOUR ACCOUNT BALANCE IS  :"+account.getAccountBalance()+" ₱");
            System.out.println("ENTER YOUR AMOUNT YOU WANT TO WITHDRAW :");
            withdraw=Integer.parseInt(reader.readLine());
            temp2Balance=tempbalance-withdraw;
            account.setDepositAccountBalance(temp2Balance);
            System.out.println("YOUR BALANCE NOW IS :"+account.getAccountBalance()+" ₱");
            System.out.println("--------------------------------------------------");
            if(withdraw>account.getAccountBalance()){
              System.out.println("PLEASE ENTER A AMOUNT LESSTHAN OR EQUAL TO YOUR BALANCE");
            }
          }while(withdraw>account.getAccountBalance());
         

         }else{
          choice=3;
         }
      
    }while(choice==1||choice==2);
    account.DisplayDetails();
   } catch (Exception error) {
    // displays: error message
    System.out.println("Error: Invalid input. Restart the application.");
  }



  }
}

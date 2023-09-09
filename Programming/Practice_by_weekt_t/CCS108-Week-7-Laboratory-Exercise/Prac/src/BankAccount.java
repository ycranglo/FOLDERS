public class BankAccount {

  //classfileds

  private int accountNumber;
  private String accountName;
  private int accountBalance;

  //clas parameter
  public BankAccount(int accountNumber,String accountName){
    this.accountNumber=accountNumber;
    this.accountName=accountName;
  }
//methods
//getters methods
public int getAccountNumber(){
  return this.accountNumber;
}
public String getAccountName(){
  return this.accountName;
}
public int getAccountBalance(){
  return this.accountBalance;
}
  //setters methods
  public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
  }
  public void setAccountName(String accountName){
    this.accountName=accountName;
  }
  public void setDepositAccountBalance(int accountBalance){

    this.accountBalance=accountBalance;
  }
  public void DisplayDetails(){
    System.out.println("--------------------------------------------------");
    System.out.println("ACCOUNT DEATAILS");
    System.out.println("ACCOUNT NAME :"+accountName);
    System.out.println("ACCOUNT NUMBER :"+accountNumber);
    System.out.println("ACCOUNT BALANCE :"+getAccountBalance());
    System.out.println("THANK YOU FOR USING OUR KENT'S BANKO DI INFALTION! ");
  }


}

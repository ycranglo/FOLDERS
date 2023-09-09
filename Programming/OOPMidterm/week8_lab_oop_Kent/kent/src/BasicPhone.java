
public class BasicPhone{
 
  private String manufacturer;
  private String model;
  private String simCardNumber;
  private int balance;

  public BasicPhone(String manufacturer, String model,String simCardNumber){
this.manufacturer=manufacturer;
this.model=model;
this.simCardNumber=simCardNumber;
  }
  //getters and setters

  public void setManufactorer(String manufacturer){
    this.manufacturer=manufacturer;
  }
  public void setmodel(String model){
    this.model=model;
  }
  public void setSimCardNumber(String simCardNumber){
    this.simCardNumber=simCardNumber;
  }
  public void setBalance(int balance){
    this.balance=balance;
  }
  public String getManufacturer(){
    return manufacturer;
  }
  public String getmodel(){
    return model;
  }
  public String getSimCardNumber(){
    return simCardNumber;
  }
  public int getBalance(){
    return balance;
  }
  public void displayPhone(){
    System.out.println("MANUFACTURER :"+getManufacturer());
    System.out.println("PHONE MODEL :"+getmodel());
    System.out.println("YOUR SIMCARD NUMBER IS "+getSimCardNumber());
    System.out.println("YOUR BALANCE IS :"+getBalance());
  }
}
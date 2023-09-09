    //we use extend method to extend the attributes of class person to class emplopyee
public class Employee extends Person{
  //classfields
  private int empNum;
  private double hourlyPay;

  public Employee(){
  }
  public Employee(String lname,String fname,double hieght,int empNum,double hourlyPay){
    //use super method to call the constructor of Persoon class
    super(fname, lname, hourlyPay);
    this.empNum=empNum;
    this.hourlyPay=hourlyPay;
  }
  //seters 
  public void setEmpNum(int empNum){
    this.empNum=empNum;
  }
  public void setHourPay(double hourlyPay){
    this.hourlyPay=hourlyPay;
  }
  //getters
  public double getHourPay(){
    return this.hourlyPay;
  }
  public int getEmpNum(){
    return this.empNum;
  }
  public double getRaise(){
    this.hourlyPay=hourlyPay*0.15;
    return hourlyPay;
  }
  //this is the method for the payday
  public double payDay(){
    //if the hourpay is less than 40,this block of code will be execute
    if(hourlyPay>40){
      hourlyPay= hourlyPay*1.5;
  }
  return hourlyPay;
}
  //to String method that we overrride from Person class
  public void toStringg(){
    //we use super method to call the toStringg mothod of class Person
    super.toStringg();
    System.out.println();
    System.out.println("THEY MAKE $"+String.format("%.2f",+hourlyPay));
    System.out.println("THEY HAVE EMPLOYEE NUMBER :"+empNum);
    System.out.println("------------------------------");
  }
  public static boolean equals(Employee emp1,Employee emp2){
    if(emp1.empNum==emp2.empNum && emp1.getLname()==emp2.getLname()){
      return true;
    }
    return false;
  }
}

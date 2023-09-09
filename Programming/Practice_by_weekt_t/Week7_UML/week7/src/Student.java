public class Student {
  
  private int id;
  private String firstname;
  private String lastName;

  public Student(){

  }
  public Student(int id,String firstName){
    this.id=id;
    this.firstname=firstName;

  }
  public Student(String firstName,String lastName){

    this.firstname=firstName;
    this.lastName=lastName;
  }
  public Student(int id,String firstName,String lastName){
    this.id=id;
    this.firstname=firstName;
    this.lastName=lastName;


  }
  public int getId(){
    
    return this.id;
  }
  public String getFirstName(){
    return this.firstname;
  }
  public String getLastName(){
    return this.lastName;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setFirstName(String firstName){
    this.firstname=firstName;
  }
  public void setLasName(String lastName){
    this.lastName=lastName;
  }

  public void DisplayInfo(){
    System.out.println("Student id"+this.id);
    System.out.println("Student First Name"+this.firstname);
    System.out.println("Student Last Name"+this.lastName);
    System.out.println("Student Fullname"+getfullName());
    
  }
  public String getfullName(){

    return this.firstname+"  " +this.lastName;
  }
public void PayTuition(double amount){
  System.out.println("amount payedd"+amount);
}

}

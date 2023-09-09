public class Parent{
  private String firstName;
  private String lastName;
  private int age;

  public Parent(){
  }
  public Parent(String firstName,String lastName, int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
  }
  public void setFirstName(String firstName){
    this.firstName=firstName;
  }
  public void setLastName(String lastName){
    this.lastName=lastName;
  }
  public void setAge(int age){
    this.age=age;
  }
  public String getLastName(){
    return this.lastName;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public int getAge(){
    return this.age;
  }
  public void printDetails(){
    System.out.println("FIRSTNAME :"+this.firstName);
    System.out.println("LASTNAME :"+this.lastName);
    System.out.println("AGE :"+this.age);
  }
}

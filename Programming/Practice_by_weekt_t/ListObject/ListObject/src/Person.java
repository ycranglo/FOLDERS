public class Person {
  
//classfields
  private String firstName;
  private String lastName ;

  //constructors
  public Person(){
  }
  public Person(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }

  //methods for setters
  public void setFirstName(String firstName){
    this.firstName=firstName;
  }
  public void setLastName(String lastName){
    this.lastName=lastName;
  }
  //methods for getters
  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }
  //display fullnamex 
  public void displayFullName(){
    System.out.println("FULLNAME"+this.lastName+", "+this.firstName);
  }
}

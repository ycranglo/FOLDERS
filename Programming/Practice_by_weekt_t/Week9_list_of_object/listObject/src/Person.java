public class Person {
  
  //class fields
  private String firstName;
  private String lastName;

  //constructors

  //default
  public Person(){
  }
  //have a parameter
  public Person(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }
  //setters
  public void setFirstName(String firstName){
    this.firstName=firstName;
  }
  public void setLastName(String lastName){
    this.lastName=lastName;
  }
  //getters
  public String getLastName(){
    return this.lastName;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public String getFullName(){
    return this.firstName+"  "+this.lastName;
  }
}

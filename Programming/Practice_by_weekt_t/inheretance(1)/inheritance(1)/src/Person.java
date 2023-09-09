public class Person {
  

 private int age;
 private  String name;
 private String lastName;


 //display values
  public String getName(){
    return this.name;
 
  }
  public String getLastName(){
    return this.lastName;
  }
  public int getAge(){
    return this.age;
  }
  //getting the values
  public void setName(String name){
    this.name=name;
  }
  public void ssetLastName(String lastName){
    this.lastName=lastName;
  }
  public void setAge(int age){
    this.age=age;
  }

  //method
  public void HelloPerson(){

    System.out.println("hello  "+this.name+this.lastName);
  }
}

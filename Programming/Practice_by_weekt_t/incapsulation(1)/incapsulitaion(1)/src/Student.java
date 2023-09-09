public class Student {
  

  //need to be private to be incapse or adta hidding
  private int age;
  private String name;
  private String course;

  

  // methods or geter seter must be  a public to be accesible to the other classes
  //getter method--access the  is like printing the value but it is have a return type
  public int getAge(){
    return this.age;

  } public String  getName(){
    return this.name;

  } public String getCourse(){
    return this.course;

  }  // setter is a method to set or to put a value,doesnt have return type or void
    public void setAge(int age){
this.age=age;
 } public void setName(String name){
  this.name=name;
 }public void setCourse(String course){
  this.course=course;
 }



}

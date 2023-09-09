public class Student extends Person {

  //classfields
  private String course;
  private int id;

  //constructors
  public Student(){
  }
  public Student(String firstName,String lastName,int id,String course){
    super(firstName,lastName);
    this.id=id;
    this.course=course;
  }
  //methods for setters
public void setId(int id){
  this.id=id;
}
public void setCourse(String course){
  this.course=course;
}
//methyods for getters
public String getCourse(){
  return this.course;
}
public int getId(){
  return this.id;
}
}

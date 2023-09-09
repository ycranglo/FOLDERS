public class Student extends Person {
  //class fields
  private int id;
  private String course;

  //default constructor
  public Student(){
  }
  //have parameters
  public Student(String firstName,String lastName,int id,String course){
    super(firstName,lastName);
    this.id=id;
    this.course=course;
  }
  //setters
  public void setId(int id){
    this.id=id;
  }
  public void setCourse(String course){
    this.course=course;
  }
  //getters
  public String getCourse(){
    return this.course;
  }
  public int getId(){
    return this.id;
  }

}

public class Student {
  //classfields
  private String studFullName;
  private double studfGWA;
  private int studAge;
  //setter and getters of class student
  public void setFullName(String StudentName){
    this.studFullName=StudentName;
  }
  public void setAge(int studentAge){
    this.studAge=studentAge;
  }
  public void setGPA(double studentGWA){
    this.studfGWA=studentGWA;
  }
  public String getStudFullName(){
    return this.studFullName;
  }
  public double getGWA(){
    return this.studfGWA;
  }
  public int getAge(){
    return this.studAge;
  }

}

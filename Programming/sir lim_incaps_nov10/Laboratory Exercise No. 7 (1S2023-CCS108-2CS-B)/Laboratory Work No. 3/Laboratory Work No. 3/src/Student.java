public class Student {
  //classfields 
  private String studFullname;
  private double studGWA;
  private int studAge;

  //setters and getters
  public void setFullname(String studentname){
    this.studFullname=studentname;
  }
  public void setAge(int studentAge){
    //checks if the age is less than -1
    if(studentAge<1){
      System.out.println("ERROR YOUR AGE IS LESSTHAN -1");
      System.exit(0);
    }else{
      this.studAge=studentAge;
    }
  }
  public void setGPA(double studentGWA ){
    //checks of the GWA is less than -1
    if(studentGWA>-1){
      this.studGWA=studentGWA;
    }else{
      System.out.println("ERROR YOUR GPA IS LESSTHAN -1");
      System.exit(0);
    }
  }
  public String getFullName(){
    return this.studFullname;
  }
  public int getAge(){
    return this.studAge;
  }
  public double getGPA(){
    return this.studGWA;
  }
  //method for displaying
  public void displayDetails(){
    System.out.println("STUDENT FULL NAME : "+this.getFullName());
    System.out.println("STUDENT AGE : "+this.getAge());
    System.out.println("STUDENT GWA : "+this.getGPA());
  }
}

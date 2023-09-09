public class Student {
  //classfields
  public String studFullName;
  public int sutdAge;
  public double studGWA;
  public static void main(String[] args) {
    //instance of the object
    Student stud1 = new Student();
    //putting teh values for the classfields
    stud1.studFullName="Juan Dela Cruz";
    stud1.sutdAge=24;
    stud1.studGWA=-3.75;
    //printing the student profile
    
    System.out.println("STUDENT FULL NAME :"+stud1.studFullName+"\n STUDENT AGE :"+stud1.sutdAge+"\n STUDENT GWA :"+stud1.studGWA);
  }
}

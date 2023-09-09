public class Main {
  
  public static void main(String[] args) {
    //casting the object
    Student stud = new Student();
    //setting the values of the classfields of student by calling the setters
    stud.setAge(24);
    stud.setGPA(-3.75);
    stud.setFullName("Juan Dela Cruz");
    //displaying the values by using the getters
    System.out.println("STUDENT FULL NAME :"+stud.getStudFullName());
    System.out.println("Student Age :"+stud.getAge());
    System.out.println("Student GWA :"+stud.getGWA());
  }
}

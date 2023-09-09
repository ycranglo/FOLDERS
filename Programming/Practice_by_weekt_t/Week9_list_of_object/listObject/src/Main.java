import java.util.ArrayList;
import java.util.List;

public class Main {
  
  
public static void main(String[] args) {
  List<Student> listOfStudent = new ArrayList<Student>();
  
 
  listOfStudent.add(new Student("AN GELO", "YOCOR", 0232131, "COM SCIE"));
  listOfStudent.add(new Student("ange", "page", 4534, "COM SCIE"));
  listOfStudent.add(new Student("toto", "banttot", 12435324, "COM SCIE"));
  listOfStudent.add(new Student("toro", "tanga", 890678976, "COM SCIE"));

  for( Student stud: listOfStudent){
    System.out.println(stud.getFirstName()+"  "+stud.getLastName()+"");
  }
  listOfStudent.get(0).setFirstName("potanga");
  System.out.println(listOfStudent.get(0).getFirstName());

  for( Student stud: listOfStudent){
    System.out.println(stud.getFirstName()+"  "+stud.getLastName()+"");
  }

  listOfStudent.get(0).setFirstName("tete");
     System.out.println(listOfStudent.get(0).getFirstName());
     for( Student stud: listOfStudent){
      System.out.println(stud.getFirstName()+"  "+stud.getLastName()+"");
    }
}
}
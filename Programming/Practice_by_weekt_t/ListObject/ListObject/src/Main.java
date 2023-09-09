import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String args[]){

    //declaring a list of object of student
    List<Student> lsitofstudent= new ArrayList<Student>();

    //creating a reusable object
    //multiple declarationg of list(reference object)
    Student stud;

    stud=new Student("angelo","yocor",9,"it");
   //adding the student to teh list
    lsitofstudent.add(stud);

    for(int index=0;index<lsitofstudent.size();index++){
     
      System.out.println(lsitofstudent.get(index).getCourse());
    }



      
 
  }
}

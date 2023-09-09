public class Main {
  

  public static void main(String args[]){

    Student obj1= new Student();
   
   // setting the value of each classfields ussing setter

   obj1.setAge(9);
   obj1.setCourse("ict");
   obj1.setName("angelo");
 
   //displaying teh values from student class using the getter method

   System.out.println("age  :"+obj1.getAge());
   System.out.println("name  :"+obj1.getName());
   System.out.println("age  :"+obj1.getCourse());


  }
}

public class Main {
  public static void main(String[] args) {
    //casting the objects of class Employee
    Employee emp1= new Employee("Yocor", "Angelo", 6, 23, 38);
    Employee emp2= new Employee("Santos", "Yvenne", 5, 143, 12.2);

    //calling the mothods of class Employee
    emp1.getRaise();
    emp1.payDay();
    emp1.toStringg();
    emp2.getRaise();
    emp2.payDay();
    emp2.toStringg();
    //checking if the emp1 and emp2 are the same,if yes it will return true,else false
    System.out.println();
    System.out.println(" are Employee are the same? :"+Employee.equals(emp1,emp2)); 
   
  }
}

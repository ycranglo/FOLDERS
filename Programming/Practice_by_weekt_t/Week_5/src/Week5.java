public class Week5 {
  
//sstatic keyword

//class fields
int id;
String name;

//static variable
static String course="bsit";



public Week5(){
  System.out.println("ito muna lalabas bago say AHAHHAHA");
}


public Week5(int id,String name){

  this();
  this.id=id;
  this.name=name;

  this.Display();

 

} public void Display(){

  System.out.println("id"+this.id);
  System.out.println("name"+this.name);
  System.out.println("course"+course);
}
 
}

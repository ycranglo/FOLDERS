public class Person {
  
  //classfields
  String firstname;
String lastname;
int age;
float number;

//this is the constructors
public Person(String firsname,String lastname,int age,float number){
  this.firstname=firsname;
  this.lastname=lastname;
  this.age=age;
  this.number=number;
}
public Person(String firsname,String lastname,int age){
  this.firstname=firsname;
  this.lastname=lastname;
  this.age=age;
  
}
public Person(String firsname,String lastname,float number){
  this.firstname=firsname;
  this.lastname=lastname;
  this.number=number;
}
public Person(String firsname,String lastname){
  this.firstname=firsname;
  this.lastname=lastname;
}
public Person(int age,float number){
  this.age=-age;
  this.number=number;
}
//default constructor
public Person(){
}
//methods
public void greet(){
  System.out.println("Steve: Hello"+this.firstname+" "+this.lastname);
}
public void introduce(){
  System.out.println("Steve:My name is "+this.firstname+" "+this.lastname);
}
public void smallTalks(){
  System.out.println("Steve:"+this.firstname+""+this.lastname+" dont you think the weather is kinda hot today ?");
  System.out.println("My age is "+this.age+" ,steve.");
}
public void myNumber(){
  System.out.println("My number is "+this.number+" ,steve.");
}
public void mylastName(){
  System.out.println("My lastName is "+this.lastname+" ,steve.");
}
}

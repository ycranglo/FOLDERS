public class Person {

  private String fName;
  private String lName;
  private double height;

  //default constructor
  public Person(){
  }
  //constructor with parameter
  public Person(String Fname, String Lname, double height){
    this.fName=Fname;
    this.lName=Lname;
    this.height=height;
  }
  //setter
  public void setLname(String lname){
    this.lName=lname;
  }
  public void setFname(String fname){
    this.fName=fname;
  }
  public void setHeight(double height){
    this.height=height;
  }
  //getter
  public String getLname(){
    return this.lName;
  }
  public String getFname(){
    return this.fName;
  }
  public double getHeight(){
    return this.height;
  }
  //to String method
  public void toStringg(){
    System.out.println("NAME :"+fName+" "+lName);
    System.out.println("THEY ARE  HEIGHT IN FEET :"+height+" FT");
    System.out.println("THEY ARE  HEIGHT IN FEET :"+String.format("%.2f",+height*12)+" INCHES");
  }
}

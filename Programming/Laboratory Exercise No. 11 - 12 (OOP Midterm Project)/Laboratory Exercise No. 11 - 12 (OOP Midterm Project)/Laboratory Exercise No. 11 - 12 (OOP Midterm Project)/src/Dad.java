public class Dad extends Parent {
  private String job;
  private String hobby;
  private double salary;

  public Dad(){
  }
  public Dad(String firstName,String lastName,int age ,String job,String hobby,double salary){
    super(firstName, lastName, age);
    this.job=job;
    this.hobby=hobby;
    this.salary=salary;
  }
  public void setJob(String job){
    this.job=job;
  }
  public void setHobby(String hobby){
    this.hobby=hobby;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }
  public double getSalary(){
    return this.salary;
  }
  public String getJob(){
    return this.job;
  }
  public String getHobby(){
    return this.hobby;
  }
  public void printDetails(){
    super.printDetails();
    System.out.println("JOB :"+this.job);
    System.out.println("HOBBY :"+this.hobby);
    System.out.println("SALARY :"+this.salary);
    System.out.println("--------------------------");
  }
}

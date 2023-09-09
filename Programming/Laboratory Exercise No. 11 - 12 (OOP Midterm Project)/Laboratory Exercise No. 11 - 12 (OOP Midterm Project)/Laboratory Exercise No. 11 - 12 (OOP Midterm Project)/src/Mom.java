public class Mom extends Parent {
  private String housework;
  private double height;
  private int children;

  public Mom(){
  }
  public Mom(String firstName,String lastName,int age,String housework,double height,int children){
    super(firstName, lastName, age);
    this.housework=housework;
    this.height=height;
    this.children=children;
  }
  public void setJobAtHome(String jobAtHome){
    this.housework=jobAtHome;
  }
  public void setHeight(double height){
    this.height=height;
  }
  public void setChildren(int children){
    this.children=children;
  }
  public int getChildren(){
    return this.children;
  }
  public String gethousework(){
    return this.housework;
  }
  public double getHeight(){
    return this.height;
  }
  public void printDetails(){
    super.printDetails();
    System.out.println("HOUSE WORK : "+this.housework);
    System.out.println("HEIGHT : "+this.height);
    System.out.println("CHILDREN : "+this.children);
    System.out.println("--------------------------");

  }
  
}

public class owner{
  public String name;
  public int ageOwner;
  pet mypet;

  public owner(String name,int ageOwner,pet mypet){
    this.ageOwner=ageOwner;
    this.name=name;
    this.mypet=mypet;
  }

  public void display(){
    System.out.println(this.name);
    System.out.println("pet age :"+this.mypet.age);
    System.out.println(this.ageOwner);
  }
}
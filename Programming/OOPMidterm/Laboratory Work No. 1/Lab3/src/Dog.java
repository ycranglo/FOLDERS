class Dog {
  String color;
String eyecolor;
int height;
int lenght;
int weight;

public Dog(String color,int height,String eyecolor,int lenght,int weight){
this.color=color;
this.height=height;
this.eyecolor=eyecolor;
this.lenght=lenght;
this.weight=weight;

}
public void ShowDetails(){
System.out.println("Dog color:"+this.color);
System.out.println("Dog eye color:"+this.eyecolor);
System.out.println("Dog height:"+this.height+"Inches");
System.out.println("Dog lenght:"+this.lenght+"Inches");
System.out.println("Dog weight:"+this.weight+"Pounds");
}
}
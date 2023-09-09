public class Main {
  
  public static void main(String[] args) {
    pet pet1= new pet("buldog", 23);
    owner owner= new owner("angelo", 12,pet1);

    owner.display();

    final int a=1,b=5;
    for(int p=0;a<b;p++){
      System.out.println("hello");
    }
  }
}

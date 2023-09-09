public class Main {

  public static void main(String[] args) {
    
    Keybord1 keyb1= new Keybord1();
    Keybord2 keyb2= new Keybord2();

    keyb1.color="yellow";
    keyb2.color="red";

    keyb1.rgblights();
    keyb2.BluetoothConnection();

    System.out.println("\n"+keyb1.color);
    System.out.println(keyb2.color);
  }
  
}

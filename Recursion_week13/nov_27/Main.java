public class Main {
  public static void main(String[] args) {
    System.out.println(binary(5));
  }

  public static int binary(int count) {
    if(count<1){
      return 0;
    }
    return (2*2)+binary(count-1);
  }
}
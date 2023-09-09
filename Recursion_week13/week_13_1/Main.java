public class Main {
  public static void main(String[] args) {
    printHello(5);
  }
  //1 example
  public static void printHello(int number) {
    if (number > 0) {
      System.out.println("HeLL0");
      number--;
      printHello(number);
    }
  }
}

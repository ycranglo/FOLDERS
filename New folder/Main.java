public class Main {
  public static void main(String[] args) {
    System.out.println(mystery(4));
   } public static int mystery(int n) {

      if (n == 7)
   
         return 1;
   
      else
   
         return 3 * mystery (n + 1);
   
   }
   
   
}
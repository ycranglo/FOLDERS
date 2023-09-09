public class main{
  public static void main(String[] args) {
    
    System.out.println(mystery(5,2));
  }public static int mystery(int n, int a) {

    if (n == 1) return a;
  
    return a * mystery(n-1,a);
  
  }
}
/*
 * 26
 * 24
 * 
 * 22
 * 20
 * 18
 * 14
 * 12
 * 10
 * 8
 * 6
 * 4
 * 2
 * 
 * 
 */
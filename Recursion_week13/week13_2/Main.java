import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    int num, sum;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER A NUMBER :");
    num = Integer.parseInt(reader.readLine());
    sum = compute(num);

    System.out.println("the sum of the numner is :" + sum);

  }

  public static int compute(int number) {
    if (number>0)
      return number + compute(number - 1);
    else
      return number;
  }
}
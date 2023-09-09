import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static double cost;
  public static double payment;
  public static boolean notDouble;

  
  public static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
public static void main(String args[]) throws NumberFormatException, IOException{
Sales sales= new Sales();



System.out.println("ENTER THE COST :");
cost=Double.parseDouble(reader.readLine());
sales.setCost(cost);
sales.setTax(0.06);
System.out.println("VAT :"+sales.getTax());
System.out.println("TOTAL :"+(sales.getTax()+sales.getCost()));
do{
  System.out.println("ENTER EXACT AMOUNT OF  PAYMENT :");
  payment=Double.parseDouble(reader.readLine());
  sales.SetPayment(payment);

}while((sales.getPayment()<sales.getTotal()));
System.out.println("------------------------------------");
System.out.println("COST  :"+sales.getCost()+"₱");
System.out.println("VAT :"+sales.getTax()+" 6%");
System.out.println(" RECEIVED AMOUNT :"+sales.getPayment()+"₱");
double change=sales.getPayment()-sales.getTotal();
System.out.println("CHANGE :"+change+"₱");
}
static{
  System.out.println("WELCOME TO THE CASHIERS ");
}
}

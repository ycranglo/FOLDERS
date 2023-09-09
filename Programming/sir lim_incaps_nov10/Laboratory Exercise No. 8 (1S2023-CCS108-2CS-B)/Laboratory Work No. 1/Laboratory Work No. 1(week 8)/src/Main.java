import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  
  public static void main(String[] args) throws IOException {
    //intance of bufferred Reader for the user input
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    Investment invest= new Investment();
    //asking the user for the symbol
    System.out.println("ENTER THE INVESTMENT SYMBOL :");
    System.out.print(">>");
    invest.setSymbol(reader.readLine());
    //asking the user for the firm name
    System.out.println("ENTER THE FIRM NAME :");
    System.out.print(">>");
    invest.setName(reader.readLine());
    //asking the user for the closing price
    System.out.println("ENTER THE PREVIOUS CLOSING PRICE :");
    System.out.print(">>");
    invest.setPrevClosingPrice(Double.parseDouble(reader.readLine()));
    //asking the user for the current price
    System.out.println("ENTER THE CURRENT PRICE :");
    System.out.print(">>");
    invest.setCurPrice(Double.parseDouble(reader.readLine()));
    System.out.println();
    //displaying the price changes and calling the getter methods
    System.out.println("PREVIOUS CLOSING PRICE :"+invest.getPrevClosingPrice());
    System.out.println("CLOSING PRICE :"+invest.getCurPrice());
    System.out.println("PRICE CHANGE :"+invest.getChangePercent()+" %");

    
  }
}

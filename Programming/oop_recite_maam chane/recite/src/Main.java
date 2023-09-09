import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static int choice;
  public static String Prodname;
  public static int quantity;
  public static int payment;
  public static void main(String[] args) {
    Product toyo= new Product(1234, "TOYO", "CONDIMENTS", 27, 100);
    Product suka= new Product(4567, "SUKA", "CONDIMENTS", 30, 100);
    Product asukal= new Product(6789, "ASUKAL", "CONDIMENTS", 70, 100);
    Product oysterSauce= new Product(1342, "OYSTER SAUCE", "CONDIMENTS", 10, 100);
    Product mantika= new Product(9796, "MANTIKA", "CONDIMENTS", 40, 100);
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    Product.devider();
    System.out.println("WELCOME TO THE GROCERY STORE IN YOU AREA!");
    Product.devider();
   try {
  do{
   System.out.println("DO YOU WANT TO PURSHASE AN ITEM?");
   System.out.println("1 FOR YES");
   System.out.println("2 FOR NO");
   
   Product.devider();
   System.out.print(">");
   choice=Integer.parseInt(reader.readLine());
   if(choice==1){
    Product.devider();
    System.out.println("THE LIST OF ITEMS ARE  :");
    System.out.println("PRODUCT ID :"+toyo.getProductId()+" | PRODUCT NAME :"+toyo.ProductName+"         |PRODUCT PRICE :"+toyo.price+" |PRODUCT QUANTITY :"+toyo.getquatinty());
    System.out.println("PRODUCT ID :"+suka.getProductId()+" | PRODUCT NAME :"+suka.ProductName+"         |PRODUCT PRICE :"+suka.price+" |PRODUCT QUANTITY :"+suka.getquatinty());
    System.out.println("PRODUCT ID :"+asukal.getProductId()+" | PRODUCT NAME :"+asukal.ProductName+"       |PRODUCT PRICE :"+asukal.price+" |PRODUCT QUANTITY :"+asukal.getquatinty());
    System.out.println("PRODUCT ID :"+oysterSauce.getProductId()+" | PRODUCT NAME :"+oysterSauce.ProductName+" |PRODUCT PRICE :"+oysterSauce.price+" |PRODUCT QUANTITY :"+oysterSauce.getquatinty());
    System.out.println("PRODUCT ID :"+mantika.getProductId()+" | PRODUCT NAME :"+mantika.ProductName+"      |PRODUCT PRICE :"+mantika.price+" |PRODUCT QUANTITY :"+mantika.getquatinty());
    Product.devider();
    do{
      System.out.println("PLEASE SELECT THE PRODUCT NAME THAT YOU WANT TO PURCHASE :");
      System.out.print(">");
      Prodname=reader.readLine();
    }while(!(Prodname.matches ("[a-zA-Z ]+\\.?")));
    Product.devider();
    if(Prodname.equals("TOYO")|| Prodname.equals("toyo")){
      if(toyo.getquatinty()==0){
        System.out.println("OUT OF STOCK");
        break;
      }
      System.out.println("YOUR PRODUCT IS :"+toyo.getProductName()+"  |PRODUCT TYPE :"+toyo.getPRoductype());
      System.out.println("THE AMOUNT IS :"+toyo.getPrice()+" ₱");
      System.out.println("PRODUCT QUANTITY IS :"+toyo.getquatinty());
      System.out.println("ENTER THE QUANTITY :");
      do{
        System.out.print(">");
        quantity=Integer.parseInt(reader.readLine());
        if((quantity>toyo.getquatinty())){
          System.out.println("PLEASE ENTER A QUANTITY THAT BELOW OR EQUAL TO THE QUANTITY OF THE PRODUCT.");
        }
      }while(quantity>toyo.getquatinty());
      int amountToyo=toyo.getPrice()*quantity;
      System.out.println("TOTAL AMOUNT :"+amountToyo);
      System.out.println("ENTER YOUR PAYMENT :");
     do{
      System.out.print(">");
      payment=Integer.parseInt(reader.readLine());
      if(payment<toyo.getPrice()){
        System.out.println("PLEASE ENTER A EXACT AMOUNT.");
      }
     }while(payment<toyo.getPrice());
     System.out.println("YOUR ITEM IS :"+toyo.getProductName()+" WITH TOTAL AMOUNT OF :"+amountToyo);
     int changetoyo=payment-amountToyo;
     System.out.println("YOUR CHANGE IS :"+changetoyo);
     toyo.setQuantity(toyo.getquatinty()-quantity);
     Product.devider();
    }
    if(Prodname.equals("suka")|| Prodname.equals("SUKA")){
      if(suka.getquatinty()==0){
        System.out.println("OUT OF STOCK");
        break;
      }
      System.out.println("YOUR PRODUCT IS :"+suka.getProductName()+"  |PRODUCT TYPE :"+suka.getPRoductype());
      System.out.println("THE AMOUNT IS :"+suka.getPrice()+" ₱");
      System.out.println("PRODUCT QUANTITY IS :"+suka.getquatinty());
      System.out.println("ENTER THE QUANTITY :");
      do{
        System.out.print(">");
        quantity=Integer.parseInt(reader.readLine());
        if((quantity>suka.getquatinty())){
          System.out.println("PLEASE ENTER A QUANTITY THAT BELOW OR EQUAL TO THE QUANTITY OF THE PRODUCT.");
        }
      }while(quantity>suka.getquatinty());
      int amountSuka=suka.getPrice()*quantity;
      System.out.println("TOTAL AMOUNT :"+amountSuka);
      System.out.println("ENTER YOUR PAYMENT :");
     do{
      System.out.print(">");
      payment=Integer.parseInt(reader.readLine());
      if(payment<suka.getPrice()){
        System.out.println("PLEASE ENTER A EXACT AMOUNT.");
      }
     }while(payment<suka.getPrice());
     System.out.println("YOUR ITEM IS :"+suka.getProductName()+" WITH TOTAL AMOUNT OF :"+amountSuka);
     int changeSuka=payment-amountSuka;
     System.out.println("YOUR CHANGE IS :"+changeSuka);
     suka.setQuantity(suka.getquatinty()-quantity);
     Product.devider();
    }
     if(Prodname.equals("asukal")|| Prodname.equals("ASUKAL")){
      if(asukal.getquatinty()==0){
        System.out.println("OUT OF STOCK");
        break;
      }
      System.out.println("YOUR PRODUCT IS :"+asukal.getProductName()+"  |PRODUCT TYPE :"+asukal.getPRoductype());
      System.out.println("THE AMOUNT IS :"+asukal.getPrice()+" ₱");
      System.out.println("PRODUCT QUANTITY IS :"+asukal.getquatinty());
      System.out.println("ENTER THE QUANTITY :");
      do{
        System.out.print(">");
        quantity=Integer.parseInt(reader.readLine());
        if((quantity>asukal.getquatinty())){
          System.out.println("PLEASE ENTER A QUANTITY THAT BELOW OR EQUAL TO THE QUANTITY OF THE PRODUCT.");
        }
      }while(quantity>asukal.getquatinty());
      int amountAsukal=asukal.getPrice()*quantity;
      System.out.println("TOTAL AMOUNT :"+amountAsukal);
      System.out.println("ENTER YOUR PAYMENT :");
     do{
      System.out.print(">");
      payment=Integer.parseInt(reader.readLine());
      if(payment<asukal.getPrice()){
        System.out.println("PLEASE ENTER A EXACT AMOUNT.");
      }
     }while(payment<asukal.getPrice());
     System.out.println("YOUR ITEM IS :"+asukal.getProductName()+" WITH TOTAL AMOUNT OF :"+amountAsukal);
     int changeasukal=payment-amountAsukal;
     System.out.println("YOUR CHANGE IS :"+changeasukal);
     asukal.setQuantity(asukal.getquatinty()-quantity);
     Product.devider();
    }
    if(Prodname.equals("oyster Sauce")|| Prodname.equals("OYSTER SAUCE")||Prodname.equals("oyster sauce")|| Prodname.equals("oystersauce")){
      if(oysterSauce.getquatinty()==0){
        System.out.println("OUT OF STOCK");
        break;
      }
      System.out.println("YOUR PRODUCT IS :"+oysterSauce.getProductName()+"  |PRODUCT TYPE :"+oysterSauce.getPRoductype());
      System.out.println("THE AMOUNT IS :"+oysterSauce.getPrice()+" ₱");
      System.out.println("PRODUCT QUANTITY IS :"+oysterSauce.getquatinty());
      System.out.println("ENTER THE QUANTITY :");
      do{
        System.out.print(">");
        quantity=Integer.parseInt(reader.readLine());
        if((quantity>oysterSauce.getquatinty())){
          System.out.println("PLEASE ENTER A QUANTITY THAT BELOW OR EQUAL TO THE QUANTITY OF THE PRODUCT.");
        }
      }while(quantity>oysterSauce.getquatinty());
      int amountoyster=oysterSauce.getPrice()*quantity;
      System.out.println("TOTAL AMOUNT :"+amountoyster);
      System.out.println("ENTER YOUR PAYMENT :");
     do{
      System.out.print(">");
      payment=Integer.parseInt(reader.readLine());
      if(payment<oysterSauce.getPrice()){
        System.out.println("PLEASE ENTER A EXACT AMOUNT.");
      }
     }while(payment<oysterSauce.getPrice());
     System.out.println("YOUR ITEM IS :"+oysterSauce.getProductName()+" WITH TOTAL AMOUNT OF :"+amountoyster);
     int changeoyster=payment-amountoyster;
     System.out.println("YOUR CHANGE IS :"+changeoyster);
     oysterSauce.setQuantity(oysterSauce.getquatinty()-quantity);
     Product.devider();
    }
    if(Prodname.equals("MANTIKA")|| Prodname.equals("mantika")){
      if(mantika.getquatinty()==0){
        System.out.println("OUT OF STOCK");
        break;
      }
      System.out.println("YOUR PRODUCT IS :"+mantika.getProductName()+"  |PRODUCT TYPE :"+mantika.getPRoductype());
      System.out.println("THE AMOUNT IS :"+mantika.getPrice()+" ₱");
      System.out.println("PRODUCT QUANTITY IS :"+mantika.getquatinty());
      System.out.println("ENTER THE QUANTITY :");
      do{
        System.out.print(">");
        quantity=Integer.parseInt(reader.readLine());
        if((quantity>mantika.getquatinty())){
          System.out.println("PLEASE ENTER A QUANTITY THAT BELOW OR EQUAL TO THE QUANTITY OF THE PRODUCT.");
        }
      }while(quantity>mantika.getquatinty());
      int amountMantika=mantika.getPrice()*quantity;
      System.out.println("TOTAL AMOUNT :"+amountMantika);
      System.out.println("ENTER YOUR PAYMENT :");
     do{
      System.out.print(">");
      payment=Integer.parseInt(reader.readLine());
      if(payment<mantika.getPrice()){
        System.out.println("PLEASE ENTER A EXACT AMOUNT.");
      }
     }while(payment<mantika.getPrice());
     System.out.println("YOUR ITEM IS :"+mantika.getProductName()+" WITH TOTAL AMOUNT OF :"+amountMantika);
     int changeMantika=payment-amountMantika;
     System.out.println("YOUR CHANGE IS :"+changeMantika);
     mantika.setQuantity(mantika.getquatinty()-quantity);
     Product.devider();
    }
   }
   if(choice>2){
    Product.devider();
    System.out.println("PLEASE ENTER A VALID OPERATION, PLEASE TRY AGAIN.");
    System.exit(choice);
    Product.devider();
   }
   
  }while(choice==1);
  Product.devider();
  System.out.println("THANK YOU FOR PURCHASING! PLEASE COMEBACK AGAIN!");
  System.out.println("HAVE A NICE DAY!");
  Product.devider();
   } catch (Exception error) {
   System.out.println("PLEASE ENTER A VALID OPERATION, PLEASE TRY AGAIN.");
   }
  }
}

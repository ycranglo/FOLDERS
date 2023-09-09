public class Product {
  private int productId;
  public String ProductName;
  public String productType;
  public int price;
  private int quantity;
  //constructors
   public Product(int id,String ProductName, String productType,int price, int quantity){
    this.productId=id;
    this.ProductName=ProductName;
    this.productType=productType;
    this.price=price;
    this.quantity=quantity;
   }
   //setters amd getters
   public void setProductId(int productId){
    this.productId=productId;
   }
   public void setQuantity(int quantity){
    this.quantity=quantity;
   }
   public void setProductName(String productName){
    this.ProductName=productName;
   }
   public void setPrice(int price){
    this.price=price;
   }
   public void setProductType(String productType){
    this.productType=productType;
   }
   public int getProductId(){
    return this.productId;
   }
   public int getquatinty(){
    return this.quantity;
   }
   public int getPrice(){
    return this.price;
   }
   public String getPRoductype(){
    return this.productType;
   }
   public String getProductName(){
    return this.ProductName;
   }
   public static void devider(){
    System.out.println("-------------------------------------------------------------");
   }
}

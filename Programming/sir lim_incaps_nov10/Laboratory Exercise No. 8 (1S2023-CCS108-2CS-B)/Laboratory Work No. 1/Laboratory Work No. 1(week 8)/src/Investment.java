public class Investment {
  //declaring the classfields
  private String name;
  private String symbol;
  private double curPrice;
  private double prevClosingPrice;

  //this is the method for the change percentage
  //it return the percent changge in the investment
  public double getChangePercent(){
    //this is the formula
    return ((this.prevClosingPrice-this.curPrice)/this.prevClosingPrice)*100;
  }
  //setter for name
  public void setName(String name){
    this.name=name;
  }
  //setter for symbol
  public void setSymbol(String symbol){
    this.symbol=symbol;
  }
  // setter for the current price
  public void setCurPrice(double curPirce){
    this.curPrice=curPirce;
  }
  //setter for the previous price
  public void setPrevClosingPrice(double prevClosingPrice){
    this.prevClosingPrice=prevClosingPrice;
  }
  //getter method that return current price
  public double getCurPrice(){
    return this.curPrice;
  }
  //getter method that return previous price
  public double getPrevClosingPrice(){
    return this.prevClosingPrice;
  }
}



public class Sales {
  

  private double cost;
  private   double tax;
  private double payment;
  public double getTotal(){

    return this.cost+this.getTax();

  }
  public double  getCost(){
    return this.cost;
  }
  public double getTax(){
    double taxed=this.cost*this.tax;
    return taxed;
  }
  public double getPayment(){
    return this.payment;
  }
  
  public void setCost(double cost){
    this.cost=cost;
  }
  public void setTax(double tax){
    this.tax=tax;
  }
  public void SetPayment(double payment){
      this.payment=payment;
  }
  }




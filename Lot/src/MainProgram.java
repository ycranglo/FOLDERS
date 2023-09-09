public class MainProgram {
  public static void main(String args[]){

     Lot objLot = new Lot(); 
     Lot objLot1 = new Lot(); 
  Lot objLot2 = new Lot(); 

 //1
 System.out.println("lot's address  :"+objLot.address);
 //2
 System.out.println("Owners Full Name  :"+objLot.ownerFirstName+objLot.ownerLastName);
 //3
 System.out.println("Lot Area :"+(objLot.lotLenght*objLot.lotWidth));
 //4
 System.out.println("Old Lot Area :"+(objLot.lotLenght*objLot.lotWidth));
 objLot.lotLenght=10;
 System.out.println("New Lot Area :"+(objLot.lotLenght*objLot.lotWidth));
 //5
 objLot.address="cabuyao,laguna";
 System.out.println("Lot Address  :"+objLot.address);
 //6
 objLot.ownerFirstName="John";
 objLot.ownerLastName="Jones";
 System.out.println("Hello"+objLot.ownerFirstName+"!");
 //7
 objLot.lotWidth=8;
 System.out.println("Lot area  :"+(objLot.lotLenght*objLot.lotWidth));
 //8
 objLot2.lotLenght=objLot1.lotLenght*3;
 objLot2.lotWidth=objLot1.lotWidth+objLot1.lotLenght;
 System.out.println("Lot area of lot 2  :"+(objLot2.lotLenght*objLot2.lotWidth));
 //9
 System.out.println("Owners Full Name of lot 1 :"+objLot1.ownerFirstName+objLot1.ownerLastName);
 System.out.println("Owners Full Name of lot 2 :"+objLot2.ownerFirstName+objLot2.ownerLastName);
 //10
 objLot.address="calamba";
 System.out.println("lot 1 address :"+objLot1.address);
 System.out.println("lot 2 address :"+objLot2.address);
}
}

// public class ArrayLinkedList {
  
//   LinkedList link=new LinkedList();
//   public int hashIndex;
//   Node[] array=new Node[20];

//   //this method is for getting the ascii of a String
   public int hash(String messsage){
     int count=0;
    for(int i=0;i<messsage.length();i++){
      count++;
      hashIndex=hashIndex+(((int)messsage.charAt(i))*count);
    }
    hashIndex=hashIndex%20;
    return hashIndex;
  }

//   public void Addhash(Node node){

//     array[hashIndex
//   }
// }

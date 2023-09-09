public class ArrayLinkedList {

  private Node head;
  public static int hash;
  public static int count=0;
  Node[] array=new Node[20];
  


  // setters
  public void setHead(Node head) {
    this.head = head;
  }

  // getters
  public Node getHead() {
    return this.head;
  }

  public void hashing(Node node,String message) {
    hash(message);

    if (head == null) {
      head = node;
    } else {
      Node currentnode = head;
      while (currentnode.getNext() != null)
        currentnode = currentnode.getNext();
      currentnode.setNext(node);
    }
    array[hash]=node;
  } 
  public void showMessage(){

    for(int i=0;i<array.length;i++){
      Node currentnode=head;
      System.out.print(array[i]);
      while(currentnode!=null){
        System.out.print(currentnode.getMess()+"");
        currentnode=currentnode.getNext();
      }
      System.out.println();
    }
  }
  public int hash(String messsage){

    for(int i=0;i<messsage.length();i++){
      count++;
      hash=hash+(((int)messsage.charAt(i))*count);
    }
    hash=hash%20;
    return hash;
  }
  
}


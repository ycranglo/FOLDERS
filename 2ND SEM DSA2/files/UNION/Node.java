public class Node {
  
  private int data;
  private Node next;
  private Node previous;

  public Node(){
    this.data=0;
    this.next=null;
    this.previous=null;
  }
  public Node(int data){
 this.data=data;
 this.next=null;
 this.previous=null;
  }
  //setters

  public void setData(int data){
    this.data=data;
  }
  public void setNext(Node next){
    this.next=next;
  }
  public void setPrev(Node prev){
    this.previous=prev;
  }
  //getters
  public int getData(){
    return this.data;
  }
  public Node getNext(){
    return this.next;
  }
  public Node getPrev(){
    return this.previous;
  }

}

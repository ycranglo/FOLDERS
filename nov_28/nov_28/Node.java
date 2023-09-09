public class Node {
  private Node next;
  private Node previous;
  private int data;

  public Node(){
  }
  public Node(int data){
    this.data=data;
    previous=null;
    next=null;
  }
  public int getData(){
    return this.data;
  }
  public Node getPrevious(){
    return this.previous;
  }
  public Node getNext(){
    return this.next;
  }
  public void setNext(Node next){
    this.next=next;
  }
  public void setPrevious(Node previous){
    this.previous=previous;
  }
  public void setData(int data){
    this.data=data;
  }
}

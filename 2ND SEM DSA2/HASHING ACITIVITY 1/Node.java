public class Node{
  private String mess;
  private Node next;
  public Object toString;

  public Node(){
  }
  public Node(String mess){
    next=null;
    this.mess=mess;
  }
  public void setMess(String mess){
    this.mess=mess;
  }
  public void setNext(Node next){
    this.next=next;
  }
  public Node getNext(){
    return this.next;
  }
  public String getMess(){
    return this.mess;
  }
}
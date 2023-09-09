public class Node{
  private String mess;
  private Node next;

  public Node(String mess){
    this.next=null;
    this.mess=mess;
  }
  public void setMess(String mess){
    this.mess=mess;
  }
  public void setNext(Node next){
    this.next=next;
  }
  public String getMess(){
    return this.mess;
  }
  public Node getNext(){
    return this.next;
  }
}
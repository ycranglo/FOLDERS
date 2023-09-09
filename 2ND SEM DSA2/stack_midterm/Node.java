public class Node {
  // storage for the node data
  private int data;
  // storage for the address of the next node
  private Node next;
  private int Deleted=0;
  private int Push=1;

  // a no-argument constructor that creates a node with default values
  public Node() {
    data = 0;
    next = null;
    Deleted=0;
  }

  // a constructor that creates a node with initial data specified by the
  // parameter
  public Node(int data) {
    this.data = data;
    next = null;
    Deleted=0;
    Push=1;
  }

  // set and get methods
  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
  public void setDeleted(int Deleted) {
    this.Deleted=Deleted;
  }

  public int getDeleted() {
    return Deleted;
  }
  public int getPush(){
    return Push;
  }
  public void setPush(int Push){
    this.Push=Push;
  }
}
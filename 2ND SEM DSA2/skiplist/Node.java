public class Node {
  private int data;
  private Node next;
  private Node previous;
  
  // Derived constructor that creates a node with default values
  public Node() {
    data = 0;
    next = null;
  }
  
  // Derived constructor that creates a node with initial data specified by the parameter
  public Node(int data) {
    this.data = data;
    next = null;
  }
  
  /*
  *	Getters and Setters
  */
  
  public int getData() {
    return data;
  }
  
  public Node getNext() {
    return next;
  }
  
  public Node getPrevious() {
    return previous;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
  
  public void setPrevious(Node previous) {
    this.previous = previous;
  }
}
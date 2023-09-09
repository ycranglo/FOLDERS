public class Node {

  // classfields of Node
  private int data;
  // this is the pointers
  private Node next;
  private Node previous;

  // constructor with no parameter
  // defualt constructor
  public Node() {
    data = 0;
    // setting the values of next and previous pointer to null
    next = null;
    previous = null;
  }
  // constructor with parameter
  public Node(int data) {
    this.data = data;
    // setting the values of next and previous pointer to null
    next = null;
    previous = null;
  }

  //this is the getters for data,next and previous
  public int getData() {
    return data;
  }
  public Node getNext() {
    return next;
  }
  
  public Node getPrevious() {
    return previous;
  }

  //this is the setters for data,next and previous
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

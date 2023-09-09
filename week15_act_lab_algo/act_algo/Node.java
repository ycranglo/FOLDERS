public class Node {

  // this is the classfields
  private int data;
  private Node next;
  private Node previous;

  // default constructor
  public Node() {
  }

  // constructor with parameter
  public Node(int data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }

  // setters for data,next and previous
  public void setData(int data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setPrevious(Node previous) {
    this.previous = previous;
  }

  // getters for data,next and previous
  public int getData() {
    return this.data;
  }

  public Node getNext() {
    return this.next;
  }

  public Node getPrevious() {
    return this.previous;
  }
}

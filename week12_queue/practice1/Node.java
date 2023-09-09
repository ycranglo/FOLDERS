public class Node {
  // classfields
  private Node next;
  private int data;

  // default constructors
  public Node() {
  }

  // constructors
  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  // setters
  public void setNext(Node next) {
    this.next = next;
  }

  public void setData(int data) {
    this.data = data;
  }

  // getters
  public int getData() {
    return this.data;
  }

  public Node getNext() {
    return this.next;
  }
}

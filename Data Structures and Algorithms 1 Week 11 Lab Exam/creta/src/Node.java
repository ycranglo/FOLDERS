public class Node {
  private int data = 0;
  private Node previousNode = null;
  private Node nextNode = null;

  // Initializes a new Node object
  public Node(int data) {
    this.data = data;
  }

  // Gets the node data
  public int getData() {
    return this.data;
  }
  
  // Sets the node data
  public void setData(int data) {
    this.data = data;
  }

  // Gets the previous next node
  public Node getPreviousNode() {
    return this.previousNode;
  }

  // Sets the previous next node
  public void setPreviousNode(Node previousNode) {
    this.previousNode = previousNode;
  }
  // Gets the next node
  public Node getNextNode() {
    return this.nextNode;
  }
  // Sets the next node
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }
}

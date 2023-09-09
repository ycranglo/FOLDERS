public class Node {
  private int data;
  private Node nextNode;
  
  // Creates a new node with the passed data as value of the data property
  public Node(int data) {
    this.data = data;
    this.nextNode = null;
  }

  /*
   * Getters and Setters
  */
  
  public int getData() {
    return this.data;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public Node getNextNode() {
    return this.nextNode;
  }
  
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }
}

public class LinkedList {
  private Node headNode;
  private int size = 0;

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }
  
  // Displays all nodes on the linked list
  public void displayNodes() {
    Node currentNode = this.headNode;

    System.out.println("\nNODES");

    while (currentNode != null) {
      System.out.print("(" + currentNode.getData() + ")" + " --> ");
      currentNode = currentNode.getNextNode();
    }

    System.out.print("(null)");
  }

  // Adds the passed node on the linked list
  public void addNode(Node node) {
    if (this.headNode == null)
      this.headNode = node;
    else {
      Node currentNode = this.headNode;

      while (currentNode.getNextNode() != null)
        currentNode = currentNode.getNextNode();

      currentNode.setNextNode(node);
    }
  }
}

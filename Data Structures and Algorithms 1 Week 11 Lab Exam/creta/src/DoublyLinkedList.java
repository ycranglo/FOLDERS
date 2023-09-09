public class DoublyLinkedList {
  private Node headNode;
  private Node tailNode;
  private int size = 0;

  // Gets size of linked list
  public int getSize() {
    return this.size;
  }

  // Sets the size of linked list
  public void setSize(int size) {
    this.size = size;
  }

  // Add the passed node on the linked list
  public void addNode(Node node) {
    if(headNode == null)
      this.headNode = node;
    else {
      if(tailNode == null)
        tailNode = this.headNode;

      tailNode.setNextNode(node);
      node.setPreviousNode(tailNode);
      tailNode = node;
    }
  }

  // Append the passed node on the linked list
  public void appendNode(Node node) {
    if (headNode == null)
      this.headNode = node;
    else {
      if (tailNode == null)
        tailNode = this.headNode;

      tailNode.setNextNode(node);
      node.setPreviousNode(tailNode);
      tailNode = node;
    }
  }

  // Displays all nodes on the doubly linked list
  public void displayNodes() {
    Node currentNode = this.headNode;

    System.out.println("\nNODES");

    do {
      System.out.print("(" + currentNode.getData() + ")" + " --> ");
      currentNode = currentNode.getNextNode();
    } while (currentNode.getNextNode() != null);

    if(currentNode != null)
      System.out.print("(" + currentNode.getData() + ")" + " --> ");

    System.out.print("(null)");
  }
  
  // Deletes all nodes on the doubly linked list
  public void deleteNodes(int data) {
    Node targetNode;
    Node currentNode;

    while (headNode != null && headNode.getData() == data) {
      targetNode = this.headNode;
      headNode = this.headNode.getNextNode();
      targetNode = null;
    }
    currentNode = this.headNode;
    if(currentNode != null) {
      while(currentNode.getNextNode() != null)
        if(currentNode.getNextNode().getData() == data) {
          targetNode = currentNode.getNextNode();
          currentNode.setNextNode(currentNode.getNextNode().getNextNode());
          targetNode = null;
        } else
        currentNode = currentNode.getNextNode();
    }
  }
}

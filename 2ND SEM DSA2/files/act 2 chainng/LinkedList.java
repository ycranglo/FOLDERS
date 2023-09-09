public class LinkedList {
  private Node head;

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }// this is the method for addNode

  public Node addNode(Node node) {
    if (head == null) {
      head = node;
      head.setNext(head);
    } else {
      Node currentNode = head;
      while (currentNode.getNext() != head)
        currentNode = currentNode.getNext();
      currentNode.setNext(node);
      node.setNext(head);
    }
    return node;
  }
  public void display() {
    System.out.print("\nQueue content: ");
    // instantiate the currentNode
    Node currentNode = head;
    // traverse the Queue
    while (currentNode != null) {
      // displaying the value of Queue
      System.out.print(currentNode.getData() + " ");
      // setting the currentNode to the next node
      currentNode = currentNode.getNext();
    }
  }
}

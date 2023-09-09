public class LinkedList {
  
  public Node head;

  public Node getHead() {
    return this.head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public void enqueue(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node currentNode = head;
      while (currentNode.getNext() != null)
        currentNode = currentNode.getNext();
      currentNode.setNext(node);
    }
  }















}


public class LinkedList {
  private Node head;

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public void addNode(Node node) {
    if (head == null) {
      head = node;
      head.setNext(head);
    } else {
      Node currentNode = head;
      while (currentNode.getNext() != head)
        currentNode = currentNode.getNext();
      currentNode.setNext(node);
      node.setNext(head);
      node.setPrevious(currentNode);
    }
  }

  public void displayList() {
    if (head == null)
      System.out.print("\nThe list is empty!");
    else {
      System.out.print("\nThe values are: ");
      Node currentNode = head;
      do {
        System.out.print(currentNode.getData() + " ");
        currentNode = currentNode.getNext();
      } while (currentNode != head);
    }
  }

  public void deleteAllDuplicates() {
    Node currentNode = head;
    Node pointNode;

    if (head == null) {
      System.out.println("the list is empty");
    } else {
      do {
        while (currentNode != head) {
          pointNode = currentNode.getNext();
          if (currentNode.getData() == pointNode.getData()) {
            currentNode.setNext(pointNode.getNext());
            pointNode.setNext(currentNode.getNext());
          }
          pointNode = pointNode.getNext();
          currentNode = currentNode.getNext();
        }
      } while (currentNode != head);
    }
  }
}

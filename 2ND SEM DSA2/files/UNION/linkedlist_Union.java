public class linkedlist_Union {

  private Node head;

  // setters
  public void setHead(Node head) {
    this.head = head;
  }

  public Node gethead() {
    return this.head;
  }

  // adding a node

  public void addNode(Node num1, Node num2) {

    if (head == null) {
      head = num2;
      head.setNext(num1);
    } else {
      if (connectFind(num1)) {

        Node currentNode = head;
        while (currentNode.getNext() != null)
          currentNode = currentNode.getNext();
        currentNode.setNext(num2);
        num2.setPrev(currentNode);
        num2.setNext(num1);
        num1.setPrev(num2);
      }
    }
    System.out.println("OPERATION SUCCESS");
  }

  public boolean connectFind(Node num1) {
    boolean finded = false;
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      if (currentNode == num1) {
        finded = true;
        break;
      }
      currentNode = currentNode.getNext();
    }
    return finded;
  }

  public boolean unionFind(Node num1, Node num2) {
    boolean UnionFind = false;
    boolean UnionFindNum1 = false;
    boolean UnionFindNum2 = false;
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      if (currentNode == num1) {
        UnionFindNum1 = true;
      }
      if (currentNode == num2) {
        UnionFindNum2 = true;
      }
      currentNode = currentNode.getNext();
    }
    if (UnionFindNum2 == true && UnionFindNum1 == true) {
      UnionFind = true;
    }
    return UnionFind;
  }
}

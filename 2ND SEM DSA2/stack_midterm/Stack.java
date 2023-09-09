public class Stack {
  // storage for the address of the first node
  private Node head;
  public static int count = 0;
  public static int countItem = 0;

  // set and get methods for the first node
  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  // method for push operation
  public void push(int number) {
    Node node = new Node(number);
    if (head == null)
      head = node;
    else {
      Node currentNode = head;
      while (currentNode.getNext() != null)
        currentNode = currentNode.getNext();
      currentNode.setNext(node);
      count++;
    }
  }

  // method for pop operation
  public void pop() {
      if (count == 0) {
        System.out.println("Stack is empty, nothing to pop.");
        return;
      }
      Node currentNode = head;
      for (int a = 1; a < count; a++) {
        currentNode = currentNode.getNext();
      }
      currentNode.setDeleted(1);
      count--;
    }

  // displays the contents of the stack
  public void view() {
    System.out.print("\nCurrent Item Stack content(s): ");
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.getDeleted() == 0) {
        System.out.print(currentNode.getData() + " ");
      }
      currentNode = currentNode.getNext();
    }
  }

  public void History() {
    Node currentNode = head;
    while (currentNode != null) {
      if (currentNode.getPush() == 1) {
        System.out.println("Added " + currentNode.getData() + " to the stack");
        countItem++;
      }
      if (currentNode.getDeleted() == 1) {
        System.out.println("Removed " + currentNode.getData() + " from the stack");
        countItem--;
      }
      System.out.println();
      for(int a=0;a<countItem;a++){
        System.out.print(currentNode.getData() + " ");
      }
      countItem=0;
      System.out.println();
      System.out.println();
      currentNode = currentNode.getNext();
    }
  }
}
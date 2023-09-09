public class SkipList {
  private SkipNode head;
  
  /*
  *	Getters and Setters
  */
  
  public SkipNode getHead() {
    return head;
  }

  public void setHead(SkipNode head) {
    this.head = head;
  }

  // Adds a new node to the skip list
  public void addNode(SkipNode node) {
    if (head == null)
      head = node;
    else {
      SkipNode currentNode = head;
      
      while (currentNode.getNext() != null)
        currentNode = currentNode.getNext();
      
      currentNode.setNext(node);
      node.setPrevious(currentNode);
    }
  }

  // Displays nodes in the skip list
  public void displayList() {
    SkipNode currentNode = head;

    System.out.println("\nVALUES");

    while (currentNode != null) {
      System.out.print("(" + currentNode.getData() + ") -->");
      currentNode = currentNode.getNext();
    }
    
    System.out.println("(null)");
  }

  // Displays nodes in the Skip List in reversed order
  public void displayReversedList() {
    SkipNode currentNode = this.head;
    
    System.out.println("\nVALUES");
    
    while (currentNode.getNext() != null)
      currentNode = currentNode.getNext();
    
    while (currentNode != null) {
      System.out.print("(" + currentNode.getData()+ ") -->");
      currentNode = currentNode.getPrevious();
    }
    
    System.out.println("(null)");
  }
}




  public class doublyLinkedList {
    private Node head;
    
    /*
    * Getters and Setters
    */

    public Node getHead() {
      return head;
    }

    public void setHead(Node head) {
      this.head = head;
    }
    
    // Returns the length of the linked list
    public int getLength() {
      int counter = 0;
      Node currentNode = head;
      
      while (currentNode != null) {
        counter++;
        currentNode = currentNode.getNext();
      }
      
      return counter;
    }

    // Adds a node in the linked list
    public void addNode(Node node) {
      if (this.head == null)
        this.head = node;
      else {
        Node currentNode = head;
        
        while (currentNode.getNext() != null)
          currentNode = currentNode.getNext();
        
        currentNode.setNext(node);
        node.setPrevious(currentNode);
      }
    }
    
    // Sorts nodes in the linked list through bubble sort
    public void bubbleSort() {
      boolean noChanges = true;
      int temp;
      Node currentNode = this.head;
      
      while (currentNode.getNext() != null) {
        if (currentNode.getData() > currentNode.getNext().getData()) {
          temp = currentNode.getData();
          currentNode.setData(currentNode.getNext().getData());
          currentNode.getNext().setData(temp);
          noChanges = false;
        }
        
        currentNode = currentNode.getNext();
      }
      
      if (noChanges == false)
        this.bubbleSort();
    }

    // Displays all nodes in the linked list
    public void displayList() {
      System.out.println("\nNODES");
      
      if (head != null) {
        Node currentNode = head;
        
        while (currentNode != null) {
          System.out.print("(" + currentNode.getData() + ") -->");
          currentNode = currentNode.getNext();
        }
      }
      
      System.out.println("(null)");
    }

    // Displays nodes in the linked list in reverse order
    public void displayReversedList() {
      Node currentNode = head;
      
      System.out.println("\nVALUES");
      
      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      
      while (currentNode != null) {
        System.out.print("(" + currentNode.getData() + ") -->");
        currentNode = currentNode.getPrevious();
      }
      
      System.out.println("(null)");
    }
  }
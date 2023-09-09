public class PersistentLinkedList {
  private PersistentNode headNode;
  private PersistentNode persistentHeadNode;
  private int size = 0;

  /*
   * Getters and Setters
  */

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setPersistentSize(int size) {
    this.size = size;
  }
  
  // Displays the values of all existing persistent nodes
  public void displayNodes() {
    PersistentNode currentNode = this.headNode;

    System.out.println("\nEXISTING NODES");

    while (currentNode != null) {
      if(!currentNode.getDeleted())
        System.out.print("(" + currentNode.getData() + ")" + " --> ");

      currentNode = currentNode.getNextNode();
    }

    System.out.print("(null)");
  }

  // Adds a new persistent node
  public void addNode(PersistentNode node) {
    if (this.headNode == null && this.persistentHeadNode == null) {
      this.headNode = node;
      this.persistentHeadNode = node;
    }
    else {
      PersistentNode currentNode = this.headNode;
      PersistentNode currentPersistentNode = this.persistentHeadNode;

      while (currentNode.getNextNode() != null && currentPersistentNode.getNextNode() != null) {
        currentNode = currentNode.getNextNode();
        currentPersistentNode = currentPersistentNode.getNextNode();
      }

      currentNode.setNextNode(node);
      currentPersistentNode.setNextNode(node);
    }
  }

  // Deletes a persistent node based on specific position
  public void deleteNode(int position) {
    // Rifle
    if (position == 1)
      this.headNode.setDeleted(true);
    else {
      PersistentNode currentNode = this.headNode;
      int counter = 1;

      while (counter <= position) {
        currentNode = currentNode.getNextNode();
        counter++;
      }

      currentNode.setDeleted(true);
    }

    // Emergency Axe
    // if (position == 1)
    //   this.headNode = this.headNode.getNextNode();
    // else {
    //   PersistentNode currentNode = this.headNode;
    //   PersistentNode nextNode;
    //   int counter = 1;

    //   if (position == 1) {
    //     if (currentNode.getNextNode() == null)
    //       this.headNode = null;
    //     else {
    //       currentNode = currentNode.getNextNode().getNextNode();
    //       this.headNode.setData(this.headNode.getNextNode().getData());
    //       this.headNode.setNextNode(currentNode);
    //     }
    //   } else {
    //     while (counter < position - 1) {
    //       currentNode = currentNode.getNextNode();
    //       counter++;
    //     }

    //     nextNode = currentNode.getNextNode().getNextNode();
    //     currentNode.setNextNode(nextNode);
    //   }

    //   this.headNode = currentNode.getNextNode();
    // }
  }

  // Updates the value of a persistent node
  public void changeValue(int position, int data) {
    if (position == 1) {
      this.headNode.getPreviousData().addNode(new Node(this.headNode.getData()));
      this.headNode.setData(data);
    } else {
      PersistentNode currentNode = this.headNode;
      int counter = 2;

      while (counter <= position) {
        currentNode = currentNode.getNextNode();
        counter++;
      }

      currentNode.getPreviousData().addNode(new Node(currentNode.getData()));
      currentNode.setData(data);
    }
  }

  // Displays the history of a persistent node
  public void nodeHistory(int position) {
    if (position == 1) {


      // Node temporaryNode = this.headNode.getPreviousData().getNo

      // System.out.println("\nPREVIOUS VALUES");

      // while (currentNode != null) {
      //   System.out.print("(" + currentNode.getData() + ")" + " --> ");
      //   currentNode = currentNode.getNextNode();
      // }

      // System.out.print("(null)");

    } else {
      PersistentNode currentNode = this.headNode;
      int counter = 2;

      while (counter <= position) {
        currentNode = currentNode.getNextNode();
        counter++;
      }

      currentNode.getPreviousData().addNode(new Node(currentNode.getData()));
    }


    PersistentNode currentNode = this.headNode;



    System.out.println("\nPREVIOUS VALUES");

    while (currentNode != null) {
      System.out.print("(" + currentNode.getData() + ")" + " --> ");
      currentNode = currentNode.getNextNode();
    }

    System.out.print("(null)");
  }

  // Displays the values of all existing/deleted persistent nodes
  public void listHistory() {
    PersistentNode currentNode = this.persistentHeadNode;

    System.out.println("\nEXISTING AND DELETED NODES");

    while (currentNode != null) {
      System.out.print("(" + currentNode.getData() + ")" + " --> ");
      currentNode = currentNode.getNextNode();
    }

    System.out.print("(null)");
  }
}

public class LinkedList {

  // intance of head
  private Node head;

  // getters and setters of head
  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  // this is the method for addNode
  public void addNode(Node node) {
    // checking if the head is null
    if (head == null) {
      head = node;
      // seting the next of head to head
      head.setNext(head);
    } else {
      // creating a intance of currentNode that hold a head
      Node currentNode = head;
      // traversing while we dont reach the head
      while (currentNode.getNext() != head)
        currentNode = currentNode.getNext();
        //setting the next Node
        currentNode.setNext(node);
        node.setNext(head);
        //setting the previous of node to currentNode
        node.setPrevious(currentNode);
    }
  }

  //method for displaying the LinkedList
  public void displayList() {
    //checking if the LinkedList is empty
    if (head == null){
      System.out.print("\nThe list is empty!");
    }else {
      //printing/displaying the LinkedList
      System.out.print("\nThe values are: ");
      Node currentNode = head;
      do {
        System.out.print(currentNode.getData() + " ");
        currentNode = currentNode.getNext();
      } while (currentNode != head);
    }
          System.out.println();
  }

  //this is the method for merge all duplicates
  public void MergeAllDuplicates() {
    //checking if the LinkedList is empty
    if (head == null) {
      System.out.println("EMPLTY LIST");
    } else {
      //if the Linkedlist is not empty
      //we creating a intance of currentNode that holds the head
      //intance of nextNode for the next node of currentNode
      //and a templist that will act a new linkedlist or it will skip all of duplicates
      Node currentNode = head;
      Node nextNode = currentNode.getNext();
      Node tempList = currentNode;

      do {

        while(nextNode.getNext()!=head.getNext()){
          if (currentNode.getData() == nextNode.getData()) {
         //setting the next of tempList to next of the nextNode
          //so that we skip the duplacate of nextNode
          tempList.setNext(nextNode.getNext());
          //setting the previous of nextNode to next of the tempList
          nextNode.setPrevious(tempList.getPrevious());
          }else{
             //if the node has no duplicate
          //it will be also store in tempList
          tempList = nextNode;
          }
           //this code is simply jumping to another node
        //both for nextNode and currentNode
        //we use getNext() to jump
          nextNode=nextNode.getNext();
        }
        currentNode=currentNode.getNext();
      }while (currentNode.getNext() != head.getNext());
    }
  }
}
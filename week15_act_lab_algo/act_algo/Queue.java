public class Queue {

  // classfields
  private Node head;
  // we set the size into 6
  private int size = 6;
  // counts the data taht we queued
  public int counter;

  // setter for head
  public void setHead(Node head) {
    this.head = head;
  }

  // getters for size and head
  public int getSize() {
    return this.size;
  }
  public Node getHead() {
    return this.head;
  }

  // method for enqueue
  public void enqueue(Node node) {
    // we check if the counter iss not equal to 6
    if (counter != size) {
      // if head is empty,we first put the data to head
      if (head == null) {
        head = node;
        // increment the counter
        counter++;
      } else {
        // instantiate the currentNode
        Node currentNode = head;
        while (currentNode.getNext() != null)
          // setting the currentNode to the next node
          currentNode = currentNode.getNext();
        // set the next pointer of currentNode to node
        currentNode.setNext(node);
        // set the previous pointer of node to currentNode
        node.setPrevious(currentNode);
        // increment the counter
        counter++;
      }
    }
  }

  // method for dequeue
  public int dequeue() {
    // instantiate the number
    int number;
    // checks if the queue only contain the head
    if (head.getNext() == null) {
      // put the dat of head to number
      number = head.getData();
      // set the head into null
      head = null;
      //decrement the counter
      counter--;
    } else {
      // put the dat of head to number
      number = head.getData();
      // set the head to the next node of the head
      head = head.getNext();
      //decrement the counter
      counter--;
    }
    // return the value of head
    return number;
  }

  // method for peek
  public int peek() {
    // return the value of head
    return this.head.getData();
  }

  // method for the display of Queue
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
    System.out.println();
  }

}

public class Queue {
    // classfields
  private Node head;
  private int size;

  public Queue(int size) {
    head = null;
    this.size = size;
  }

  public Node getHead() {
    return this.head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  // adding a element at the ending of the queue
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

  // deleting an first element
  public int dequeue() {
    int number;
    if (head.getNext() == null) {
      number = head.getData();
      head = null;
    } else {
      number = head.getData();
      head = head.getNext();
    }
    return number;
  }

  // this method is to peek the first element of the queue
  public int peek() {
    return head.getData();
  }

  // checks if the queue is full
  // by if the counter is not equal the size of the queue
  public boolean isFull() {
    int ctr = 0;
    boolean full = false;
    Node currentNode = head;
    while (currentNode != null) {
      currentNode = currentNode.getNext();
      ctr++;
    }
    if (ctr == size)
      full = true;
    return full;
  }

  // checks if the queue is empty
  // by cheking if the head is empty
  public boolean isEmpty() {
    boolean empty = false;
    if (head == null)
      empty = true;
    return empty;
  }

  // this method is to show the elements
  public void view() {
    System.out.print("QUEUE CONTENT :");
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }

}

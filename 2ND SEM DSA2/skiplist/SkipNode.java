public class SkipNode {
  private int data;
  private SkipNode next;
  private SkipNode previous;
  private Node bottom;

  public SkipNode() {
    this.data = 0;
    this.next = null;
    this.bottom = null;
  }

  /*
  * Getters and Setters
  */
  
  public int getData() {
    return this.data;
  }
  
  public SkipNode getNext() {
    return this.next;
  }
  
  public SkipNode getPrevious() {
    return this.previous;
  }
  
  public Node getBottom() {
    return this.bottom;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(SkipNode next) {
    this.next = next;
  }

  public void setPrevious(SkipNode previous) {
    this.previous = previous;
  }
  
  public void setBottom(Node bottom) {
    this.bottom = bottom;
  }
}


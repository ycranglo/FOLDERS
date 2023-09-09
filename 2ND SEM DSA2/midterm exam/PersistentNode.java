public class PersistentNode {
  private int data;
  private LinkedList previousData;
  private boolean deleted;
  private PersistentNode nextNode;
  
  // Creates a new node with the passed data as value of the data property
  public PersistentNode(int data) {
    this.data = data;
    this.nextNode = null;
  }

  /*
   * Getters and Setters
  */
  
  public int getData() {
    return this.data;
  }
  
  public LinkedList getPreviousData() {
    return this.previousData;
  }
  
  public boolean getDeleted() {
    return this.deleted;
  }
  
  public PersistentNode getNextNode() {
    return this.nextNode;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }
  
  public void setNextNode(PersistentNode nextNode) {
    this.nextNode = nextNode;
  }
}

 public class LinkedList {
  private Node head;

  public void setHead(Node head){
    this.head=head;
  }
  public Node getNode(){
    return this.head;
  }
  //addnote
  public void addNote(Node node){
    //setting the head with first node
    if(head==null){
      head=node;
    }else{
      Node currentNode=head;
      while(currentNode.getNext()!=null)
        currentNode=currentNode.getNext();
        currentNode.setNext(node);
    }
  }
//displaying 
public void displayDetails(){
    System.out.print("THE VALUES ARE :");
    Node currentNode=head;
    while(currentNode!=null){
      System.out.print(currentNode.getData()+" ");
      currentNode=currentNode.getNext();
  }
  }
//append
public void AppendList(Node node){
  Node currentNode=head;
  while(currentNode.getNext()!=null)
    currentNode=currentNode.getNext();
    currentNode.setNext(node);

}
public void insertAfter(Node afterNode, int position){
  //holding the head node
  Node CurrentNode=head;
  //count for traversing the nodes,depends on the position
  int count =1;
  while(count<position){
    //getting the currentNode
    CurrentNode=CurrentNode.getNext();
    //increment
    count++;
  }
  //holds the currentNdoe(after the insert)
  Node afterNOde=CurrentNode.getNext();
  //setting the node pointer to the back of the nod
  CurrentNode.setNext(afterNode);
  //setting the next node after insert
  afterNode.setNext(afterNOde);
}
public void insertBefore(Node prevNode, int position){
 //holding the head node
 Node CurrentNode=head;
 //count for traversing the nodes,depends on the position
 int count =2;
 while(count<position){
   //getting the currentNode
   CurrentNode=CurrentNode.getNext();
   //increment
   count++;
 }
 //holds the currentNdoe(before the insert)
 Node afterNOde=CurrentNode.getNext();
 //setting the node pointer to the back of the nod
 CurrentNode.setNext(prevNode);
 //prevNode.setPrevious(CurrentNode)
 //setting the next node after insert
 prevNode.setNext(afterNOde);
}
public void deleteNode(int position){
 Node currentNode=head;
 int count=1;
 if(count==position){
  currentNode=currentNode.getNext().getNext();
  head.setData(head.getNext().getData());
  head.setNext(currentNode);
 }else{
  while(count<position-1){
    currentNode=currentNode.getNext();
    count++;
   }
   Node nextNode=currentNode.getNext().getNext();
   currentNode.setNext(nextNode);
  
 }
}
public void divider(){
  System.out.print("\n------------------------------------------\n");
}
}

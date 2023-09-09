public class Node{
private int data1;
private int data2;
private Node next;
private Node previous;

public Node( int data1, int data2){
  this.data1=data1;
  this.data2=data2;
  this.previous=null;
  this.next=null;
}
public void setNext(Node next){
  this.next=next;
}
public void setPrevious(Node previous){
  this.previous=previous;
}
public void setData1(int data1){
  this.data1=data1;
}
public void setData2(int data2){
  this.data2=data2;
}
public int getData1(){
  return this.data1;
}
public int getData2(){
  return this.data2;
}
public Node getNext(){
  return this.next;
}
public Node getPrev(){
  return this.previous;
}

}
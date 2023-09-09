import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
  
  private Node root;

  public BinaryTree(){
    this.root=null;
  } 
  public BinaryTree(Node root){
    this.root=root;
  }
  public Node getRoot(){
    return this.root;
  }
  public void setRoot(Node root){
    this.root=root;
  }
  //this is the add method
  public void insert(Node root,int data){
    
    Queue<Node> queue= new LinkedList<Node>();
    queue.add(root);

    while(!queue.isEmpty()){
      root=queue.peek();
      queue.remove();

      if(root.getLeft()==null){
        root.setLeft(new Node(data));
        break;
      }else
        queue.add(root.getLeft());
      if(root.getRight()==null){
        root.setRight(new Node(data));
        break;
      }else
        queue.add(root.getRight());
    }
  }

}

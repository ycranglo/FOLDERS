public class Main {
  public static void main(String[] args) {
    
    linkedlist_Union link= new linkedlist_Union();

    link.addNode(new Node(1), new Node(2));
    link.addNode(new Node(2), new Node(13));
    link.addNode(new Node(2), new Node(34));
    System.out.println(link.unionFind(new Node(2),new Node(34)));
    link.unionFind(new Node(2),new Node(34));
    


  }
}

public class Main {
  public static void main(String[] args) {
    
    LinkedList listt= new LinkedList();
    Node[] list= new Node[20];

    list[1]=listt.addNode(new Node(1));
    list[1]=listt.addNode(new Node(2));

    for(int q=0;q<list.length;q++){
      System.out.println(list[q]);
       System.out.print(listt.display());
    }
  }
}

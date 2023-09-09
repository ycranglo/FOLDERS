public class Main {
  public static void main(String[] args) {

    Queue queue = new Queue(5);
    queue.enqueue(new Node(1));
    queue.enqueue(new Node(2));
    queue.enqueue(new Node(3));
    queue.enqueue(new Node(4));
    queue.enqueue(new Node(5));
    System.out.println("PEEK VALUE :" + queue.peek());
    System.out.println("DELETED VALUE :" + queue.dequeue());
    queue.enqueue(new Node(6));
    queue.view();
    System.out.println("PEEK VALUE :" + queue.peek());
  }
}

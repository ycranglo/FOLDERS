class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedListStack {
    private Node top;
    private StringBuilder history;

    public LinkedListStack() {
        top = null;
        history = new StringBuilder();
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        displayStack();
        history.append(toString()).append("\n");
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty!");
        }
        int data = top.getData();
        top = top.getNext();
        displayStack();
        history.append(toString()).append("\n");
        return data;
    }

    public String toString() {
        Node current = top;
        StringBuilder builder = new StringBuilder();
        builder.append("Top -> ");
        while (current != null) {
            builder.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        builder.append("null");
        return builder.toString();
    }

    public void displayStack() {
        System.out.println(toString());
    }

    public void displayHistory() {
        System.out.println("Stack history:");
        System.out.println(history.toString());
    }
}
package Stack;

public class Stack {

    public static class Node {
        private int value;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

    }

    public int length;
    private Node head;

    public Stack() {
        this.head = null;
        this.length = 0;
    }

    public void push(int value) {
        Node node = new Node(value);
        this.length++;
        if (this.head == null) {
            this.head = node;
            return;
        }

        node.prev = this.head;
        this.head = node;
    }

    public int pop() {
        this.length = Math.max(0, this.length - 1);
        if (this.length == 0) {
            Node head = this.head;
            this.head = null;
            return head.value;
        }

        Node head = this.head;
        this.head = this.head.prev;

        return head.value;
    }

    public int peek() {
        return this.head.value;
    }
}

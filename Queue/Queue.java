package Queue;

public class Queue {

    public static class QNode {
        private int value;
        private QNode next;

        public QNode(int value) {
            this.value = value;
        }
    }

    public int length;
    private QNode head;
    private QNode tail;

    public Queue() {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void enqueue(int item) {
        QNode node = new QNode(item);
        this.length++;
        if (this.tail == null) {
            this.tail = this.head = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }

    public Integer deque() {
        if (this.head == null) {
            return null;
        }

        this.length--;

        QNode head = this.head;
        this.head = this.head.next;
        head.next = null;

        if (this.length == 0) {
            this.tail = null;
        }

        return head.value;
    }

    public int peek() {
        return this.head.value;
    }
}

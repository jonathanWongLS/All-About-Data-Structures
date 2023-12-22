package LinkedList;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

       public int getValue() {
           return value;
       }

       public void setValue(int value) {
           this.value = value;
       }

       public Node getNext() {
           return next;
       }

       public void setNext(Node next) {
           this.next = next;
       }
   }

    private Node head = null;

    // Append: Add a new node at the end of the linked list.
    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            this.head = new Node(value);
            return;
        }

        newNode.setNext(null);

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(newNode);
    }

    // Prepend: Add a new node at the beginning of the linked list.

    // Insert at Index: Insert a new node at a specified position in the linked list.

    // Delete by Value: Remove the first occurrence of a specific value in the linked list.

    // Delete at Index: Remove a node at a specified position in the linked list.

    // Print List: Display the elements of the linked list.
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("START");
        Node curr = head;

        if (curr == null) {
            out.append(" null");
            return out.toString();
        }

        while (curr != null) {
            out.append(" -> ").append(curr.getValue());
            curr = curr.getNext();
        }
        out.append(" -> null");
        return out.toString();
    }
}

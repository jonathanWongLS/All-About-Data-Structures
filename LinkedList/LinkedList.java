package LinkedList;

public class LinkedList {
    public class Node {
        private int value;
        private Node prev;
        private Node next;
    }

    private Node head = null;

    // Append: Add a new node at the end of the linked list.
    public void append(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            this.head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        newNode.prev = last;
        last.next = newNode;
    }

    // Prepend: Add a new node at the beginning of the linked list.
    public void prepend(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.prev = null;
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    // Insert at Index: Insert a new node at a specified position in the linked list.
    public void insertAtIndex(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be less than 0! (< 0)");
        }

        if (index == 0) {
            this.prepend(value);
            return;
        }

        Node newNode = new Node();
        newNode.value = value;

        int pointer = 0;
        Node curr = this.head;
        while (curr.next != null) {
            if (pointer == index) {
                newNode.prev = curr.prev;
                curr.prev.next = newNode;
                curr.prev = newNode;
                newNode.next = curr;
                return;
            }
            curr = curr.next;
            pointer++;
        }

        if (pointer == index) {
            newNode.prev = curr.prev;
            newNode.next = curr;
            curr.prev.next = newNode;
            curr.prev = newNode;
            return;
        } else if (pointer + 1 == index) {
            newNode.prev = curr;
            newNode.next = null;
            curr.next = newNode;
            return;
        }

        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds! The linked list has " + (pointer+1) + " elements.");
    }

    // Delete by Value: Remove the first occurrence of a specific value in the linked list.
    public Node deleteByValue(int value) {
        Node curr = this.head;
        while (curr != null) {
            if (curr.value == value) {
                // If curr is not the head
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                }
                else {
                    // If curr is the head
                    this.head = curr.next;
                }

                // If node to delete is the tail
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    // Delete at Index: Remove a node at a specified position in the linked list.
    public Node deleteAtIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be less than 0! (< 0)");
        }

        if (index == 0) {
            if (this.head != null) {
                Node deletedNode = this.head;
                this.head = this.head.next;
                this.head.next.prev = null;
                return deletedNode;
            }
            else {
                throw new NullPointerException("Linked list is empty! Head is null.");
            }
        }

        int pointer = 0;
        Node curr = this.head;
        while (curr != null) {
            if (pointer == index) {
                curr.prev.next = curr.next;

                // If node to delete is not the tail
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                return curr;
            }
            pointer++;
            curr = curr.next;
        }
        return null;
    }

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
            out.append(" -> ").append(curr.value);
            curr = curr.next;
        }
        out.append(" -> null");
        return out.toString();
    }
}

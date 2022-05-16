import java.util.NoSuchElementException;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    //Constructor here!
    //  ************
    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // methods here!\
    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node with data value
        Node node = new Node(data);
        // check if empty
        if (isEmpty()) {
            head = tail = node;
        } else { // add element to last position
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.print(current.value + "=> null");
            else System.out.print(current.value + "=>");
            current = current.next;
        }
    }

    // deletes first item with the value
    void deleteNode(int value) {
        if (isEmpty()) System.out.println("No Values with the value send!!!");

        //first one

        Node current = head;
        Node previous = head;
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;
                } else {
                    previous.next = current.next;
                    current.next = null;
                }
                previous = current;
                current = current.next;
            }
        }
    }

    int indexOf(int value) {
        int position = 0;
        Node current = head;
        if (isEmpty()) return -1;

        while (current != null) {
            if (current.value == value) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

}
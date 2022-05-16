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
        System.out.println();
    }

    // deletes first item with the value
    void deleteNode(int value) {
        if (isEmpty()) System.out.println("No Values with the value send!!!");
        //first one
        Node current = head;
        Node previous = head;
        while (current != null) {
            if (current.value == value) { // If you find a match
                if (current == head) { // if the item to be deleted is the head
                    head = current.next;
                    current.next = null; // will be available for garbage collection
                } else if (current == tail) { // if the item to be deleted is the tail
                    tail = previous;
                    previous.next = null;
                } else { // if the item to be deleted is in the middle
                    previous.next = current.next;
                    current.next = null;
                }
                size--; //decrease the size once you
            }
            previous = current;
            current = current.next;
        }
    }

    public int getKthFromLast(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) return -1;
        }
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.value;
    }

    public void removeKthFromLast(int k) {
        Node previousDelete = null;
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) System.out.println("No such value");
        }
        while (ptr2.next != null) {
            previousDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            previousDelete.next = ptr1.next;
            ptr1.next = null;
            size--;
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
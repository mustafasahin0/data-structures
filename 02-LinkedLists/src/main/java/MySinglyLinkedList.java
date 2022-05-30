public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    //Constructor here
    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    // Adds elements into last position in the linked list
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
            if (current.next == null) {
                System.out.print(current.value + "=> null");
            } else {
                System.out.print(current.value + " => ");
            }
            current = current.next;
        }
    }

    void deleteNode() {

    }

    public int getKthFromLast(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        if (ptr2 == null) {
            return -1;
        }
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.value;
    }

    public void removeKthFromLast(int k) {
        Node prevDelete = null;
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        if (ptr2 == null) {
            System.out.println("No Such Value");
        }
        while (ptr2.next != null) {
            prevDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            prevDelete.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }

    int indexOf(int value) {
        int pos = 0;
        Node current = head;
        if (isEmpty()) {
            return -1;
        }
        while (current != null) {
            if (current.value == value) {
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    // deletes first occurrence
    void deleteNode(int value) {
        if (isEmpty()) {
            System.out.println("No Values");
        }
        //first one
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }

            prev = current;
            current = current.next;
        }
    }


}

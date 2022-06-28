public class Assignment4ReverseLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
    // Assignment 4 Reverse the Nodes of Singly Linked List in one pass
    // O(n) time complexity , O(1) space complexity
    public static void reverse(MySinglyLinkedList list) {
        if (list.isEmpty()) return;
        Node previous = list.head;
        Node current = list.head.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        list.tail = list.head;
        list.tail.next = null;
        list.head = previous;
    }
}
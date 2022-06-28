
public class Assignment3RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList list1=new MySinglyLinkedList();
        int[] numbers={1,1,2,2,2,3,4,4,4,4,5,6,6};
        for(int i=0;i<12;i++) list1.add(numbers[i]);
        System.out.println("With duplicates");
        list1.printNodes();
        System.out.println("Without duplicates");
        removeDuplicatesFromLinkedList(list1.head);
        list1.printNodes();

    }
    // Assignment 3 Remove Duplicated values from SLL
    // O(n) time | O(1) space - where n is the number of nodes in the Linked List
    public static void removeDuplicatesFromLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.value == current.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }
    }
}
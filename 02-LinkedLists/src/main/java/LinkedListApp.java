public class LinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList list1 = new MySinglyLinkedList();

        for (int i = 0; i < 11; i++) {
            list1.add(i);
        }

        list1.printNodes();
        System.out.println("Last Kth item from last is: " + list1.getKthFromLast(4));
        list1.removeKthFromLast(3);
        list1.printNodes();

    }
}

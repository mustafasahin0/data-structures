public class LinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList list1 = new MySinglyLinkedList();

        for (int i = 0; i < 11; i++) {
            list1.add(i);
        }
        list1.printNodes();
        System.out.println();
        System.out.println("Kth item from last is " + list1.getKthFromLast(4));
        System.out.println(list1.indexOf(4));
        System.out.println(list1.size);
    }
}


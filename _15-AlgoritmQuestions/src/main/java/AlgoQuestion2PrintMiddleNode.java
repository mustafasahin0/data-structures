public class AlgoQuestion2PrintMiddleNode {

    public static void main(String[] args) {
        MySinglyLinkedList2 sll = new MySinglyLinkedList2();

        for (int i = 1; i < 11; i++) {
            sll.add(i);
        }
        sll.printNodes();
        System.out.println();
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList2 sll) {
        if (sll.isEmpty()) throw new IllegalArgumentException();
        Node sJump = sll.head;
        Node dJump = sll.head;

        while (dJump != sll.tail && dJump.next != sll.tail) {
            sJump = sJump.next;
            dJump = dJump.next.next;
        }
        if (dJump == sll.tail) System.out.println(sJump.value);
        else System.out.println(sJump.value + ", " + sJump.next.value);
    }
}

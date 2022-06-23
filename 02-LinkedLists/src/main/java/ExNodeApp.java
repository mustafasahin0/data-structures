import java.util.LinkedList;

public class ExNodeApp {

    public static void main(String[] args) {

        ExNode a = new ExNode(1);
        ExNode b = new ExNode(2);
        ExNode c = new ExNode(3);
        ExNode d = new ExNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        //  printNode(a);

        //  System.out.println("sum(a) = " + sum(a));

        System.out.println(findElement(a, 4));

        System.out.println(get(a, 3));
    }

    public static void printNode(ExNode node) {
        ExNode current = node;
        while (current != null) {

            System.out.println(current.value);
            current = current.next;

        }
    }

    public static int sum(ExNode head) {
        int sum = 0;
        ExNode current = head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }

    public static boolean findElement(ExNode head, int target) {
        boolean result = false;
        if (head == null) return result = false;
        ExNode current = head;

        while (current != null) {
            if (current.value == target) {
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    public static int get(ExNode head, int index) {
        ExNode current = head;
        if (current == null) return -1;
        int indexCounter = 0;
        int result = 0;
        while (current != null) {
            if (indexCounter == index) {
                result = current.value;
            }
            indexCounter++;
            current = current.next;
        }
        return result;
    }

    public static ExNode reverseList(ExNode head) {
        ExNode prev = null;
        ExNode current = head;
        while (current != null){
            ExNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

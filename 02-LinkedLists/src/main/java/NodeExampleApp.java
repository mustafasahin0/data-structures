import java.util.ArrayList;
import java.util.List;

public class NodeExampleApp {
    static List<String> nodeList = new ArrayList<>();

    public static void main(String[] args) {

        MyNode nodeA = new MyNode("Node A");
        MyNode nodeB = new MyNode("Node B");
        MyNode nodeC = new MyNode("Node C");
        MyNode nodeD = new MyNode("Node D");


        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        // A -> B -> C -> D -> null

        //Iterating over the list
        printNodeRecursively(nodeA);
      //  printNode(nodeA);

        System.out.println("nodeList(nodeA) = " + nodeList(nodeA));

        System.out.println("nodeListRecursive(nodeA) = " + nodeListRecursive(nodeA));
    }

    public static void printNode(MyNode head){
        MyNode current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void printNodeRecursively(MyNode head){
        if(head == null) return;
        System.out.println(head.value);
        printNodeRecursively(head.next);
    }

    public static List<String> nodeList(MyNode head){
        List<String> nodeList = new ArrayList<>();
        MyNode current = head;
        while (current != null) {
            nodeList.add(current.value);
            current = current.next;
        }
        return nodeList;
    }

    public static List<String> nodeListRecursive(MyNode head){
        fillValues(head);
        return nodeList;
    }

    private static void fillValues(MyNode head) {
        if(head == null) return;
        nodeList.add(head.value);
        fillValues(head.next);

    }


}

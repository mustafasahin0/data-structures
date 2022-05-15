public class NodeExampleApp {

    public static void main(String[] args) {

        MyNode nodeA = new MyNode("Node A");
        MyNode nodeB = new MyNode("Node B");
        MyNode nodeC = new MyNode("Node C");

        nodeA.next = nodeB;

        System.out.println(nodeA);
        System.out.println(nodeB);
        System.out.println(nodeC);
    }
}

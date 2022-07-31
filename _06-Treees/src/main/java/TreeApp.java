public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 5, 12, 3, 6, 11, 13, 2};

        for (int i = 0; i < 8; i++) {
            tree.insert(numbers[i]);
        }


        System.out.println("Pre_Order Traversal");
        tree.preOrderTraversal(tree.root);

    }
}

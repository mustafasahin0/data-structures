public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }
    public void insert(int value){
        Node newNode=new Node(value);
        if(root==null) {
            root=newNode;
            return;
        }
        Node current=root;
        while(true){
            if(value<=current.value) {
                if (current.leftChild==null) {
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else  {
                if (current.rightChild==null) {
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }

        }
    }// end insert

    // PreOrder Traversal of Tree  Root-Left-Right

    public void preOrderTraversal(Node root){
        if (root==null) return;
        System.out.print(root.value+", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    // In-Order Traversal of Tree  Root-Left-Right
    public void inOrderTraversal(Node root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    // Post-Order traversal  Left-Right-Root
    public void postOrderTraversal(Node root){
        if (root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");

    }

}

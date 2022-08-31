public class HeapMainApp {
    public static void main(String[] args) {

        MyHeap heap = new MyHeap(8);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(83);
        heap.printHeap();

    }
}
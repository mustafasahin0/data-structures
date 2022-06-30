public class QueueTestApp {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println(myQueue.peek());
        System.out.println("Removed item from Queue is : " + myQueue.dequeue());
        System.out.println("Removed item from Queue is : " + myQueue.dequeue());
    }
}

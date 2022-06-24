public class StacksExampleApp {
    public static void main(String[] args) {
        var myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("Size of the stack is: " + myStack.size());
    }
}

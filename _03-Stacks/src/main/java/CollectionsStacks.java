import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CollectionsStacks {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println("Stack Elements are: ");
        stack.forEach(System.out::println);
        System.out.println("Top of the stack is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Stack Elements are after pop: ");
        stack.forEach(System.out::println);



    }
}

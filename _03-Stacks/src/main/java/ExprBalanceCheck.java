import java.util.Scanner;

public class ExprBalanceCheck {

    public static void main(String[] args) {
        System.out.println("Enter expression");
        Scanner scan = new Scanner(System.in);
        String expression = scan.next();
        System.out.println(balanceCheck(expression));

    }

    public static boolean balanceCheck(String expr) {
        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;
            if (ch == '(' || ch == '[' || ch == '{') {
                // Push openning symbol to stack
                myStack.push(ch);
                continue;
            }
            //At this point ch is a closing symbol
            //Stack should not be empty
            if (myStack.isEmpty()) return false;
            char match;
            switch (ch) {
                case ')':
                    match = myStack.pop();
                    if (match != '(') return false;
                    break;
                case ']':
                    match = myStack.pop();
                    if (match != '[') return false;
                    break;
                case '}':
                    match = myStack.pop();
                    if (match != '{') return false;
                    break;
            }
        }
        return (myStack.isEmpty());
    }
}

public class FactorialIterative {
    public static void main(String[] args) {


    }

    public static long factorial(long num) {
        if (num == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }

    public static long factorialR(long num) {
        if (num == 0) return 1;
        else return num * factorialR(num - 1);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BigOExampleSet1 {

    public static void main(String[] args) {
        int n = 10000;
        int m = 100;
        System.out.println("Input size n is " + n);

        //Task1 Single Loop.....................
        long startTime = System.currentTimeMillis();
        int numberOfOperations = 0;
        for (int i = 0; i < n; i++) {
            numberOfOperations++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Number of Operations in Task # 1 O(n) " + numberOfOperations + " in " + (endTime - startTime) + " milisecs");

        //Task 1 End...................
        // ............................
        // Task 2 Nested Loop .........
        startTime = System.currentTimeMillis();
        numberOfOperations = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of Operations in Task # 2 O(n^2) " + numberOfOperations + " in " + (endTime - startTime) + " milisecs");
        //Task 2 End...................
        // ............................
        // Task 3 Three Nested Loop .........
        startTime = System.currentTimeMillis();
        long numberOfOperations2 = (long) 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations2++;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of Operations in Task # 3 O(n^3) " + numberOfOperations + " in " + (endTime - startTime) + " milisecs");
        //Task 3 End...................
        // ............................
        // Task 4 N and M Nested Loops .........
        startTime = System.currentTimeMillis();
        numberOfOperations = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of Operations in Task # 4 O(nxm) " + numberOfOperations + " in " + (endTime - startTime) + " milisecs");
        //Task 4 End...................
        // ............................
        // Task 5 N and M Nested Loops .........
        startTime = System.currentTimeMillis();
        numberOfOperations = 0;
        for (int i = 1; i <= n; i = i * 2) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of Operations in Task # 5 O(log(n)) " + numberOfOperations + " in " + (endTime - startTime) + " milisecs");

    }
}

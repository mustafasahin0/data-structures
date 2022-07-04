import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskLongestRange {

    public static void main(String[] args) {
        int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(longestRange(array)));

    }

    public static int[] longestRange(int[] array) {

        int[] bestRange = new int[2];
        int longest = 0;
        Map<Integer, Boolean> numsVisited = new HashMap<>();
        for (int num : array) {
            numsVisited.put(num, false);
        }
        for (int num : array) {
            if (numsVisited.get(num)) {
                continue;
            }
            numsVisited.put(num, true);
            int currentLength = 1;
            int left = num - 1;
            int right = num + 1;
            while (numsVisited.containsKey(left)) {
                numsVisited.put(left, true);
                left--;
                currentLength++;
            }
            while (numsVisited.containsKey(right)) {
                numsVisited.put(right, true);
                right++;
                currentLength++;
            }
            if (currentLength > longest) {
                longest = currentLength;
                bestRange = new int[]{left + 1, right - 1};
            }
        }
        return bestRange;
    }
}

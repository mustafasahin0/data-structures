import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println("twoSumTwoPointer(new int[]{1, 3, 4, 5, 1, -2, -4, -1}, 2).toString() = " + twoSumTwoPointer(new int[]{1, 3, 4, 5, 1, -2, -4, -1}, 2).toString());
    }

    public static List<List<Integer>> twoSumTwoPointer(int[] array, int target) {
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            if (i > 0 && array[i - 1] == array[i]) {
                continue;
            }
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == target) {
                    result.add(Arrays.asList(array[i], array[left], array[right]));
                    while (left < right && array[left] == array[left + 1]) {
                        left++;
                    }
                    while (left < right && array[right] == array[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
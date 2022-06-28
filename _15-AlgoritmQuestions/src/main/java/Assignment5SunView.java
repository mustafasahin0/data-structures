import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class Assignment5SunView {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings, "WEST").forEach(System.out::println);
    }

    private static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings = new Stack<>();
        int startIndex = 0;
        int step = 1;
        int idx = startIndex;
        if (direction.equals("WEST")) {
            startIndex = buildings.length - 1;
            step = -1;
        }
        while (idx >= 0 && idx < buildings.length) {
            while (!candidateBuildings.isEmpty() && buildings[candidateBuildings.peek()] <= buildings[idx]) {
                candidateBuildings.pop();
            }
            candidateBuildings.push(idx);
            idx += step;
        }
        return new ArrayList<Integer>(candidateBuildings);
    }
}

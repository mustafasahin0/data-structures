import java.util.LinkedHashMap;

public class AlgoQuestion1LRUCache2 {

    public static void main(String[] args) {
        LRUCache2 lhm = new LRUCache2(3);
        lhm.put(1, 1);
        lhm.put(2, 2);
        lhm.put(3, 3);
        lhm.put(4, 4);
        lhm.entrySet().forEach(entry -> {
            System.out.println("Key is: " + entry.getValue() + " Value is: " + entry.getValue());
        });
        System.out.println();
    }
}

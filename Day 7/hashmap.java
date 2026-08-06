import java.util.*;

public class  hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(101, "Ganesh");
        map.put(102, "Rahul");
        map.put(103, "Kiran");

        // Display
        System.out.println(map);

        // Get value
        System.out.println("Key 102: " + map.get(102));

        // Check key
        System.out.println(map.containsKey(101));

        // Remove
        map.remove(103);

        // Iterate
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
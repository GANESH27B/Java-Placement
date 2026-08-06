import java.util.*;

public class hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println(set);

        System.out.println(set.contains(20));

        set.remove(10);

        for (int x : set) {
            System.out.println(x);
        }
    }
}
import java.util.*;

public class treeset {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);

        System.out.println(set);

        System.out.println("First : " + set.first());
        System.out.println("Last : " + set.last());

        for (int x : set) {
            System.out.println(x);
        }
    }
}
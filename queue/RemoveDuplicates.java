import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        Queue<Integer> result = new LinkedList<>();

        for (int x : queue) {
            if (!result.contains(x)) {
                result.add(x);
            }
        }

        System.out.println("Original: " + queue);
        System.out.println("Without duplicates: " + result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(50);
        queue.add(20);
        queue.add(40);
        queue.add(30);

        int max = Integer.MIN_VALUE;

        for (int x : queue) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Maximum: " + max);
    }
}
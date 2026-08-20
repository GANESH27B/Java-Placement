import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Add
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Front element
        System.out.println("Front: " + queue.peek());

        // Remove
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}
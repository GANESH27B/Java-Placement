import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek
        System.out.println("Top: " + stack.peek());

        // Pop
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop: " + stack);
    }
}
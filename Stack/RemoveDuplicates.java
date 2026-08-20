import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(20);

        Stack<Integer> result = new Stack<>();

        for (int x : stack) {
            if (!result.contains(x)) {
                result.push(x);
            }
        }

        System.out.println("Original: " + stack);
        System.out.println("Without duplicates: " + result);
    }
}
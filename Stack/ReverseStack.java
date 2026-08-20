import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        Stack<Integer> reverse = new Stack<>();

        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reverse);
    }
}
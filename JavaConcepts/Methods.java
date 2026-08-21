public class Methods {
    static int add(int first, int second) {
        return first + second;
    }

    static void printGreeting(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        printGreeting("Java learner");
        System.out.println("Sum: " + add(10, 20));
    }
}
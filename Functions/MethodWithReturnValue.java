public class MethodWithReturnValue {
    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
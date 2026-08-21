public class MethodOverloading {
    static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Integer result: " + multiply(4, 5));
        System.out.println("Decimal result: " + multiply(2.5, 4.0));
    }
}
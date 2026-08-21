public class Operators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 3;

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
        System.out.println("Remainder: " + (firstNumber % secondNumber));
        System.out.println("Is first number larger? " + (firstNumber > secondNumber));
        System.out.println("Both are positive? " + (firstNumber > 0 && secondNumber > 0));
    }
}
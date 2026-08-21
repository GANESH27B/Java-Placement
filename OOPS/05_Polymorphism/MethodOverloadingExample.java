class CalculatorOverload {
    int add(int first, int second) {
        return first + second;
    }

    double add(double first, double second) {
        return first + second;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        CalculatorOverload calculator = new CalculatorOverload();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.5, 3.5));
    }
}
public class Variables {
    static String classVariable = "Shared by the class";

    public static void main(String[] args) {
        int localVariable = 10;
        final double constant = 3.14;

        System.out.println("Local variable: " + localVariable);
        System.out.println("Class variable: " + classVariable);
        System.out.println("Constant: " + constant);
    }
}
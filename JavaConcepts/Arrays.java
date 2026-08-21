public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Total: " + total);
        System.out.println("Length: " + numbers.length);
    }
}
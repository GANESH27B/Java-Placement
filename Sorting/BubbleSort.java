import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};

        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int index = 0; index < numbers.length - pass - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temporary = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temporary;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
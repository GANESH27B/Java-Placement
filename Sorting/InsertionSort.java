import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        for (int index = 1; index < numbers.length; index++) {
            int current = numbers[index];
            int previousIndex = index - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > current) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex--;
            }
            numbers[previousIndex + 1] = current;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
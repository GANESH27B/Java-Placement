import java.util.Arrays;

public class BucketSort {
    static void sort(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int number : numbers) {
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        int[] counts = new int[maximum - minimum + 1];
        for (int number : numbers) {
            counts[number - minimum]++;
        }

        int position = 0;
        for (int index = 0; index < counts.length; index++) {
            while (counts[index]-- > 0) {
                numbers[position++] = index + minimum;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, -1, 3, 4, 2, 0};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
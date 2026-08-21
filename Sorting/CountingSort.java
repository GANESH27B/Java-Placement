import java.util.Arrays;

public class CountingSort {
    static void sort(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            largest = Math.max(largest, number);
        }

        int[] counts = new int[largest + 1];
        for (int number : numbers) {
            counts[number]++;
        }

        int position = 0;
        for (int value = 0; value < counts.length; value++) {
            while (counts[value] > 0) {
                numbers[position++] = value;
                counts[value]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 2, 8, 3, 3, 1};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
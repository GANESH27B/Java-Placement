import java.util.Arrays;

public class RadixSort {
    static void sort(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            largest = Math.max(largest, number);
        }

        for (int place = 1; largest / place > 0; place *= 10) {
            sortByPlace(numbers, place);
        }
    }

    static void sortByPlace(int[] numbers, int place) {
        int[] output = new int[numbers.length];
        int[] counts = new int[10];

        for (int number : numbers) {
            counts[(number / place) % 10]++;
        }
        for (int index = 1; index < counts.length; index++) {
            counts[index] += counts[index - 1];
        }
        for (int index = numbers.length - 1; index >= 0; index--) {
            int digit = (numbers[index] / place) % 10;
            output[counts[digit] - 1] = numbers[index];
            counts[digit]--;
        }
        System.arraycopy(output, 0, numbers, 0, numbers.length);
    }

    public static void main(String[] args) {
        int[] numbers = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
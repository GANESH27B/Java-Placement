import java.util.Arrays;

public class ShellSort {
    static void sort(int[] numbers) {
        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {
            for (int index = gap; index < numbers.length; index++) {
                int value = numbers[index];
                int position = index;
                while (position >= gap && numbers[position - gap] > value) {
                    numbers[position] = numbers[position - gap];
                    position -= gap;
                }
                numbers[position] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 34, 54, 2, 3};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
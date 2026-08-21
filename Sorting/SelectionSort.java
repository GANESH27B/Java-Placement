import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        for (int index = 0; index < numbers.length - 1; index++) {
            int smallestIndex = index;
            for (int nextIndex = index + 1; nextIndex < numbers.length; nextIndex++) {
                if (numbers[nextIndex] < numbers[smallestIndex]) {
                    smallestIndex = nextIndex;
                }
            }

            int temporary = numbers[index];
            numbers[index] = numbers[smallestIndex];
            numbers[smallestIndex] = temporary;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
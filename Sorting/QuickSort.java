import java.util.Arrays;

public class QuickSort {
    static void sort(int[] numbers, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(numbers, low, high);
        sort(numbers, low, pivotIndex - 1);
        sort(numbers, pivotIndex + 1, high);
    }

    static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerIndex = low - 1;

        for (int index = low; index < high; index++) {
            if (numbers[index] <= pivot) {
                smallerIndex++;
                swap(numbers, smallerIndex, index);
            }
        }

        swap(numbers, smallerIndex + 1, high);
        return smallerIndex + 1;
    }

    static void swap(int[] numbers, int first, int second) {
        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        sort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
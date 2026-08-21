import java.util.Arrays;

public class HeapSort {
    static void sort(int[] numbers) {
        for (int index = numbers.length / 2 - 1; index >= 0; index--) {
            heapify(numbers, numbers.length, index);
        }

        for (int end = numbers.length - 1; end > 0; end--) {
            swap(numbers, 0, end);
            heapify(numbers, end, 0);
        }
    }

    static void heapify(int[] numbers, int size, int root) {
        int largest = root;
        int left = root * 2 + 1;
        int right = root * 2 + 2;

        if (left < size && numbers[left] > numbers[largest]) {
            largest = left;
        }
        if (right < size && numbers[right] > numbers[largest]) {
            largest = right;
        }
        if (largest != root) {
            swap(numbers, root, largest);
            heapify(numbers, size, largest);
        }
    }

    static void swap(int[] numbers, int first, int second) {
        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
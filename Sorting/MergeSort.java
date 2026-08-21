import java.util.Arrays;

public class MergeSort {
    static void sort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        sort(numbers, left, middle);
        sort(numbers, middle + 1, right);
        merge(numbers, left, middle, right);
    }

    static void merge(int[] numbers, int left, int middle, int right) {
        int[] result = new int[right - left + 1];
        int first = left;
        int second = middle + 1;
        int resultIndex = 0;

        while (first <= middle && second <= right) {
            if (numbers[first] <= numbers[second]) {
                result[resultIndex++] = numbers[first++];
            } else {
                result[resultIndex++] = numbers[second++];
            }
        }

        while (first <= middle) {
            result[resultIndex++] = numbers[first++];
        }
        while (second <= right) {
            result[resultIndex++] = numbers[second++];
        }

        for (int index = 0; index < result.length; index++) {
            numbers[left + index] = result[index];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        sort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
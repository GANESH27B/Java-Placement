import java.util.Arrays;

public class BinarySearch {
    static int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {19, 4, 12, 7, 25};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Index: " + search(numbers, 19));
    }
}
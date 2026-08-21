public class LinearSearch {
    static int search(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 7, 19, 4, 25};
        System.out.println("Index: " + search(numbers, 19));
    }
}
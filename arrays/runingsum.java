import java.util.*;

class runingsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int product = 1;
            for (int j = 0; j < size; j++) {

                if (i != j) {
                    product = product * nums[j];
                }
            }
            result[i] = product;
        }
        System.out.println(Arrays.toString(result));
    }
}
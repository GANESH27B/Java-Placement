import java.util.*;

public class missingvalue{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Missing Numbers: ");

        for (int i = 0; i < size - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.print(j + " ");
            }
        }
    }
}
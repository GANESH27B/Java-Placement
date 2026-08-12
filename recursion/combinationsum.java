import java.util.*;
public class Main {
    static void solve(int[] arr, int target, int index,
                      ArrayList<Integer> list,
                      ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            solve(arr, target - arr[i], i, list, result);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(arr, target, 0, new ArrayList<>(), result);
        System.out.println("Combinations:");
        for (ArrayList<Integer> combination : result) {
            System.out.println(combination);
        }
        sc.close();
    }
}
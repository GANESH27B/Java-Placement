import java.util.*;

class perfectsquare {

    static int find(int n) {
        if (n == 0) {
            return 0;
        }
        int min = n;
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int count = 1 + find(n - square);
            if (count < min) {
                min = count;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Answer: " + find(n));
        sc.close();
    }
}
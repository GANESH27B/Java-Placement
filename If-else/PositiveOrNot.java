import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println((num > 0) ? "Positive" : "Not Positive");

        sc.close();
    }
}
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? year + " is a leap year" : year + "is  not a leap year");
    }
}

import java.util.*;

class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission amount: ");
        double commission = sc.nextDouble();

        double percentage = (commission / sales) * 100;

        System.out.println("Commission Percentage: " + percentage + "%");
    }
}
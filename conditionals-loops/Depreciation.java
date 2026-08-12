import java.util.*;

class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original cost: ");
        double cost = sc.nextDouble();

        System.out.print("Enter salvage value: ");
        double salvage = sc.nextDouble();

        System.out.print("Enter useful life in years: ");
        int life = sc.nextInt();

        double depreciation = (cost - salvage) / life;

        System.out.println("Annual Depreciation: " + depreciation);
    }
}
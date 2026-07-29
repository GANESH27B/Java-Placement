import java.util.*;
public class rupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();
        
        // Assuming an approximate exchange rate (e.g., 1 USD = 83.50 INR)
        double exchangeRate = 95.64; 
        double usd = rupees / exchangeRate;
        
        System.out.printf(rupees +" Rupees is equal to usd " +  usd);
        sc.close();
    }

}

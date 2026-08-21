interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay(250);
    }
}
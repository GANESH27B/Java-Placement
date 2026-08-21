class PaymentMethod {
    void pay() {
        System.out.println("Generic payment");
    }
}

class CardPayment extends PaymentMethod {
    @Override
    void pay() {
        System.out.println("Card payment");
    }
}

class CashPayment extends PaymentMethod {
    @Override
    void pay() {
        System.out.println("Cash payment");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        PaymentMethod[] payments = {new CardPayment(), new CashPayment()};
        for (PaymentMethod payment : payments) {
            payment.pay();
        }
    }
}
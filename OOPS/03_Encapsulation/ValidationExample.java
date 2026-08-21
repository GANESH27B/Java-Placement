class ValidatedAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ValidationExample {
    public static void main(String[] args) {
        ValidatedAccount account = new ValidatedAccount();
        account.deposit(1000);
        account.deposit(-50);
        System.out.println(account.getBalance());
    }
}
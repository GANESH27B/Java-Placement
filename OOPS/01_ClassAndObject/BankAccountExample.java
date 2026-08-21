class OopsAccount {
    String holder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        OopsAccount account = new OopsAccount();
        account.holder = "Ganesh";
        account.deposit(1500);
        System.out.println(account.holder + ": " + account.balance);
    }
}
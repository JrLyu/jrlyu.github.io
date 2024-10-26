public class BankAccount {
    private double balance;

    public BankAccount(double x) {
        balance = x;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}

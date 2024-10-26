public class CompareBankAccount {
    private double balance;
    public CompareBankAccount(double x) {
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

    public int compareTo(CompareBankAccount other) {
        double diff = this.getBalance() - other.getBalance();
        return (int) Math.signum(diff); // Math.signum(neg) = -1, Math.signum(0) = 0,   and   Math.signum(pos) = 1.
    }
}

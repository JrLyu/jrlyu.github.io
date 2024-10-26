public class InterfaceBankAccount implements ComparableThing{
    private double balance;
    public InterfaceBankAccount(double x) {
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

    @Override
    // We must override compareTo( ) using the same signature in ComparableThing
    public int compareTo(ComparableThing other) {
        InterfaceBankAccount help = (InterfaceBankAccount) other; // otherwise, we do not have getArea() for a ComparableThing object
        double diff = this.getBalance() - help.getBalance();
        return (int) Math.signum(diff); // Math.signum(neg) = -1, Math.signum(0) = 0,   and   Math.signum(pos) = 1.
    }
}

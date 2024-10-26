public class SavingAccount extends BankAccount{
    private double interestRate = 0.05;
    private final static int MAXNUMFREE = 3;
    private final static double PENALTY = 1.0;
    private int numWithdrawals;

    public SavingAccount(double x){
        super(x);
    }

    // Reset # withdrawal at the end of a month
    public void resetWithdrawals() {
        numWithdrawals = 0;
    }

    @Override // a special annotation for overriding methods
    public void withdraw(double amount) { // overrides
        super.withdraw(amount); // if super is omitted, we will run into a recursion that never ends.
        numWithdrawals++;
        if ( numWithdrawals > MAXNUMFREE )
            super.withdraw(PENALTY); // penalty
    }

    public void addInterest() {
        deposit(interestRate / 12 * getBalance());
    }
}

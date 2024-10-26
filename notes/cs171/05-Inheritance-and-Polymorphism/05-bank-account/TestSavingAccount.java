public class TestSavingAccount {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(100);

        a.withdraw(10);
        System.out.println(a.getBalance());  // 90
        a.withdraw(10);
        System.out.println(a.getBalance());  // 80
        a.withdraw(10);
        System.out.println(a.getBalance());  // 70
        a.withdraw(10);
        System.out.println(a.getBalance());  // 59 ! ($1 penalty)
    }
}

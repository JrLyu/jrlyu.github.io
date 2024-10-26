public class TestInterface {
    public static void main(String[] args) {
        System.out.println("------ Sort Bank Accounts ------\nBefore Sorting:");
        InterfaceBankAccount[] myAccount = new InterfaceBankAccount[4];
        myAccount[0] = new InterfaceBankAccount(400);
        myAccount[1] = new InterfaceBankAccount(300);
        myAccount[2] = new InterfaceBankAccount(500);
        myAccount[3] = new InterfaceBankAccount(200);
        for ( int i = 0; i < myAccount.length; i++ ) {
            System.out.print(myAccount[i].getBalance() + " ");
        }
        System.out.println();
        InterfaceSort.selectionSort(myAccount);  // Uses upcasting !
        System.out.println("After Sorting: ");
        for (int i = 0; i < myAccount.length; i++) {
            System.out.print(myAccount[i].getBalance() + " ");
        }
        System.out.println();

        System.out.println("------ Sort Circles ------\nBefore Sorting:");
        InterfaceCircle[] myCircle = new InterfaceCircle[4];
        myCircle[0] = new InterfaceCircle("red", 4);
        myCircle[1] = new InterfaceCircle("red", 3);
        myCircle[2] = new InterfaceCircle("red", 5);
        myCircle[3] = new InterfaceCircle("red", 2);
        for ( int i = 0; i < myCircle.length; i++ ) {
            System.out.print(myCircle[i].getRadius() + " ");
        }
        System.out.println();
        InterfaceSort.selectionSort(myCircle);  // Uses upcasting !
        System.out.println("After Sorting: ");
        for (int i = 0; i < myCircle.length; i++) {
            System.out.print(myCircle[i].getRadius() + " ");
        }
        System.out.println();
    }
}
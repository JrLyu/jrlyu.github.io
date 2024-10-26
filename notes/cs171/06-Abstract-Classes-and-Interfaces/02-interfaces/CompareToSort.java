// As we can see, even if the way we define compareTo in CompareBankAccount and CompareCircle are identical,
// we still need to write multiple selection sort algorithms in order to sort different objects.
// Can we avoid repeating our code? -- interface
public class CompareToSort {
    public static void main(String[] args) {
        System.out.println("------ Compare Circles ------\nBefore Sorting:");
        CompareCircle[] myCircle = new CompareCircle[4];
        myCircle[0] = new CompareCircle("red", 4);
        myCircle[1] = new CompareCircle("blue", 3);
        myCircle[2] = new CompareCircle("grey", 5);
        myCircle[3] = new CompareCircle("green", 2);
        for ( int i = 0; i < myCircle.length; i++ ) {
            System.out.print(myCircle[i].getRadius() + " ");
        }
        System.out.println("\nAfter Sorting:");
        selectionSort(myCircle);
        for ( int i = 0; i < myCircle.length; i++ ) {
            System.out.print(myCircle[i].getRadius() + " ");
        }
        System.out.println();
        System.out.println("------ Compare Bank Accounts ------\nBefore Sorting:");
        CompareBankAccount[] myAccount = new CompareBankAccount[4];
        myAccount[0] = new CompareBankAccount(400);
        myAccount[1] = new CompareBankAccount(300);
        myAccount[2] = new CompareBankAccount(500);
        myAccount[3] = new CompareBankAccount(200);
        for ( int i = 0; i < myAccount.length; i++ ) {
            System.out.print(myAccount[i].getBalance() + " ");
        }
        System.out.println("\nAfter Sorting: ");
        selectionSort(myAccount);
        for ( int i = 0; i < myAccount.length; i++ ) {
            System.out.print(myAccount[i].getBalance() + " ");
        }
        System.out.println();
    }

    public static void selectionSort(CompareCircle[] list) {
        for (int i = 0; i < list.length-1; i++) {
            CompareCircle min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if ( minIndex != i ) {
                CompareCircle help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }

    public static void selectionSort(CompareBankAccount[] list) {
        for (int i = 0; i < list.length-1; i++) {
            CompareBankAccount min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if ( minIndex != i ) {
                CompareBankAccount help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }
}

import java.util.Arrays;
public class TestSortInterfaceCircle {
    public static void main(String[] args) {
        SortInterfaceCircle[] arr = new SortInterfaceCircle[4];

        arr[0] = new SortInterfaceCircle("red", 4);
        arr[1] = new SortInterfaceCircle("green", 3);
        arr[2] = new SortInterfaceCircle("blue", 5);
        arr[3] = new SortInterfaceCircle("yellow", 2);

        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();

        Arrays.sort( arr );  // Sort Circle objects...

        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }
}

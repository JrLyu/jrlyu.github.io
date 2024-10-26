import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[4];
        arr[0] =  4;
        arr[1] =  2;
        arr[2] =  5;
        arr[3] =  1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);  // Sort array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

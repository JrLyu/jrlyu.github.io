import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int[] A = new int[]{};
        int a = 0;
        int b = a + n;

        int c = recurse(A, a, b);

        System.out.println("# time loop executed = " + c);
        System.out.println("2n - 1= " + (2*n-1));
    }
    public static int recurse(int[] A, int a, int b) {
        int c = 0;
        if (b-a <= 1) {
            c++;
            return c;
        } else {
            c++;
            return c + recurse(A, a, (a+b)/2) + recurse(A, (a+b)/2, b); // First half of array + 2nd half of array
        }
    }
}

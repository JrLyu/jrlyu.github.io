import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for ( int i = 0; i < 5*n; i = i + 4 ) {
            sum++;
            c++ ;              // Count # times we exec the loop
        }

        System.out.println("# time loop executed = " + c);
        System.out.println("(5/4)n = " + (double)5/4 * n);
    }
}

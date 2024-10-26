import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for (int i = n; i > 0; i = i - 4) {
            sum = sum + 1;
            c++;
        }

        System.out.println("# time loop executed = " + c);
        System.out.println("(1/4)n = " + (double)1/4 * n);
    }
}

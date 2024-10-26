import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j = j + i) {
                sum++;
                c++;
            }
        }

        System.out.println("# time loop executed = " + c);
        double x = 0;
        for (int i = 1; i <= n; i++) {
            x = x + 1 / (double) i;
        }
        System.out.println("n*HarmSum = " + n*x );
        System.out.println("nlog(n) = " + (double)n*Math.log(n)/Math.log(2));
    }
}

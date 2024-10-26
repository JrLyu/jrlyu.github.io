import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum++;
                c++;
            }
        }

        System.out.println("# time loop executed = " + c);
        System.out.println("n(n+1)/2 = " + (double)n*(n+1)/2);
    }
}

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for (int i = n; i > 0; i = i/2) {
            for (int j = 0; j < i; j++) {
                sum++;
                c++;
            }
        }

        System.out.println("# time loop executed = " + c);
        System.out.println("2n = " + (double)2*n);
    }
}

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = 0;

        int sum = 0;
        for (int i = n; i >= 1; i = i/2) {
            sum++;
            c++;
        }

        System.out.println("# time loop executed = " + c);
        System.out.println("log(n) = " + Math.log(n)/Math.log(2));
    }
}

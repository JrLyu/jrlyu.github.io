import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = recurse(n);

        System.out.println("# time loop executed = " + c);
        System.out.println("n + 1 = " + (n + 1));
    }

    public static int recurse(int n) {
        int c = 0;
        if (n == 0) {
            c++;
            return c;
        } else {
            c++;
            return c + recurse(n-1);
        }
    }
}

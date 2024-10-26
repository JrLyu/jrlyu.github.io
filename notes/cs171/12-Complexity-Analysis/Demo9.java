import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = in.nextInt();

        int c = recurse(n);

        System.out.println("# time loop executed = " + c);
        System.out.println("n(n+1)/2 + 1= " + (n*(n+1)/2+1));
    }
    public static int recurse(int n) {
        int c = 0;
        if (n == 0) {
            c++;
            return c;
        } else {
            for (int i = 0; i < n; i++) {
                c++;
            }
            return c + recurse(n-1);
        }
    }
}

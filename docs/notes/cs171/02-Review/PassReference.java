
import java.util.Arrays;

public class PassReference {
    public static void Method1(int[] x ) {// This x is local to Method1()
        System.out.println("Method1: x[1] before update = " + x[1]);
        x[1] = 4444;  // Update
        System.out.println("Method1: x[1] after update  = " + x[1]);
    }
    
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};  // x local var of main()
                                 // x references to array {1, 2, 3, 4}

        System.out.println("Main, before call: x[] = " + Arrays.toString(x));
        Method1(x);   // Passes main's x to Method1's x
        System.out.println("Main, after  call: x[] = " + Arrays.toString(x));
    }
}

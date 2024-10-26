public class PassPrimitive {
    public static void Method1(int x) {// This x is local to Method1() 
        System.out.println("Method1's parameter x before update = " + x);
        x = 4444;  // Update
        System.out.println("Method1's parameter x after update  = " + x);
    }
    
    public static void main(String[] args) {
        int x = 1;    // This x is local to main()         
        
        System.out.println("Main's x = " + x);
        Method1(x);   // Passes main's x to Method1's x
        System.out.println("Main's x after Method1 update = " + x); //  1 
    }
}

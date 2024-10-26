public class ExceptionDemo {
    public static void main(String[] args) {
        int[] a = new int[10];

        System.out.println("------ Catch Array Index Out Of Bounds Exception ------");
        try {
            a[99] = 1;  // Index out of range
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("------ Catch Any General Exception ------");
        try {
            a[99] = 1;  // Index out of range
        } catch (Exception e) { // an exception that is higher up in the hierarchy
            System.out.println(e);
        }

        // We can also catch multiple exceptions. But the most specific exception must be at the top
        System.out.println("------ Catch Two Exceptions ------");
        try {
            if (Math.random() < 0.5) {
                a = null; // Will cause NullPointerException
            } else {
                a[99] = 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("(1) " + e);
        } catch (Exception e) {
            System.out.println("(2) " + e);
        }
    }
}

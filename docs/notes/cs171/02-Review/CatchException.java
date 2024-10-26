public class CatchException {
    public static void main(String[] args) {
        try {
            double area = areaOfCircle(-4); // May return an "error code"
        } catch (RuntimeException e) {  // If "error code == RuntimeException)
            System.out.println("Error: " + e);
            System.out.println("... continue...");
        }
        System.out.println("DONE");
    }
   
   public static double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("***neg radius***"); // Returns an exception code
        } else {
            return 3.1415 * radius * radius;
        }
    }
}

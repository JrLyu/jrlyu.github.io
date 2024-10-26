public class ErrorCode {
    public static void main(String[] args) {
       if (areaOfCircle(-4) == -1) {
           System.out.println("Error... exiting...");
           System.exit(0);
        }
    }

   public static double areaOfCircle(double radius){
        if (radius < 0) {
            return -1;        // Error code
        } else {
            return 3.1415 * radius * radius;
        }
    }
}

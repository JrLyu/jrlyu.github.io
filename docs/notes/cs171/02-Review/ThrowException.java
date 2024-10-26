public class ThrowException {
    public static void main(String[] args) {
        double area = areaOfCircle(-4);
    }
    
    public static double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("***neg radius***"); // Returns an exception code
        } else {
            return 3.1415 * radius * radius;
        }
   }
}

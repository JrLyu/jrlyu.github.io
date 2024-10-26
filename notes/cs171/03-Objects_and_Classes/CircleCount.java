public class CircleCount {
    public double radius = 1; // An instance variable
    public static int count; // A static variable
    // Now, we can use the static method to initialize the value of count.
    static { // this block will be executed before the main method.
        count = 0;
    }

    public CircleCount() { }

    public CircleCount(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public void setReadius(double newRadius) {
        radius = newRadius;
    }
}

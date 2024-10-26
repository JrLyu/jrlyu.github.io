public class CircleCounting {
    private double radius = 1;
    private static int count = 0;

    public CircleCounting() {
        count++;
    }
    public CircleCounting(double newRadius) {
        radius = newRadius;
        count++;
    }
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public int getCount() {
        return count;
    }
}

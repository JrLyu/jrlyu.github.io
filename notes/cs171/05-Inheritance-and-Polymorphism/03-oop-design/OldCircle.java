public class OldCircle {
    private String color;
    private double radius;

    OldCircle(String col, double r) {
        color = col; radius = r;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }
}

public class Circle07 extends GeometricObject07{
    private double radius;
    Circle07(String c, double r) {
        super(c);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return radius * radius * 3.1415;
    }
}

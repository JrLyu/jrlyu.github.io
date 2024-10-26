package Geometrics;

public class ProtectedCircle extends ProtectedGeometricObject {
    protected double radius;

    public ProtectedCircle(String col, double r) {
        super(col);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    @Override
    public String toString() {
        return "Color = " + getColor() + ":" + "radius = " + radius;
    }
}

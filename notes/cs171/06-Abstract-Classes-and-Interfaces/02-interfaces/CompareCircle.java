public class CompareCircle extends SortGeometricObject{
    private double radius;
    CompareCircle(String col, double r) { // the constructor will not be inherited
        setColor(col); // color is private in GeometricObject
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    @Override
    public double getArea() { // override
        return 3.14159 * radius * radius;
    }
    @Override
    public String toString() {
        return "Color = " + getColor() + " : " + "Radius = " + getRadius();
    }

    public int compareTo(CompareCircle other) {
        double diff = this.getArea() - other.getArea();
        return (int) Math.signum(diff);
    }
}

public class InterfaceCircle extends SortGeometricObject implements ComparableThing{
    private double radius;
    InterfaceCircle(String col, double r) { // the constructor will not be inherited
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


    @Override
    // We must use the same signature to override
    public int compareTo(ComparableThing other) {
        // downcasting -- otherwise, we do not have getArea() for a ComparableThing object
        InterfaceCircle help = (InterfaceCircle) other;
        double diff = this.getArea() - help.getArea();
        return (int) Math.signum(diff);
    }
}

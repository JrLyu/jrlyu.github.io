public class GeoCircle extends GeometricObject{
    private double radius;
    GeoCircle(String col, double r) { // the constructor will not be inherited
        setColor(col); // color is private in GeometricObject
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() { // override
        return 3.14159 * radius * radius;
    }
}

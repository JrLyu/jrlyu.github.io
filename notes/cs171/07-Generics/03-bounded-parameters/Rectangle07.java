public class Rectangle07 extends GeometricObject07{
    private double width;
    private double length;
    Rectangle07(String c, double w, double l) {
        super(c);
        width = w;
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

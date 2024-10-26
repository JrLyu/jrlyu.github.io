public class SortRectangle extends SortGeometricObject{
    private double width;
    private double height;
    SortRectangle(String col, double w, double h) {
        setColor(col);
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double r) {
        width = r;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double r) {
        height = r;
    }
    public double getArea() { // Overrides
        return width*height;
    }
    @Override
    public String toString() {
        return "Color = " + getColor() + " : " + "height = " + getHeight() + " : " + "width = " + getWidth();
    }
}

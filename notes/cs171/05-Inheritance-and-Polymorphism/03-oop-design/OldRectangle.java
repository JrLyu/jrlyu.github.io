public class OldRectangle {
    private String color;
    private double width;
    private double height;

    OldRectangle(String col, double w, double h) {
        color = col; width = w; height = h;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
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
    public double getArea() {
        return width * height;
    }
}

public abstract class GeometricObject07 {
    private String color;
    GeometricObject07( ){ }

    GeometricObject07(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public abstract double getArea();
}

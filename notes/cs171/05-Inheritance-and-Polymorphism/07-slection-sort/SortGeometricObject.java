public class SortGeometricObject {
    private String color;
    SortGeometricObject( ) { }          // Constructor 1

    SortGeometricObject(String col) {  // Constructor 2
        color = col;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String c)  {
        color = c;
    }

    public double getArea() { // Dummy method!! This is for polymorphism
        return 0;  // Some default value
    }

    @Override
    public String toString() {
        return getColor() + " " + getArea();
    }
}
public class FinalGeometricObject {
    private String color;
    FinalGeometricObject( ) { }          // Constructor 1

    FinalGeometricObject(String col) {  // Constructor 2
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
    /* ======================================
       This method cannot be overridden
       ====================================== */
    public final String toString() {
        return getColor() + " " + getArea();
    }
}

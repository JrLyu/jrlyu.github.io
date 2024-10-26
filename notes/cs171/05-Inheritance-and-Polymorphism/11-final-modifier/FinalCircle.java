/* ======================================
   This class cannot be extended
   ====================================== */
public final class FinalCircle extends FinalGeometricObject { // other classes that extend FinalCircle will yield an error
    private double radius;
    FinalCircle(String s) {
        super(s);
    }

//    The following code will yield an error because the toString() method in FinalGeometricObject is final.
//    public String toString() {
//        return getColor() + " " + getArea();
//    }
}

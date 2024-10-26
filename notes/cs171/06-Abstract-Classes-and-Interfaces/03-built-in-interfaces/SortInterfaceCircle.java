public class SortInterfaceCircle extends GeometricObject implements Comparable<SortInterfaceCircle>{
    private double radius;
    SortInterfaceCircle(String c, double r) {
        super(c);
        radius = r;
    }

    public double getArea() {
        return radius * radius * 3.141;
    }

    public int compareTo(SortInterfaceCircle other) {
        double diff = this.getArea() - other.getArea();
        return (int) Math.signum(diff); // Convert to int: -1, 0 or +1
    }
}

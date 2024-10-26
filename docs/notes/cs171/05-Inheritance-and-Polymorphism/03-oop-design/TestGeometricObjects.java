public class TestGeometricObjects { // This program should work as the TestOldWay.java file
    public static void main(String[] args) {
        GeoCircle c1 = new GeoCircle("red", 2);
        GeoCircle c2 = new GeoCircle("blue", 4);

        GeoRectangle r1 = new GeoRectangle("green", 2, 3);
        GeoRectangle r2 = new GeoRectangle("red", 1, 4);

        System.out.println(c1.getColor() + " " + c1.getArea());
        System.out.println(c2.getColor() + " " + c2.getArea());
        System.out.println(r1.getColor() + " " + r1.getArea());
        System.out.println(r2.getColor() + " " + r2.getArea());

        System.out.println(c1.toString()); // If we do not override toString, we should get something like GeoCircle@38af3868
        System.out.println(c1); // This calls toString as well.
    }
}

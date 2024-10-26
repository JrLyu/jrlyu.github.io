public class CopyReference {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        int x = 4;

        System.out.println(circle1.getRadius() + " " + x); // 4.0 4
        incrementRadius(circle1); // Pass a reference type variable
        incrementInt(x); // Pass a primitive type variable
        System.out.println(circle1.getRadius() + " " + x); // 5.0 4

        System.out.println(circle1.getRadius()); // 5.0
        updateCircle(circle1);
        System.out.println(circle1.getRadius()); // 5.0

        System.out.println(circle1.getRadius()); // 5.0
        circle1 = update(circle1);
        System.out.println(circle1.getRadius()); // 99.0
    }

    // Method updates object passed as parameter
    public static void incrementRadius(Circle c) {
        c.radius++; // Increment by 1
    }

    // method updates int passed as parameter
    public static void incrementInt(int c) {
        c++; // Increment by 1
    }

    // Does this method update circle1?
    public static void updateCircle(Circle c) {
        c = new Circle(99);
        // This method creates a new circle object with radius 99 and assigns c a reference to it.
        // All these things happened in the activation record of the updateCircle method, and
        // has nothing to do with the circle1 in the main method.
        // So circle1 is not affected.
    }

    //What if we really want to update the reference of a circle through a method call?
    public static Circle update(Circle c) {
        c = new Circle(99);
        return c;
    }
}

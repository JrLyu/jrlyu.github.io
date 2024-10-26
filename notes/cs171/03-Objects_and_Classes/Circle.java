public class Circle { // Class represents an object does not need a main method.

    public double radius = 1; // the radius of this circle;
    //also can use the private quantifier, but we need to write a getRadius method in order to print the radius later

    public Circle() {} // constructor 1 for a circle object

    public Circle(double newRadius) { // constructor 2 for a circle object
        radius = newRadius;
    }

    /* To test an object, we may include a main method inside this class,
     * but writing a separate class to test it is also desirable.
     * public static void main(String[] args) {
     *      Circle circle1 = new Circle();
     *      Circle circle2 = new Circle(2);
     * }
     */

    // DO NOT use the static quantifier: instance method can only use instance variables
    public double getArea() { // return the area of this circle
        return 3.14159 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) { // set new radius for this circle; DO NOT use the static quantifier
        radius = newRadius;
    }

//    The above code are equivalent to the following
//    public double radius = 1;
//    public Circle(Circle this) {}
//    public Circle(Circle this, double newRadius) {
//        this.radius = newRadius;
//    }
//    public double getArea(Circle this) {
//        return 3.14159 * this.radius * this.radius;
//    }
//    public void setRadius(Circle this, double newRadius) {
//        this.radius = newRadius;
//    }
//    However, using this is not necessary for the most of the time

    // Example when using this is a must: the parameter of the method has the same name of the data field
    public void setRadius(int radius) {
        this.radius = radius;
        // If we just put radius = radius, there will be an error.
    }

    // Another example when using this is a must: invoking a constructor
//    public Circle() {
//        this(1); // Calls: Circle(double radius (=1))
//    }
    // But no one use it!!!

    // If we change radius to private, using circle1.radius = circle2.radius would not work.
    // The following constructor defines a way to create a Circle object using another Circle object.
    // It will be working when we want to make a real copy.
    public Circle(Circle c) { // Constructor 3: copies Circle c; also called the copy constructor
        radius = c.radius; // Copies c.radius to radius of the new Circle object
    }
}

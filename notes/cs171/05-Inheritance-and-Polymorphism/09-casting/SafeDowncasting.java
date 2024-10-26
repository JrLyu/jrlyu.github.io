import java.sql.SQLOutput;

public class SafeDowncasting {
    public static void main(String[] args) {
        System.out.println("------ Upcasting and Safe Downcasting: Circle ------");
        CastingGeometricObjects a = new CastingCircle("red", 1);// (1) Upcasting
        System.out.println("Area: " + a.getArea());
        // System.out.println(a.getRadius()); // (2) Error !

        // To prevent the error a.getRadius(), we need the following code
        CastingCircle b = (CastingCircle)a; // explicitly casting
        System.out.println("Radius: " + b.getRadius()); // OK !

        // We can also try this with CastingRectangle object
        System.out.println("------ Upcasting and Safe Downcasting: Rectangle ------");
        CastingGeometricObjects c = new CastingRectangle("red", 1, 2); // Upcasting
        System.out.println("Area: " + c.getArea());

        CastingRectangle d = (CastingRectangle) c;
        System.out.println("Width: " + d.getWidth());
        System.out.println("Height: " + d.getHeight());

        // Using the `instanceof` boolean operator, we can write non-specific subtype reference
        System.out.println("------ The `instanceof` Boolean Operator ------");
        if (a instanceof CastingCircle) {
            System.out.println("a is a Circle");
        }
        if (a instanceof CastingRectangle) {
            System.out.println("a is a Rectangle");
        }
        if (a instanceof CastingGeometricObjects) {
            System.out.println("a is a GeometricObject");
        }

        // Skeletal code to downcast an unspecified superclass type to its correct subclass types:
        System.out.println("------ Non-Specific Subtype Reference ------");
        CastingGeometricObjects g;
        if (Math.random() < 0.5) { // upcast to a subclass
            g = new CastingCircle("red", 1);
        } else {
            g = new CastingRectangle("red", 1, 2);
        }
        if (g instanceof CastingCircle) {
            System.out.println("g is a Circle");
            CastingCircle n = (CastingCircle) g; // downcast to a Circle
            System.out.println("Radius: " + n.getRadius());
        } else if (g instanceof CastingRectangle) {
            System.out.println("g is a Rectangle");
            CastingRectangle n = (CastingRectangle) g; // downcast to a Rectangle
            System.out.println("Width: " + n.getWidth());
            System.out.println("Height: " + n.getHeight());
        } else {
            System.out.println("Invalid subclass type.");
        }
    }
}

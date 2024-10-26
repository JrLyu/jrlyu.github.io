// Example that show protected members can be accessed from a method in the same package

package Geometrics;
public class TestProtectedModifier {
    public static void main(String[] args) {
        ProtectedCircle c = new ProtectedCircle("red", 2);
        System.out.println(c.radius);
    }
}

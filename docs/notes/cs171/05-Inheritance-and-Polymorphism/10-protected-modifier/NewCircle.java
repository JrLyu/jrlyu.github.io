import Geometrics.*;
public class NewCircle extends ProtectedCircle{
    NewCircle() {
        super("red", 1);
    }

    public void accessInheritedProtected() {
        System.out.println(radius);
    }
}

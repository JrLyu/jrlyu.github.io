// Example that show protected members can be accessed from a subclass in a different package

public class TestNewCircle {
    public static void main(String[] args) {
        NewCircle c = new NewCircle();
        c.accessInheritedProtected();
    }
}

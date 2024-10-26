public class TestOldWay {
    public static void main(String[] args) {
        OldCircle c1 = new OldCircle("red", 2);
        OldCircle c2 = new OldCircle("blue", 4);

        OldRectangle r1 = new OldRectangle("green", 2, 3);
        OldRectangle r2 = new OldRectangle("red", 1, 4);

        System.out.println( c1.getColor() + " " + c1.getArea() );
        System.out.println( c2.getColor() + " " + c2.getArea() );
        System.out.println( r1.getColor() + " " + r1.getArea() );
        System.out.println( r2.getColor() + " " + r2.getArea() );
    }
}

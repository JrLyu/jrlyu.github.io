public class UnboundedCompare {
    public static void main(String[] args) {
        Circle07 c1 = new Circle07("red", 3);
        Circle07 c2 = new Circle07("blue", 5);
        Rectangle07 r1 = new Rectangle07("green", 3, 2);
        Rectangle07 r2 = new Rectangle07("white", 4, 1);

        System.out.println(smallerArea(c1, c2));
        System.out.println(smallerArea(r1, r2));
        System.out.println(smallerArea(c1, r1));
        System.out.println(smallerArea(r2, c2));
    }
    public static boolean smallerArea(Circle07 o1, Circle07 o2) {
        return o1.getArea() < o2.getArea();
    }

    public static boolean smallerArea(Rectangle07 o1, Rectangle07 o2) {
        return o1.getArea() < o2.getArea();
    }

    public static boolean smallerArea(Circle07 o1, Rectangle07 o2) {
        return o1.getArea() < o2.getArea();
    }

    public static boolean smallerArea(Rectangle07 o1, Circle07 o2) {
        return o1.getArea() < o2.getArea();
    }

//    public static <T> boolean smallerArea(T o1, T o2) { will not work because the object type does not have getArea() method
//        return o1.getArea() < o2.getArea();
//    }
}

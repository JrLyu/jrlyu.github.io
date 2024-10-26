public class BoundedCompare {
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

    public static <T extends GeometricObject07> boolean smallerArea(T o1, T o2) {
        return o1.getArea() < o2.getArea();
    }
}

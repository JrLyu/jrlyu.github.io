public class TestCircleCounting {
    public static void main(String[] args) {
        CircleCounting circle1 = new CircleCounting(2);

        System.out.println(circle1.getRadius()); // 2.0
        System.out.println(circle1.getCount()); // 1
        System.out.println();

        CircleCounting circle2 = new CircleCounting(4);

        System.out.println(circle2.getRadius()); // 4.0
        System.out.println(circle2.getCount()); // 2
    }
}

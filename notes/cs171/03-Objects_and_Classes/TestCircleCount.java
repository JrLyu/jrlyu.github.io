public class TestCircleCount {
    public static void main(String[] args) {
        CircleCount circle1 = new CircleCount(2);
        CircleCount circle2 = new CircleCount(4);

        circle1.count = 99;

        System.out.println(circle1.radius); // 2.0
        System.out.println(circle1.count); // 99
        System.out.println(circle2.radius); // 4.0
        System.out.println(circle2.count); // 99 -- because count is a static variable and
                                                 // is shared among all objects in this class

        circle1.radius++; // Updates an instance variable
        circle1.count++; // Updates a static variable
        System.out.println(circle1.radius); // 3.0
        System.out.println(circle1.count); // 100
        System.out.println(circle2.radius); // 4.0
        System.out.println(circle2.count); // 100
    }
}

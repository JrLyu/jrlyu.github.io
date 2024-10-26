public class CircleCopy {
    public static void main(String[] args) {
        int k = 5;
        int c = k; // a real copy

        c = 99;
        System.out.println(k); // 5: changing c does not change k
        System.out.println(c); // 99

        Circle circle1 = new Circle();
        Circle circle2 = circle1; // an alias not a real copy

        circle2.radius = 99.0;
        System.out.println(circle1.radius); // 99.0
        System.out.println(circle2.radius); // 99.0

        Circle circle3 = new Circle();
        circle3.radius = circle1.radius; // this only works when radius is public
        circle3.radius++;
        System.out.println(circle1.radius); // 99.0 -- does not change!
        System.out.println(circle3.radius); // 100.0

        Circle circle4 = new Circle(circle1); // create a copy of circle1 using the copy constructor
        circle4.radius--;
        System.out.println(circle1.radius); // 99.0 -- still does not change!
        System.out.println(circle4.radius); // 98.0
    }
}

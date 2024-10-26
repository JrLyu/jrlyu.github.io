public class CircleArray {
    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = new Circle[10];

        circleArray[0] = new Circle(4); // stores a reference to a circle object

        double area = circleArray[0].getArea();
        System.out.println("Area of the first item: " + area);
    }
}

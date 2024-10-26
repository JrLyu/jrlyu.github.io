public class Test {
    public static void main(String[] args) {
        AbstractGeometric a = new AbstractCircle("red", 3);

        System.out.println(a.getArea());
    }
}

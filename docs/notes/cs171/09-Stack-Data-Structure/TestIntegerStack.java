public class TestIntegerStack {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack(5);

        s.pop();    // Pops an empty stack!
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}

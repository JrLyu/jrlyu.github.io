public class TestListStack {
    public static void main(String[] args) {
        System.out.println("------ Test Integer List Stack ------");
        ListStack<Integer> s = new ListStack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack: " + s);
        System.out.println("s.pop(): " + s.pop());
        System.out.println("Stack: " + s);
        System.out.println("s.pop(): " + s.pop());
        System.out.println("Stack: " + s);
        System.out.println("s.pop(): " + s.pop());
        System.out.println("Stack: " + s);
        System.out.println("s.pop(): " + s.pop());
        System.out.println("Stack: " + s);
    }
}

public class TestGenericStack {
    public static void main(String[] args) {
        System.out.println("------ Test GenericStack<Integer> ------");
        GenericStack<Integer> s = new GenericStack<>(5);

        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println("------ Test GenericStack<String> ------");
        GenericStack<String> s2 = new GenericStack<>(5);

        s2.pop();
        s2.push("not");
        s2.push("or");
        s2.push("be");
        s2.push("to");
        System.out.println(s2);
        System.out.println(s2.pop());
        System.out.println(s2);
        System.out.println(s2.pop());
        System.out.println(s2);
        System.out.println(s2.pop());
        System.out.println(s2);
        System.out.println(s2.pop());
        System.out.println(s2);
    }
}

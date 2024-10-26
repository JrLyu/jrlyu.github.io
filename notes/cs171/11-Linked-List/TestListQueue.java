public class TestListQueue {
    public static void main(String[] args) {
        System.out.println(" ------ Test ListQueue with Integer ------");
        ListQueue<Integer> s = new ListQueue<>();

        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        s.enqueue(4);
        System.out.println("s: " + s);
        System.out.println("s.dequeue(): " + s.dequeue());
        System.out.println("s: " + s);
        System.out.println("s.dequeue(): " + s.dequeue());
        System.out.println("s: " + s);
        System.out.println("s.dequeue(): " + s.dequeue());
        System.out.println("s: " + s);
        System.out.println("s.dequeue(): " + s.dequeue());
        System.out.println("s: " + s);
        try {
            System.out.println("s.dequeue(): " + s.dequeue());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("------ Test ListQueue with String ------");
        ListQueue<String> string = new ListQueue<>();

        string.enqueue("not");
        string.enqueue("or");
        string.enqueue("be");
        string.enqueue("to");
        System.out.println("string: " + string);
        System.out.println("string.dequeue(): " + string.dequeue());
        System.out.println("string: " + string);
        System.out.println("string.dequeue(): " + string.dequeue());
        System.out.println("string: " + string);
        System.out.println("string.dequeue(): " + string.dequeue());
        System.out.println("string: " + string);
        System.out.println("string.dequeue(): " + string.dequeue());
        System.out.println("string: " + string);
        try {
            System.out.println("string.dequeue(): " + string.dequeue());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
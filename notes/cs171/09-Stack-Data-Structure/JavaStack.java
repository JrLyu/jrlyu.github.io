import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> iStack = new Stack<>();
        Stack<String>  sStack = new Stack<>();

        // Test Integer stack
        iStack.push(1);
        iStack.push(2);
        iStack.push(3);
        System.out.println(iStack);

        System.out.println(iStack.pop());
        System.out.println(iStack);

        // Test String stack
        sStack.push("cat");
        sStack.push("dog");
        System.out.println(sStack);

        System.out.println(sStack.pop());
        System.out.println(sStack);

        // For some unknown reason, the developer of the Stack class made it a subclass of the Vector class.
        // The Vector class can access the stored data using an index
        // Since the Stack class is its subclass, it inherits these random access methods.
        // As a result, the Stack's FIFO behavior is not guaranteed.
        System.out.println(sStack.get(0));
        iStack.remove(1);
        System.out.println(iStack);
    }
}

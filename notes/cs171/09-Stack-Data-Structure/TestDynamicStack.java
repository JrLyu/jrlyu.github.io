public class TestDynamicStack {
    public static void main(String[] args) {
        DynamicStack s = new DynamicStack(1);

        s.push(1);
        s.push(2);
        s.push(5); // Doubles the array
        s.pop();      // Halves the array
        s.push(5); // and so on...
        s.pop();
        s.push(5);
        s.pop();
    }
}

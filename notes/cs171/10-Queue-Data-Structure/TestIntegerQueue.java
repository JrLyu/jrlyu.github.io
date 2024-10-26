public class TestIntegerQueue {
    public static void main(String[] args) {
        IntegerQueue  myQ = new IntegerQueue(3);
        Integer x;

        myQ.enqueue(1);
        System.out.println("enqueue(1): " + "myQ = " + myQ);
        myQ.enqueue(2);
        System.out.println("enqueue(2): " + "myQ = " + myQ);
        try {
            myQ.enqueue(3); // Full
        } catch (Exception e) {
            System.out.println(e);
        }

        IntegerQueue  emptyQ = new IntegerQueue(3);
        try {
            x = emptyQ.dequeue(); // empty
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

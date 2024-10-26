public class DynamicStack implements MyStackInterface<Integer> {
    private Integer[] item;
    private int stackTop;
    private final double DELTA = 0.25; // wastage threshold

    public DynamicStack(int N) { // Create a stack of size N
        item = new Integer[N];
        stackTop = 0;
    }
    @Override
    public boolean isEmpty() { // Test if the stack if empty
        return stackTop == 0;
    }

    @Override
    public boolean isFull() {
        return stackTop == item.length;
    }

    @Override
    public void push(Integer e) {
        if (isFull()) {
            // if the array is full, then double the size of the array
            Integer[] temp = new Integer[item.length * 2];
            for (int i = 0; i < item.length; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        item[stackTop] = e; // (1) store item
        stackTop++; // (2) increment stackTop
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // or throw an exception
        }
        stackTop--; // (1) decrease stackTop
        int retVal = item[stackTop];
        // if (stackTop < δ*item.length) reduce the array by half
        if (stackTop < DELTA * item.length && item.length >= 2) {
            Integer[] temp = new Integer[item.length / 2];
            for (int i = 0; i <= stackTop; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        return retVal; // (2) return item
    }

    @Override
    public Integer peek() {
        return item[stackTop - 1];
    }
}

public class StringStack implements MyStackInterface<String> {
    private String[] item;
    private int stackTop;
    private final double DELTA = 0.25; // wastage threshold

    public StringStack(int N) {
        item = new String[N];
        stackTop = 0;
    }
    @Override
    public boolean isEmpty() {
        return stackTop == 0;
    }

    @Override
    public boolean isFull() {
        return stackTop == item.length;
    }

    @Override
    public void push(String s) {
        if (isFull()) {
            // if the array is full, then double the size of the array
            String[] temp = new String[item.length * 2];
            for (int i = 0; i < item.length; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        item[stackTop] = s; // (1) store item
        stackTop++; // (2) increment stackTop
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // or throw an exception
        }
        stackTop--; // (1) decrease stackTop
        String retVal = item[stackTop];
        // if (stackTop < δ*item.length) reduce the array by half
        if (stackTop < DELTA * item.length && item.length >= 2) {
            String[] temp = new String[item.length / 2];
            for (int i = 0; i <= stackTop; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        return retVal; // (2) return item
    }

    @Override
    public String peek() {
        return item[stackTop - 1];
    }
}

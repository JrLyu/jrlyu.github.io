public class IntegerStack implements MyStackInterface<Integer>{
    private Integer[] item;
    private int stackTop;

    public IntegerStack(int N) { // Create a stack of size N
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
            System.out.println("Full");
            return; // or throw an exception
        }
        item[stackTop] = e; // (1) store item
        stackTop++; // (2) increment stackTop

    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // or thow an exception
        }
        stackTop--; // (1) decrease stackTop
        return item[stackTop]; // return item
    }

    @Override
    public Integer peek() {
        return item[stackTop - 1];
    }
}

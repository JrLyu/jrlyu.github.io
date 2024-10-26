public class GenericStack<T> implements MyStackInterface<T> {
    private T[] item;
    private int stackTop;

    public GenericStack(int N) {
        item = (T[]) new Object[N]; // Create an array of Object objects
        // This will cause some warning, but it will compile (Java does not know if the casting will be successful)
        // Why this will work: If we are working with unbounded generic types,
        // we know T will be interpreted as Object by Java. Then we will create
        // an array of Object, then cast it into our desired type T
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
    public void push(T t) {
        // if the array is full, then double the size of the array
        if (isFull()) {
            System.out.println("Full");
            return;
        }
        item[stackTop] = t;
        stackTop++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // or throw an exception
        }
        stackTop--; // (1) decrease stackTop
        return item[stackTop]; // return item
    }

    @Override
    public T peek() {
        return item[stackTop - 1];
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < stackTop; i++) {
            result += item[i] + " ";
        }
        return result;
    }
}

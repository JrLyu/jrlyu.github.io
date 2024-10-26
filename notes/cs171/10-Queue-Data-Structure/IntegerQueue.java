public class IntegerQueue implements MyQueueInterface<Integer> {
    // We will use a circular array to implement the queue.
    private Integer[] buf; // Array of the circular buffer
    private int read; // the read pointer (=head index of the queue)
    private int write; // the write pointer (=tail index of the queue)

    public IntegerQueue(int N) {
        // Create the circular buffer of size N
        buf = new Integer[N]; // create array
        read = 0; // initialize read pointer
        write = 0; // initialize the write pointer
    }

    @Override
    public boolean isEmpty() { // returns true if the queue is empty
        return read == write;
    }

    @Override
    public boolean isFull() { // returns true if the queue is full
        // The queue (or circular buffer) is full when there is one (= 1) open spot left
        return (write + 1) % buf.length == read;
    }

    @Override
    public void enqueue(Integer e) {
        if (isFull()) {
            System.out.println("Full"); // or throws exception
            return;
        } else {
            buf[write] = e;
            write = (write + 1) % buf.length; // use modulo arithmetic
        }
    }

    @Override
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Empty"); // or throws exception
            return null;
        } else {
            Integer retVal = buf[read];
            read = (read + 1) % buf.length; // use modulo arithmetic
            return retVal;
        }
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Empty"); // or throws exception
            return null;
        } else {
            return buf[read];
        }
    }
}

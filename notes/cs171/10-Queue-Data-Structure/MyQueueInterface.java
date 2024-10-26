public interface MyQueueInterface <E> {
    boolean isEmpty(); // returns true is queue is empty
    boolean isFull(); // returns true is queue is full

    void enqueue(E e); // insert element e at the end of the queue
    E dequeue(); // removes and returns the front item from the queue
    E peek(); // returns the front item from the queue without removing it
}

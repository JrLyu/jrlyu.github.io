public interface DEqueue <E> {
    boolean isEmpty();
    boolean isFull();
    void addFirst(E e); // insert x at the front of the Deque
    void addLast(E e); // insert x at the tail of the Deque = enqueue(x)
    E removeFirst(); // remove the element at the front of the Deque and return it = dequeue()
    E removeLast(); // insert the element at the tail of the Deque and return it
}

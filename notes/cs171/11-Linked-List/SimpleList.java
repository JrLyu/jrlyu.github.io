public interface SimpleList <T> { // A list that stores objects of type T
    public boolean isEmpty(); // test if the linked list is empty

    public T getFirst(); // returns the first node of the list
    public T getLast(); // returns the last node of the list

    public void addFirst(T item); // insert item at front of the list
    public T removeFirst(); // remove the first node from the list and return it

    public void addLast(T item); // insert item at the end of the list
    public T removeLast(); // remove the last node from the list and return it

    public T get(int pos); // return the item sotred in the list at position pos
    public void remove(T key); // remove the first node containing key
}

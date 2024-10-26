import java.util.NoSuchElementException;

public class ListQueue<T> implements MyQueueInterface<T> {
    private class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        public String toString(){
            return "" + this.item;
        }
    } // End of private inner class "Node"

    private Node<T> first;

    public ListQueue() { // Constructs an empty list/queue
        first = null; // Empty list ≡ empty queue
    }

    @Override
    public boolean isEmpty() { // returns true is queue is empty
        return first == null;
    }

    @Override
    public boolean isFull() { // returns true is queue is full
        return false; // Because a linked list is not fixed size
    }

    @Override
    // enqueue(item) --> insert at the end of the list
    public void enqueue(T item) {
        if (isEmpty()) {
            first = new Node<T>(item,null);
        } else {
            Node<T> current = first;
            while( current.next != null ) { // Find the last node
                current = current.next;
            }
            current.next = new Node<T>(item,null); // Link behind the last node
        }
    }

    @Override
    // dequeue() --> remove the first item and return it
    public T dequeue() {
        if(isEmpty())  {
            throw new NoSuchElementException();
        }
        T retVal = first.item; // Save return item
        first = first.next; // Unlink the first node
        return retVal;
    }

    @Override
    // peek() -> return the first item
    public T peek() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.item;   // Return the first item
    }

    @Override
    public String toString() {
        String result  = "";
        Node<T> current = first;
        while (current != null) {
            result += current.item + " ";
            current = current.next;
        }
        result += "[NULL]";
        return result;
    }
}
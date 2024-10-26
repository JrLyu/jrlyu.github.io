// There is no need to resize the linked list !!
import java.util.NoSuchElementException;

public class ListStack<T> implements MyStackInterface<T> {

    /*******************************************************
     * Private inner (nested) class Node
     ********************************************************/
    public class Node<T> {
        // Node instance variable is generic
        private T item;
        private Node<T> next;

        // Constructor for Node
        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + this.item;
        }
    } // End of private inner class "Node"

    private Node<T> first;

    public ListStack() { // constructor
        first = null; // Empty list ==> empty stack
    }

    @Override
    public boolean isEmpty() { // returns true is stack is empty
        return first == null;
    }

    @Override
    public boolean isFull() { // returns true is stack is full
        return false; // Because a linked list is not fixed size
    }

    @Override
    // push(item) --> insert at the front of the list
    public void push(T item) {
        Node<T> newNode = new Node<T>(item, first);
        first = newNode;
    }

    @Override
    // pop() --> remove the first item and return it
    public T pop() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        T toReturn = first.item;   // Save return item
        first = first.next;        // Unlink the first node
        return toReturn;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.item;   // return item
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

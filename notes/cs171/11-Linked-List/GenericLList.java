import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericLList<T> implements SimpleList<T>, Iterable<T> {

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

    // Need variable to store a linked list...
    private Node<T> first; // The list starts at first
    // constructor to initialize the variables
    public GenericLList() {
        first = null;
    }

    @Override
    // Tests if a list is empty; returns true if it is empty; false if it is not empty
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    // Inserts a new node at the beginning of this list take in generic item; Nodes are generic
    public void addFirst(T item) {
        first = new Node<T>(item, first);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T toReturn = first.item;
        first = first.next;
        return toReturn;
    }

    @Override
    // Add the item to the end of the list
    public void addLast(T item) {
        // Handling the edge cases: empty is empty
        if (isEmpty()) {
            first = new Node<T>(item,null); // We studied this before: equivalent to addFirst(item)
        } else { // when the list is not empty
            // (1) Find the last element in the linked list
            Node<T> current = first;
            while (current.next != null) { // find the last element
                current = current.next;
            }
            // (2) Make a new Node with data and link to the last element
            current.next = new Node<T>(item, null);
        }
    }

    @Override
    // Remove the item at the end of the list
    public T removeLast() {
        // Take care of the edge cases: empty list
        if (isEmpty()) { // the list is empty and we cannot remove anything
            throw new NoSuchElementException();
        }
        // Another edge case: the list only has one node
        if (first.next == null) {
            Node<T> ret = first; // store the return value
            first = null; // unlink the list by updating first
            return ret.item; // return value

        }
        // The general case:
        //      To remove the last item of the list, we need to find:
        //      (1) the last item
        //      (2) the second last (the processor of the last item)
        //      --> we modify our algorithm to find the last item, so we can also find the processor
        Node<T> previous = first;
        Node<T> current = first;
        while (current.next != null) {
            previous = current; // Keep track of the previous node
            current = current.next;
        }
        // previous points to the predecessor node of the last node; current points to the last node
        previous.next = null; // unlink the last node
        return current.item; // return the last item
    }

    @Override
    // Will return the first item in the list
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    @Override
    // Will return the last item in the list
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        // (1) find the last node
        Node<T> current = first;
        while (current.next != null) {
            current = current.next; // find the last node
        }
        return current.item; // (2) return the value
    }

    @Override
    // Will return the item stored in the node of the list with position number pos
    // The position number (index) will start at 0
    public T get(int pos) {
        // General Case:
        int i = 0;
        Node<T> current = first;
        while (i < pos) {
            i++;
            current = current.next; // move to the next node
            if (current == null) { // if we have exhausted the list and still have not achieved the pos
                throw new NoSuchElementException();
            }
        }
        return current.item;
    }

    @Override
    // Will remove the first node stored the item equals to key
    public void remove(T key) {
        if (first == null) { // Edge Case 1: empty list
            throw new NoSuchElementException();
        } else if (first.item.equals(key)) { // Edge Case 2: the first node contains the key
            // in this case, we must update the first node
            first = first.next; // The 2nd node is now the new 1st node
        } else { // general case: we update previous.next
            // To achieve the described behavior, we need to do the following steps:
            //      (1) Find the processor node of the node containing item==key
            //      (2) Unlink the targeted node from its processor node
            Node<T> previous = first;
            Node<T> current = first;
            while (current != null && !current.item.equals(key)) { // Find the (first) node that contains key
                previous = current; // Keep track of the previous node
                current = current.next;
            }
            // previous points to the predecessor node of current; current points to the node containing key
            // or current == null: not found
            if (current == null) {
                // no such key found
                throw new NoSuchElementException();
            }
            previous.next = current.next; // Unlink the current node from the list
        }
    }

    // Make Linked List an implementation of Interable()
    /*******************************************************
     * Private inner (nested) class MyLinkedListIterator
     * that implements the Java interface "Iterator"
     ********************************************************/
    public class MyLListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public MyLListIterator(Node<T> f) { // constructor
            current = f; // Initialize
        }
        @Override
        public boolean hasNext() { // Returns true if there are more elements.
            return current != null; // True if there are unvisited nodes
        }

        @Override
        public T next() { // Returns the next element in the iteration.
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T res = current.item;    // get item at current position
            current = current.next;  // move to the next node
            return res;
        }
    } // end of inner class

    @Override
    public Iterator<T> iterator() {
        return new MyLListIterator<>(first);
    }

    public String toString() {
        String result = "";
        Node<T> p = first;
        while (p != null) {
            result += p.item + " ";
            p = p.next;
        }
        return result;
    }
}

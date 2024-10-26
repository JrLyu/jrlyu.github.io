public interface MyStackInterface<E> {
    boolean isEmpty(); // returns true is stack is empty
    boolean isFull();  // returns true is stack is full

    void push(E e);    // Pushes elem e on the stack

    E pop();           // Remove the elem at the top of the stack and return it

    E peek();          // Return the elem at the top without removing it
}

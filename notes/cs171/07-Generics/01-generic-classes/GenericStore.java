// If we use T in our test code, Java compiler will replace it with Object, back to our ObjectStore case
public class GenericStore<T> {
    private T data; // variable of T type
    public GenericStore(T data) {
        this.data = data;
    }

    public T getData() { // returns T type variable
        return this.data;
    }
}

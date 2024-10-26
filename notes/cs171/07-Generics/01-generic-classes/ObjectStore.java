public class ObjectStore {
    private Object data;    // variable of Object type

    public ObjectStore(Object data) { // Can receive any ref type
        this.data = data;
    }

    public Object getData() { // return Object type
        return this.data;
    }
}

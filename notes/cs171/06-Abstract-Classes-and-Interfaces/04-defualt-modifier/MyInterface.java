public interface MyInterface {
    default void show() {
        System.out.println("Default show()");
    }
}

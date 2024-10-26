public class TestDefault {
    public static void main(String[] args) {
        MyImplementation myImplementation = new MyImplementation();
        DefaultImplementation defaultImplementation = new DefaultImplementation();

        myImplementation.show();
        defaultImplementation.show();
    }
}

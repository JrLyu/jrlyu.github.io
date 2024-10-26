public class TestGenericPrint {
    public static void main(String[] args) {
        String[]  strings  = {"a", "b", "c"};
        Integer[] integers = {1, 2, 3, 4, 5};

        GenericPrint.<String>print(strings);   // Inserts (String) cast operator
        GenericPrint.<Integer>print(integers); // Inserts (Integer) cast operator
    }
}

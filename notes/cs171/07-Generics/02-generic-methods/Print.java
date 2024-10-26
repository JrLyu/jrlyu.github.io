public class Print {
    public static void main(String[] args) {
        String[]  strings  = {"a", "b", "c"};
        Integer[] integers = {1, 2, 3, 4, 5};

        print(strings);  // Calls print(String[])
        print(integers); // Calls print(Integer[])
    }

    public static void print(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void print(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

public class GenericPrint {
    public static <T> void print(T[] list) { // equivalent to public static void print(Object[] list)
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

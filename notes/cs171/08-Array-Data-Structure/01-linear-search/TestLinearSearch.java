public class TestLinearSearch {
    public static void main(String[] args) {
        Integer[] myList = {1, 4, 4, 2, 5, -3, 6, 2};

        System.out.println(LinearSearch.<Integer>linearSearch(myList,  4)); // Returns  1
        System.out.println(LinearSearch.<Integer>linearSearch(myList, -4)); // Returns -1
        System.out.println(LinearSearch.<Integer>linearSearch(myList, -3)); // Returns 5
    }
}

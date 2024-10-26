import java.util.ArrayList;
import java.util.Iterator;
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();

        System.out.println(numbers.size());
        System.out.println(numbers);

        numbers.add(99);
        System.out.println(numbers.size());
        System.out.println(numbers);

        numbers.add(0, 100);
        System.out.println(numbers.size());
        System.out.println(numbers);

        System.out.println("At Index 1: " + numbers.get(1));

        numbers.set(1, 200);
        System.out.println(numbers.size());
        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers.size());
        System.out.println(numbers);

        numbers.add(1);
        numbers.add(2);
        numbers.add(99);

        // use for loop
        System.out.println("----- Use for loop ------");
        for (int i = 0; i < numbers.size(); i++ ) {
            System.out.println(numbers.get(i));
        }

        // use foreach loop
        System.out.println("----- Use foreach loop ------");
        for (int item: numbers) {
            System.out.println(item);
        }

        // a foreach loop is equivalent to using an iterator object
        System.out.println("----- Use Interator object ------");
        Iterator<Integer> numItr = numbers.iterator();

        while (numItr.hasNext()) {
            System.out.println(numItr.next());
        }
    }
}

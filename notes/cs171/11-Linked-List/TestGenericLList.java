import java.util.Iterator;

public class TestGenericLList {
    public static void main(String[] args) {
        System.out.println("------ Test isEmpty(), addFirst(), addLast() ------");
        GenericLList<String> myList = new GenericLList<>();

        System.out.println(myList.isEmpty()); // True
        System.out.println("myList: " + myList);

        myList.addFirst("1");
        System.out.println("addFirst(1): " + myList);

        myList.addFirst("2");
        System.out.println("addFirst(2): " + myList);

        myList.addFirst("4");
        System.out.println("addFirst(4): " + myList);

        myList.addLast("100");
        System.out.println("addLast(100): " + myList);

        myList.addLast("99");
        System.out.println("addFirst(99): " + myList);

        System.out.println("\n\n------ Test removeFirst() and removeLast() ------");
        System.out.println("myList: " + myList);
        myList.removeFirst();
        System.out.println("removeFirst(): " + myList);

        myList.removeFirst();
        System.out.println("removeFirst(): " + myList);

        myList.removeLast();
        System.out.println("removeLast(): " + myList);

        myList.removeLast();
        System.out.println("removeLast(): " + myList);

        myList.removeLast();
        System.out.println("removeLast(): " + myList);

        try {
            myList.removeLast();
        } catch (Exception e) {
            System.out.println("removeLast(): " + e);
        }

        System.out.println("\n\n------ Test getFirst(), getLast(), and get() ------");
        GenericLList<String> stringList = new GenericLList<>();

        stringList.addFirst("E");
        stringList.addFirst("D");
        stringList.addFirst("C");
        stringList.addFirst("B");
        stringList.addFirst("A");
        System.out.println("stringList: " + stringList); // A -> B -> C -> D -> E

        String s;
        s = stringList.getFirst();
        System.out.println("getFirst(): s = " + s); // A
        s = stringList.getLast();
        System.out.println("getLast(): s = " + s); // E
        s = stringList.get(3);
        System.out.println("get(3): s = " + s); // D
        s = stringList.get(4);
        System.out.println("get(4): s = " + s); // E
        try {
            s = stringList.get(5);
        } catch (Exception e) {
            System.out.println("get(5): s = " + e);
        }

        System.out.println("\n\n------ Test remove() ------");
        GenericLList<Integer> intList = new GenericLList<>();

        intList.addFirst(89);
        intList.addFirst(78);
        intList.addFirst(34);
        intList.addFirst(23);
        intList.addFirst(12);
        System.out.println("intList: " + intList); // 12 -> 23 -> 34 -> 78 -> 89

        intList.remove(34);
        System.out.println("remove(34): " + intList);

        intList.remove(89);
        System.out.println("remove(89):" + intList);

        intList.remove(12);
        System.out.println("remove(12):" + intList);

        try {
            intList.remove(99);
        } catch (Exception e) {
            System.out.println("remove(99): " + e);
        }

        System.out.println("\n\n------ Test Iterator() ------");
        GenericLList<String> iterableList = new GenericLList<String>();

        iterableList.addFirst("C");
        iterableList.addFirst("B");
        iterableList.addFirst("A");
        System.out.println(iterableList); // A -> B -> C

        for(String string: iterableList) {
            System.out.println(string);
        }
    }
}

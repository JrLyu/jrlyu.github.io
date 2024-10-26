import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        stringList.addFirst("B"); // B
        stringList.addFirst("A"); // A -> B
        stringList.addLast("D");	 // A -> B -> D
        stringList.add(2, "C"); // A -> B -> C -> D
        System.out.println("stringList = " + stringList);

        System.out.println("stringList.get(1) = " + stringList.get(1));
        System.out.println("sringList.getLast() = " + stringList.getLast());
        System.out.println("sringList.getFirst() = " + stringList.getFirst());


        System.out.println("stringList.remove(2) = " + stringList.remove(2)); // A -> B -> D
        System.out.println("stringList.removeLast() = " + stringList.removeLast()); // A -> B
        System.out.println("stringList.removeFirst() = " + stringList.removeFirst()); // B

    }
}

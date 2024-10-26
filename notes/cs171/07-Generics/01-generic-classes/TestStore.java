import java.lang.reflect.GenericArrayType;

public class TestStore {
    public static void main(String[] args) {
        System.out.println("------ Test StringStore ------");
        StringStore a = new StringStore("Hello");

        System.out.println(a.getData()); // Hello
        System.out.println(a.getData() + a.getData()); // HelloHello

        System.out.println("------ Test IntegerStore ------");
        IntegerStore b = new IntegerStore(12345);

        System.out.println(b.getData()); // 12345
        System.out.println(b.getData() + b.getData()); // 24690

        System.out.println("------ Test ObjectSore ------");
        ObjectStore c = new ObjectStore("Hello");
        ObjectStore d = new ObjectStore(12345);

        System.out.println(c.getData());  // Hello --> Work !
        System.out.println(d.getData());  // 12345
        // The following codes will yield errors because + operator is not defined for Object
        // System.out.println(c.getData() + c.getData());
        // System.out.println(d.getData() + d.getData());
        // The following code will compile by casting
        System.out.println((String) c.getData() + (String) c.getData());
        System.out.println((Integer) d.getData() + (Integer) d.getData());

        System.out.println("------ Test GenericStore ------");
        GenericStore<String> e = new GenericStore<String>("Hello");
        GenericStore<Integer> f = new GenericStore<Integer>(12345);
        System.out.println(e.getData());
        System.out.println(f.getData());
        System.out.println(e.getData() + e.getData());
        System.out.println(f.getData() + f.getData());
    }
}

public class TestCasting {
    public static void main(String[] args) {
        CastingSomeClass a = new CastingSomeClass();
        // Defines a reference variable of type SomeClass.
        // Allowable actions:
        System.out.println(a.x);
        a.method1();
        a.method2();

        a = new CastingNewClass(); // Make a reference to a CastingNewClass object
        // Legal, because the NewClass object can perform all actions required by the CastingSomeClass type

        System.out.println(a.x);
        a.method1(); // exec NewClass' method1() -- late binding/dynamic dispatch
        a.method2();
        // a.method3(); // This is illegal! (method 2 is not something in the CastingSomeClass

        // However, it is illegal to make a reference from a CastingNewClass to CastingSomeClass object
        // - Subclass can perform everything that a superclass can perform;
        // - however, a superclass may perform less than a subclass
    }
}

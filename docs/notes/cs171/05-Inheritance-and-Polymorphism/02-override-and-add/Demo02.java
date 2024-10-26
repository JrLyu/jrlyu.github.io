public class Demo02 {
    public static void main(String[] args) {
        NewClass02 b = new NewClass02();
        b.method1(); // Invokes NewClass.method1()
        b.method2(); // Invokes SomeClass.method2()
        b.method3(); // Invokes NewClass.method3()
        b.method4(); // Invokes SomeClass.method1()

        //  SomeClass a;
        //  a.method3();  // is ILLEGAL --> SomeClass does not have method3() !
    }
}

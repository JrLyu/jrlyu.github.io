public class NewClass02 extends SomeClass01 {
    NewClass02() { }

    public void method1( ) { // Overrides the inherited method1
        System.out.println("I am **NewClass**.method1(). x = " + x);
    }

    public void method3( ) { // Defines a new method
        System.out.println("I am **NewClass**.**method3**(). x = " + x);
    }

    public void method4() { // Uses Super
        super.method1(); // will invoke SomeClass.method1()
    }
}

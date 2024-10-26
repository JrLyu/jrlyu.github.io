public class NewClass03 extends SomeClass02{
    public NewClass03() {
        super(); //Not:SomeClass()
    }

    public NewClass03(int a) {
        super(a); //Not:SomeClass(a)
    }
}

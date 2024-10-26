public class Overload {
    public static void main(String[] args) {
        meth(1);
        meth(1.0);
        meth(1, 1);
    }
    
    public static void meth(int x) {
        System.out.println("Running: meth(int x) ");
    }
    
    public static void meth(double x) {
        System.out.println("Running: meth(double x) ");
    }

    public static void meth(int x, int y) {
        System.out.println("Running: meth(int x, int y) ");
    }
}

public class HashCode {
    public static void main(String[] args) {
        Integer i = 4;
        Double d = 3.14;
        String s = "Hello World!";

        System.out.println("------ Test hashCode() ------");
        System.out.println("i = " + i + ", i.hashCode() = " + i.hashCode());
        System.out.println("d = " + d + ", d.hashCode() = " + d.hashCode());
        System.out.println("s = " + s + ", s.hashCode() = " + s.hashCode());

        System.out.println("------ Test MAD Funciton ------");
        System.out.println("i = " + i + ", i.hashCode() = " + i.hashCode() + ", MAD(3, i) = " + mad(3, i.hashCode()));
        System.out.println("d = " + d + ", d.hashCode() = " + d.hashCode() + ", MAD(3, d) = " + mad(3, d.hashCode()));
        System.out.println("s = " + s + ", s.hashCode() = " + s.hashCode() + ", MAD(3, s) = " + mad(3, s.hashCode()));

    }

    // The multiply add divide (MAD) function:
    // H2(x) = ( ( ax + b ) % p ) % M    where p = a prime number larger than M
    public static int mad(int M, int i) {
        int p = 109345121;
        int a = 123;
        int b = 456;
        return ((a * i + b) % p) % M;
    }
}

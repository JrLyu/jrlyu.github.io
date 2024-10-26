public class MedianOf3 {
    // To increase the chance of O(nlog(n)) running time from the quick sort algorithm, it would be great if we can
    // use the median as the pivot for partition. Therefore, we are interested in knowing some ways to find the median.
    public static void main(String[] args) {
        System.out.println(medianOf3(1, 10, 3)); // 3
        System.out.println(medianOfThree(20, 100, 50)); // 50
    }
    /**
     * An easy-to-understand algorithm
     * @param a input
     * @param b input
     * @param c input
     * @return median of the three
     */
    public static int medianOf3(int a, int b, int c) {
        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            return a;
        }
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return b;
        }
        return c;
    }

    /**
     * A faster algorithm: using exclusive OR (^)
     * @param a input
     * @param b input
     * @param c input
     * @return median of the three
     */
    public static int medianOfThree(int a, int b, int c) {
        if ((a > b) ^ (a > c)) { // Either a > b or a > c
            return a;
        }
        if ((b > a) ^ (b > c)) { // Either b > a or b > c
            return b;
        }
        return c;
    }
}

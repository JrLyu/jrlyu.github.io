public class TestMain {
    /**
     * To test for the sorting algorithms, try different case numbers.
     *      0 - Test Selection Sort
     *      1 - Test Bubble Sort
     *      2 - Test Improved Bubble Sort
     *      3 - Test Insertion Sort
     *      4 - Test Merge Algorithm
     *      5 - Test Merge Sort
     *      6 - Test Improved Merge Sort: Tim Sort
     *      7 - Test Improved Merge Sort: Improved Tim Sort
     *      8 - Test Non-Recursive Merge Sort Algorithm
     *      9 - Test Quick Sort
     *      10 - Test Quick Sort with Shuffling
     */
    public static void main(String[] args) {
        int caseNum = 11;

        Integer[] a = {2, 9, 8, 4, 7, 6, 1};
        TestCodes.test(caseNum, a);

        Integer[] A = { 5, 4, 1, 7, 2, 9, 3, 6 };
        TestCodes.test(caseNum, A);

        String[] b = {"xyz", "abc", "uvw", "klm"};
        TestCodes.test(caseNum, b);

        String[] B = { "klm", "xyz", "abc", "uvw", "qrs", "fgh", "bcd", "mno"};
        TestCodes.test(caseNum, B);
    }
}

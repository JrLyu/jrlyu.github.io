public class MergeSort {
    /**
     * The merge algorithm. This algorithm aims to merge two sorted portions of the array,
     * and create a combined sorted array.
     *
     * The merge algorithm will only merge the array elements inside A[s] -> A[e−1].
     * The merge algorithm will not affect the array elements outside the range
     * We use 2 indexes i and j to point to the current elements in each sorted array portion:
     *      - The element A[i] is always the smallest value in the left (sorted) portion
     *      - The element A[j] is always the smallest value in the right (sorted) portion
     * We use a helper array variable H[] array to perform the merge operation:
     * We will repeatedly copy the smallest value from both arrays to H[]
     * Finally, we will copy H back to A when both sorted portions are exhausted.
     * @param A The array to be merged
     * @param s start = the start index of the first sorted portion
     * @param m middle = the start index of the second sorted portion
     * @param e end = end index of the second sorted portion
     * @param H the helper array
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void merge(T[] A, int s, int m, int e, T[] H) {
        /*
        The merge( ) method will be invoked repeatedly.
        If we create a helper array inside merge( ), we would repeatedly allocate and de-allocate memory
        That is inefficient!
        So we create the helper array in main( ) once, and pass it to merge() as parameter H[ ]
         */
        int i = s, j = m; // current elements in the left and right (sorted) portions
        int k = 0; // // Current copy location in helper array H
        while (i < m || j < e) {// loop as long as there are unprocessed items
            if (i < m && j < e) { // Case 1: Both (sorted) portions have unprocessed elements
                if (A[i].compareTo(A[j]) <= 0) {
                    H[k++] = A[i++];
                    /*
                    The above code is equivalent to:
                    H[k] = A[i];
                    i++;
                    k++;
                     */
                } else {
                    H[k++] = A[j++];
                }
            } else if (i == m) { // Case 2: The left portion is exhausted
                H[k++] = A[j++];
            } else if (j == e) { // Case 3: The right portion is exhausted
                H[k++] = A[i++];
            }
        }
        // Copying H[] back to A[]
        for (i = s, k = 0; i < e; i++, k++) {
            A[i] = H[k];
        }
    }
    /*
    Run time analysis:
        - The # times that the while-loop is executed is equal to e − s = n.
        - The # times that the for-loop is executed is equal to e − s = n.
        - Therefore: the running time of the merge( ) algorithm = 2n = O(n).
     */

    /**
     * Merge Sort:
     * Sorting an array a[ ] of n elements:
     *      1. split the array a[ ] into 2 halves:
     *          - an array left[ ] containing a[0] -> a[n/2]
     *          - an array right[ ] containing a[n/2 + 1] -> a[n-1]
     *      2. Sort both halves of the arrays (left[ ] and right[ ])
     *      3. Merge the sorted arrays into the final sorted array
     * @param A array to be sorted
     * @param s the starting index
     * @param e the ending index
     * @param H a helper array
     * @param <T> data type that implements Comparable interface
     */
    public static <T extends Comparable<T>> void mergeSort(T[] A, int s, int e, T[] H) {
        if ( e - s <= 1 ) { // A[s]..A[e] has 0 or 1 element
            return; // No need to sort an array of 1 element...
        }
        int m = (e+s) / 2; // m = middle of s and e

        /* ------------------------------------------------
            "Easy to understand" merge sort: ---> Recursion
                (1) sort the first half of the array using merge sort
                (2) sort the 2nd half of the array using merge sort
                (3) merge the 2 sorted portions
        ------------------------------------------------ */
        mergeSort(A, s, m, H);
        mergeSort(A, m, e, H);

        // Merge both sorted arrays
        merge(A, s, m, e, H); // We have discussed merge() previously !
    }
    /*
    Run time analysis:
        - Suppose that the running time of MergeSort.sort(A, n, H) is T(n):
            - T(n) = 0 for n <= 1 --> Base case: T(1)=0
            - T(n) = 2 T(n/2) + 2n
        - Telescoping Method:
            T(n) = 2T(n/2) + 2n             <--- T(n/2) = 2T(n/4) + 2(n/2)
                 = 2(2T(n/4) + 2(n/2)) + 2n
                 = 2^2T(n/4) + 4n/2 + 2n
                 = 2^2T(n/4) + 2n + 2n      <--- T(n/4) = 2T(n/8) + 2(n/4)
                 = 2^2(2T(n/8) + 2(n/4)) + 2n + 2n
                 = 2^3T(n/8) + 8(n/4) + 2n + 2n
                 = 2^3T(n/8) + 2n + 2n + 2n
             ......
             T(n) = 2^kT(n/(2^k)) + 2n + 2n + 2n + 2n + ... + 2n
                                  <-------------------------->
                                               k terms
             Eventually, we want n/2^k = 1   <--->    n=2^k    <---> k=log(n)
             So, T(n) = 2^k * T(1) + 2kn = 0 + 2kn = 2nlog(n)
     */

    /**
     * Although O(nlog(n)) is, theoretically, the lower bound of the running time for a sorting algorithm, we can still
     * improve our merge sort algorithm:
     *      - There is a very high overhead to execute a recursive algorithm for tiny sublists
     * In this hybrid sorting algorithm, we will do selection sort if the array length is smaller than some cutoff
     * value of choice. In this way, we can reduce the number of calls of the recursive method and save time.
     * @param A the array to be sorted
     * @param s the staring index
     * @param e the ending index
     * @param H the helper array
     */
    public static <T extends Comparable<T>> void timSort(T[] A, int s, int e, T[] H) {
        if (e - s <= 5) { // Use a different sort alg for small inputs
            BasicSort.selectionSort(A, s, e);
            return;
        }
        int m = (e+s)/2;       // m = middle of s and e

        mergeSort(A, s, m, H);
        mergeSort(A, m, e, H);

        // Merge both sorted arrays
        merge(A, s, m, e, H); // We have discussed merge() previously !
    }

    /**
     * Another improvement on the merge sort tarted on the following limitation of the original algorithm:
     *      - Merge sort will merge even when the 2 halves are sorted
     * What we do to improve is that check if the 2 (sorted) array halves "overlap" before invocating merge()
     * @param A the array to be sorted
     * @param s the staring index
     * @param e the ending index
     * @param H the helper array
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void improvedMergeSort(T[] A, int s, int e, T[] H) {
        if ( e - s <= 5 ) { // Use a different sort alg for small inputs
            BasicSort.selectionSort(A, s, e);
            return;
        }
        int m = (e+s)/2;       // m = middle of s and e
        mergeSort(A, s, m, H);
        mergeSort(A, m, e, H);
        // Merge both sorted arrays only when values overlap
        if (A[m-1].compareTo(A[m]) < 0) {
            return;         // Small optimization
        }
        merge(A, s, m, e, H); // We have discussed merge() previously !
    }

    // The merge sort is stable, but it will never be in-place because we will always need a helper array.


    /**
     * Non-recursive merge sort algorithm
     * @param A array to be sorted
     * @param H the helper array
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void nonRecursiveMerge(T[] A, T[] H) {
        int mergeSize = 1;
        while (mergeSize < A.length) {
            int m, e;
            for (int s = 0; s < A.length; s += 2*mergeSize) {
                m = s + mergeSize;
                e = Math.min(A.length, s + 2*mergeSize);
                merge(A, s, m, e, H);
            }
            mergeSize = 2*mergeSize;
        }
    }
}

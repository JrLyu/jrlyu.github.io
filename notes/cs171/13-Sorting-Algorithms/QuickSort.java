public class QuickSort {
    /**
     * This is the quick sort algorithm that will sorts array elements A[s] ... A[e-1]
     * The quick sort algoirthm will partition the array into two parts according to a specific pivot.
     * One part of the partitioned array will have elements smaller than the pivot, and the other part will have elements
     * greater than the pivot.
     * Repeating the process above, we will eventually get a sorted array
     * This algorithm will be in-place, but it is not stable
     *
     * @param A the array to be sorted
     * @param s the starting index
     * @param e the endng index
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void quickSort(T[] A, int s, int e) {
        if (e - s <= 1) { // axiom: an array of only one element is already sorted! -- Base case
            return;
        }
        int pivotLoc = partition(A, s, e);
        quickSort(A, s, pivotLoc);   // Sort left half with quick sort
        quickSort(A, pivotLoc+1, e); // Sort right half with quick sort
    }
    /*
    Run time analysis of the quickSort algorithm: depends on how partition() splits up the array
    The best case running time is O(nlog(n))
    The worst case running time is O(n^2): when we sort a sorted array with quick sort
    The average case running time is 2(n+1)log(n)=O(nlog(n))
     */

    /**
     * The partition algorithm will partition the array A into subarrays A[s..e-1] using A[s] as pivot
     * @param A The array to be partitioned
     * @param s the staring index
     * @param e the ending index
     * @param <T> data type that implements the Comparable interface
     * @return the index (= location) of the pivot element (which is the border of the 2 subarrays/groups)
     */
    public static <T extends Comparable<T>> int partition(T[] A, int s, int e) {
        T pivot = A[s];
        int low = s+1;
        int high = e-1;
        while (low <= high) {
            if (A[high].compareTo(pivot) >= 0) {
                high--;
            } else {
                exch(A, low, high);
                low++;
            }
        }
        exch(A, s, high); // A[s] = pivot
        return high;
    }
    /*
    Rune time Analysis of Partition: Simplified code for partition:
    public static <T extends Comparable<T>> int partition(T[] A, int s, int e) {
        T pivot = A[s];
        int low = s+1, high = e-1;
        while (low <= high) {
            doPrimitive(); // either do high--; or low++;
            ---> Loop will run (e-1) - (s+1) times = e - 1 - s - 1 = e - s - 2
        }
        doPrimitive();     //  1
        return high;
    }
    So, in total, the running time for the partition algorithm is n-1 ~= n
     */

    /**
     * The book has a different representation of the partition algorithm:
     * Partition algorithm for the integer (int) data type
     * @param list the list being partitioned
     * @param first the first index
     * @param last the last index
     */
    public static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low   = first + 1;   // Index for forward search
        int high =  last  - 1;   // Index for backward search
        while (low < high) {
            // Search forward from the left
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Search backward from the right
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // Swap two elements in the list
            if (low < high) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        // Adjust high to find the border
        while (high > first && list[high] >= pivot) {
            high--;
        }

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        return first;
    }

    /**
     * The generic method for exchanging elements in an array
     *
     * @param a the array
     * @param i index of one of the elements being changed
     * @param j index of the other element being changed
     * @param <T> Data type that implements the Comparable interface (that is,
     *           public int compareTo(T o); is defined)
     */
    public static <T extends Comparable<T>> void exch(T[] a, int i, int j ) {
        T help = a[i];
        a[i] = a[j];
        a[j] = help;
    }
}

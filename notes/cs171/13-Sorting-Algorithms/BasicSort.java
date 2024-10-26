import java.util.Arrays;

public class BasicSort {
    /**
     * The generic method for selection sort
     * @param list The array to be sorted
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        for (int i = 0; i < list.length-1; i++) {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
               ----------------------------------------------- */
            T min = list[i];  // Assume the first element is min
            int minIndex = i; // Index where min is found

            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) { // compare list[k] and min
                    min = list[k]; // Update min value
                    minIndex = k;  // Update its index
                }
            }
            /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary
               ------------------------------------------------------ */
            if (minIndex != i) {
                exch(list, i, minIndex); // Swap list[minIndex] and list[i]
            }
            System.out.println(Arrays.toString(list));
        }
    }
    /* Running time analysis: The core of selection sort algorithm is as follows
     *  for (int i = 0; i < n-1; i++) {
     *      for (int k = i+1; k < n; k++) {
     *          doPrimitive();
     *      }
     *  }
     *
     * With the structure and running time analysis, we know this algorihtm is O(n^2). O(n^2) is bad!
     *
     * Selection sort is an in-place sorting algorithm, but it is not stable.
     */

    /**
     * The generic method for selection sort of a small part of the array
     * @param list The array to be sorted
     * @param s the starting point
     * @param e the ending point
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list, int s, int e) {
        for (int i = s; i < e; i++) {
            T min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < e; k++) {
                if (list[k].compareTo(min) < 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                exch(list, i, minIndex);
            }
        }
    }

    /**
     * The generic method for bubble sort. The bubble sort algorithm does the following:
     *      - Compare every pair of adjacent elements
     *      - Exchange (= swap) them if they are out of order
     *
     * @param list the list to be sorted
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++) { // Repeat n-1 times
            // Compare every adjacent pair of elements
            for (int j = 0; j < n-1-i; j++) {
                if (list[j].compareTo(list[j+1]) > 0) { // If out of place
                    exch(list, j, j+1);  // Swap arr[j] and arr[j+1]
                }
                System.out.println(Arrays.toString(list));
            }
        }
    }
    /* Running time analysis:
     *  for (int i = 0; i < n-1; i++) {
     *      for ( int j = 0; j < n-1-i; j++ )
     *          doPrimitive();
     *      }
     *  }
     *
     * We will have this algorithm is O(n^2).
     *
     * Bubble sort is an in-place and stable sorting algorithm
     */

    /**
     * Improved bubble sort: the code will detect the number of swaps made in each iteration
     * If in some iterations, we made no swaps, the sorting will terminate to prevent wasting of time
     *
     * @param list the list to be sorted
     * @param <T> Data type that implements the Caomparable interface
     */
    public static <T extends Comparable<T>> void bubbleSort2(T[] list) {
        int n = list.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) { // Repeat n-1 times
            swapped = false;
            // Compare every adjacent pair of elements
            for (int j = 0; j < n-1-i; j++) {
                if (list[j].compareTo(list[j+1]) > 0) { // If out of place
                    exch(list, j, j+1);  // Swap arr[j] and arr[j+1]
                    swapped = true;
                }
            }
            if (!swapped) { // No swaps -> sorted!! -> exit the loop
                break;
            }
            System.out.println(Arrays.toString(list));
        }
    }

    /**
     * Insertion sort does the following things:
     *      - Selects the next unsorted element/key in the array
     *      - Insert (= exchange) it towards the front into its correct position
     * @param list list to be sorted
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) { // Repeat n-1 times
            // Compare arr[i] with each prior element
            for (int j = i; j > 0; j--) {
                if (list[j-1].compareTo(list[j]) > 0) // If out of place
                    exch( list, j-1, j);  // Swap list[j-1] and list[j]
                else
                    break;               // STOP
            }

            System.out.println(Arrays.toString(list));
        }
    }
    /* The loop structure is the following:
     *  for (int i = 1; i < n; i++) {
     *      for ( int j = i; j > 0; j-- ) {
     *          doPrimitive();  // Worst case analysis (ignore break)
     *      }
     *  }
     *
     * Doing the worst case analysis, we still have the running time of the algorithm is O(n^2).
     *
     * Insertion sort is in-place and stable.
     */

    /**
     * The generic method for exchanging elements in an array
     *
     * @param a the array
     * @param i index of one of the elements being changed
     * @param j index of the other element being changed
     * @param <T> Data type that implements the Comparable interface (that is,
     *           public int compareTo(T o); is defined)
     */
    private static <T extends Comparable<T>> void exch(T[] a, int i, int j ) {
        T help;

        help = a[i];
        a[i] = a[j];
        a[j] = help;
    }
}

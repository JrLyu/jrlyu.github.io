import java.util.Arrays;

import static java.util.Arrays.sort;

public class TestCodes {
    /**
     * This is a test method for all the sorting algorihtms we have encountered
     * @param caseNum integer from 0 to 5
     * @param a the array to be sorted
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void test(int caseNum, T[] a) {
        Object[] H = new Integer[a.length];   // Helper array for Merge
        switch (caseNum) {
            case 0:
                System.out.println("------ Test Selection Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                BasicSort.selectionSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 1:
                System.out.println("------ Test Bubble Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                BasicSort.bubbleSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 2:
                System.out.println("------ Test Improved Bubble Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                BasicSort.bubbleSort2(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 3:
                System.out.println("------ Test Insertion Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                BasicSort.insertionSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 4:
                System.out.println("------ Test Merge Algorithm ------");
                Integer[] list = {2, 9, 4, 6, 7, 3, 5, 8, 10, 1};
                //                      <----->  <----->
                //                       sorted  sorted
                Integer[] help = new Integer[list.length];      // Helper array
                System.out.println("\nBefore merging: \n" + Arrays.toString(list) + "\n");
                MergeSort.merge(list, 2, 5, 8, help);
                System.out.println("\nAfter merging: \n" + Arrays.toString(list) + "\n");
                break;
            case 5:
                System.out.println("------ Test Merge Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                try {
                    MergeSort.mergeSort(a, 0, a.length, (T[]) (H));
                    System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");

                } catch (Exception e) {
                    System.out.println("Data type not supported. Try Integer. ");
                }
                break;
            case 6:
                System.out.println("------ Test Improved Merge Sort: Tim Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                try {
                    MergeSort.timSort(a, 0, a.length, (T[]) (H));
                    System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");

                } catch (Exception e) {
                    System.out.println("Data type not supported. Try Integer. ");
                }
                break;
            case 7:
                System.out.println("------ Test Improved Merge Sort: Improved Tim Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                try {
                    MergeSort.improvedMergeSort(a, 0, a.length, (T[]) (H));
                    System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");

                } catch (Exception e) {
                    System.out.println("Data type not supported. Try Integer. ");
                }
                break;
            case 8:
                System.out.println("------ Test Non-Recursive Merge Sort Algorithm ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                try {
                    MergeSort.nonRecursiveMerge(a, (T[]) (H));
                    System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");

                } catch (Exception e) {
                    System.out.println("Data type not supported. Try Integer. ");
                }
                break;
            case 9:
                System.out.println("------ Test Quick Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                QuickSort.quickSort(a, 0, a.length);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 10:
                System.out.println("------ Test Quick Sort with Shuffle------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                // shuffle array A
                for ( int k = 0; k < a.length; k++ ) {
                    int i = (int)(Math.random() * a.length);
                    int j = (int)(Math.random() * a.length);
                    QuickSort.exch(a, i, j);
                }
                System.out.println("Shuffled Array: \n" + Arrays.toString(a) + "\n");
                QuickSort.quickSort(a, 0, a.length);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 11:
                // In java.util.Arrays.sort,
                // sort(int[] a): uses a Dual-Pivot Quicksort algorithm, and
                // sort(Object[] a): implements a stable, adaptive, iterative mergesort.
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                sort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            default:
                System.out.println("------ Invalid Input caseNum! ------");
                break;
        }
    }
}

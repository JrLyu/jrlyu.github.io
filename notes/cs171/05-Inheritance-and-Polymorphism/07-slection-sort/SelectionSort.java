public class SelectionSort {
    public static void main(String[] args) {
        int[] myList = {8, 4, 9, 7, 3, 5, 6, 1, 2};

        // Print list[] before sorting
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println();

        selectionSort(myList);

        // Print list[] after sorting
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i..list.length-1]
            int min = list[i]; // Assume the first element is min
            int minIndex = i; // Index where min is found
            for (int k = minIndex; k < list.length; k++) {
                if (list[k] < min) { // Found a smaller element
                    min = list[k]; // Update min value
                    minIndex = k; // Update its index
                }
            }

            // Swap list[i] with list[minIndex] if necessary
            if (minIndex != i) {  // Swap list[minIndex] and list[i]
                int help = list[minIndex];  // Standard exchange alg
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }

    // The big idea of this algorithm
    /* -----------------------------------------------
       Find the minimum in the list[i..list.length-1]
       -----------------------------------------------
                              <---- find min in sublist ---->
                 +---+---+---+---+---+---+---+---+---+---+---+
                 | 1 | 2 | 3 |...|...|...| 4 |...|...|...|...|
                 +---+---+---+---+---+---+---+---+---+---+---+
                               ^           ^
                               |           |
                               i         minIndex
       ------------------------------------------------------
           Swap list[i] with list[minIndex] if necessary
       ------------------------------------------------------
                +---+---+---+---+---+---+---+---+---+---+---+
                | 1 | 2 | 3 | 4 |...|...|...|...|...|...|...|
                +---+---+---+---+---+---+---+---+---+---+---+
     */
}

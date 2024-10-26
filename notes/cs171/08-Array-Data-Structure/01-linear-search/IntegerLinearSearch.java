// If we have no information on the array, we need to use this algorithm
public class IntegerLinearSearch {
    /**
     * For a given search value key, find the index of the (first) array element that contains the search value key
     * Return −1 when the key is not found in the array
     *
     * Running time Analysis:
     *      Best case scenario: 1 step
     *      Worst case scenario: N steps
     *      Average case scenario: N/2 steps
     *
     * @param list array being searched
     * @param key value key
     * @return index of the search value key; -1 if the key is not found
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        // key was not found in list[]
        return -1;
    }

    public static void main(String[] args) {
        int[] myList = {1, 4, 4, 2, 5, -3, 6, 2};

        System.out.println(linearSearch(myList,  4)); // Returns  1
        System.out.println(linearSearch(myList, -4)); // Returns -1
        System.out.println(linearSearch(myList, -3)); // Returns 5
    }
}

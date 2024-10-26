public class LinearSearch {
    /**
     * For a given search value key, find the index of the (first) array element that contains the search value key
     * Return −1 when the key is not found in the array
     *
     * @param list array being searched
     * @param key value key
     * @return index of the search value key; -1 if the key is not found
     */
    public static <T> int linearSearch(T[] list, T key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        // key was not found in list[]
        return -1;
    }
}

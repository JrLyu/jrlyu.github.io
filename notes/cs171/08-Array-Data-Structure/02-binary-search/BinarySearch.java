// This algorithm is helpful, especially when we have our arrays sorted
public class BinarySearch {
    /**
     * For a given search value key, find the index of the (first) array element that contains the search value key
     * Return −1 when the key is not found in the array
     *
     * Running time Analysis:
     *      Best case scenario: 1 step
     *      Worst case scenario:
     *          (N/2)^{k-1} = 1 ==> k = log(N)+1, k = number of interations
     *          Hence, worst case scenario, we need ~log(N) steps
     *       Average case scenario: N/2 steps
     *
     * @param list array being searched
     * @param key value key
     * @return index of the search value key; -1 if the key is not found
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // if not found
    }

    public static void main(String[] args) {
        int[] myList = {1, 5, 9, 17, 19, 78, 99, 143, 450, 876, 999};
        int r;

        r = binarySearch(myList, 143);
        System.out.println("r = " + r);
    }
}

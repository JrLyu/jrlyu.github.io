public class AddElements {
    /**
     * This algorithm adds an element to the end of the array.
     * @param list array being modified
     * @param x element being added
     */
    public static int[] addElements(int[] list, int  x) {
        int[] temp = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        temp[temp.length - 1] = x;
        return temp;
    }

    public static void main(String[] args) {
        int[] myList = {1, 4, 4, 2, 5, -3, 6, 2};
        int x = 10;

        System.out.println("------ Before Adding ------");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println("");

        myList = addElements(myList, x);
        System.out.println("------ After Adding ------");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}

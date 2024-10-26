public class DeleteElements {
    /**
     * This algorithm deltes the last element of the array
     * @param list array being modified
     */
    public static int[] deleteElements(int[] list) {
        int[] temp = new int[list.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = list[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] myList = {1, 4, 4, 2, 5, -3, 6, 2};

        System.out.println("------ Before Deleting ------");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println("");

        myList = deleteElements(myList);
        System.out.println("------ After Deleting ------");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}

public class AbstractSort {
    public static void main(String[] args) {
        AbstractGeometric[] myListGeoObj = new AbstractGeometric[4];
        myListGeoObj[0] = new AbstractCircle("red", 2);
        myListGeoObj[1] = new AbstractRectangle("blue", 1, 1);
        myListGeoObj[2] = new AbstractCircle("white", 5);
        myListGeoObj[3] = new AbstractRectangle("black", 4, 4);
        selectionSort(myListGeoObj);
        System.out.println("\n------ Sort Geometric Objects ------");
        for ( int i = 0; i < myListGeoObj.length; i++) {
            System.out.println(myListGeoObj[i]);
        }
    }

    public static void selectionSort(AbstractGeometric[] list) {
        for (int i = 0; i < list.length-1; i++) {
            AbstractGeometric min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].getArea() < min.getArea()) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if ( minIndex != i ) {
                AbstractGeometric help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }
}
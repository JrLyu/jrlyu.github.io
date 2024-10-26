public class SelectionSortGeometricObject {
    public static void main(String[] args) {
        SortCircle[] myListCirc = new SortCircle[4]; // Array of Circles objs
        myListCirc[0] = new SortCircle("red", 2);
        myListCirc[1] = new SortCircle("blue", 1);
        myListCirc[2] = new SortCircle("white", 5);
        myListCirc[3] = new SortCircle("black", 3);
        selectionSort(myListCirc);
        System.out.println("------ Sort Circles ------");
        for ( int i = 0; i < myListCirc.length; i++) {
            System.out.println(myListCirc[i]);
        }

        SortRectangle[] myListRect = new SortRectangle[4];
        myListRect[0] = new SortRectangle("red", 2, 1);
        myListRect[1] = new SortRectangle("blue", 1, 1);
        myListRect[2] = new SortRectangle("white", 5, 1);
        myListRect[3] = new SortRectangle("black", 3, 2);
        selectionSort(myListRect);
        System.out.println("\n------ Sort Rectangles ------");
        for ( int i = 0; i < myListRect.length; i++) {
            System.out.println(myListRect[i]);
        }

        SortGeometricObject[] myListGeoObj = new SortGeometricObject[4];
        myListGeoObj[0] = new SortCircle("red", 2);
        myListGeoObj[1] = new SortRectangle("blue", 1, 1);
        myListGeoObj[2] = new SortCircle("white", 5);
        myListGeoObj[3] = new SortRectangle("black", 4, 4);
        selectionSort(myListGeoObj);
        System.out.println("\n------ Sort Geometric Objects ------");
        for ( int i = 0; i < myListGeoObj.length; i++) {
            System.out.println(myListGeoObj[i]);
        }
    }
    public static void selectionSort(SortCircle[] list) {
        for (int i = 0; i < list.length-1; i++) {
            SortCircle min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].getArea() < min.getArea()) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                SortCircle help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }

    public static void selectionSort(SortRectangle[] list) {
        for (int i = 0; i < list.length-1; i++) {
            SortRectangle min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].getArea() < min.getArea()) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if ( minIndex != i ) {
                SortRectangle help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }

    public static void selectionSort(SortGeometricObject[] list) {
        for (int i = 0; i < list.length-1; i++) {
            SortGeometricObject min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].getArea() < min.getArea()) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if ( minIndex != i ) {
                SortGeometricObject help = list[minIndex]; // parent object can be asigned with a child object
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }
}

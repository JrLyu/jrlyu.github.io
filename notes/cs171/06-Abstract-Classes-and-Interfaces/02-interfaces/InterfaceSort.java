public class InterfaceSort {
    static void selectionSort(ComparableThing[] list) {
        for (int i = 0; i < list.length-1; i++) {
            ComparableThing min = list[i];
            int minIndex = i;
            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                ComparableThing help = list[minIndex];
                list[minIndex]= list[i];
                list[i] = help;
            }
        }
    }
}

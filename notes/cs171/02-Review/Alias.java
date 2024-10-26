public class Alias {
    public static void main(String[] args) {
        double[] myList = {34, 15, 66, 7};

	    System.out.println("\nInitially:");
        System.out.print("myList[i] = ");
	    for (int i = 0; i < myList.length; i++) {
	        System.out.print(myList[i] + " ");
        }
	    System.out.println("\n");

        double[] myListCopy;

        myListCopy = myList; // Does not copy an array object 

	    myListCopy[1] = 999; // Update will also affect myList[1]

	    System.out.println("After myListCopy[1] = 999:");
        System.out.print("myList[i] = ");
	    for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        } 
	    System.out.println("");

        System.out.print("myListCopy[i] = ");
        for (int i = 0; i < myListCopy.length; i++) {
            System.out.print(myListCopy[i] + " ");
        }
        System.out.println("\n");
    }
}

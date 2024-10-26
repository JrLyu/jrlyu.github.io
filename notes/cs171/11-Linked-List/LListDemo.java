public class LListDemo {
    public static SimpleNode first; // Define the first variable

    public static void main(String[] args) {
        SimpleNode<String> help1 = new SimpleNode<>();
        SimpleNode<String> help2 = new SimpleNode<>();
        SimpleNode<String> help3 = new SimpleNode<>();

        help1.item = "to";
        help2.item = "be";
        help3.item = "or";

        help1.next = help2;
        help2.next = help3;
        help3.next = null ; // null marks the end

        first = help1; // Done
        printLList(help1);
        System.out.println(findNode(help1, "or"));
    }

    // Standard Traversal Algorithm
    public static void traversal(SimpleNode f) {
        SimpleNode current = f; // make current = the first node
        while (current != null) {
            // Process current node here
            current = current.next;  // Move to the next node
        }
    }

    /**
     * This method uses the standard traversal algorithm to print all the elements of a linked list
     * @param f the first node of the linked list
     */
    public static void printLList(SimpleNode f) {
        SimpleNode current = f; // p now points to the first node

        while (current != null) {
            // Process data (p.item) in node p
            // Notice:  p.next is the address of the next Node!
            System.out.println(current.item);
            current = current.next;
        }
    }

    /**
     * The method findNode(f, s) finds a node in linked list f that contains the value s.
     * @param f the first node of the linked list
     * @param s the string to be found
     * @return the node where we found s
     */
    public static SimpleNode findNode(SimpleNode f, String s) {
        SimpleNode p = f; // Start at the first node f

        while ( p != null ) { // Visit every node in list f
            if ( p.item.equals( s ) )
                return p; // Found s --> return p
            p = p.next; // Advances p to next node
        }
        return null; // not found
    }
}

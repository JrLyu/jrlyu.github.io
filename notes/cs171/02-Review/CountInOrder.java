public class CountInOrder {
    public static void main(String[] args) {
        int[] test = new int[]{3, 7, 8, 5, 4, 9};
        System.out.println(inorder(test));
    }

    public static int inorder(int[] x) {
        int result = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[i - 1]) {
                result += 1;
            }
        }
        return result;
    }
}

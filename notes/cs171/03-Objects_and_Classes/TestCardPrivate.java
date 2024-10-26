public class TestCardPrivate {
    public static void main(String[] args) {
        // CardPrivate c1 = new CardPrivate("Spades", "Ace");
        CardPrivate c1 = new CardPrivate(1, "Ace");

        if (c1.getSuit().compareTo("Spades") == 0) {
            System.out.println("The suit is Spades! ");
        } else {
            System.out.println("The suit is not Spades :(");
        }
    }
}

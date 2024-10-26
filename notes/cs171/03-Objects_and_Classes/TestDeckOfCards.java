public class TestDeckOfCards {
    public static void main(String[] args) {
        DeckOfCards d = new DeckOfCards(); // Create 1 deck of cards

        for (int i = 0; i < 53; i++) {
            System.out.println(d.deal()); // deal out 53 cards
        }
        System.out.println();

        d.shuffle(); // shuffle the cards
        for (int i = 0; i < 5; i++) {
            System.out.println(d.deal()); // deal 5 cards
        }
    }
}

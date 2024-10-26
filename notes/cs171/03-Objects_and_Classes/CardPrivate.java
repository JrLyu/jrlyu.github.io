public class CardPrivate {
    // private String suit;
    // Now, we want to make suit as an int
    private int suit; // 0 = "Spade", 1 = "Hearts", 2 = "Diamonds", 3 = "Clubs"
    private String rank;

    CardPrivate(int cardSuit, String cardRank) {
        suit = cardSuit;
        rank = cardRank;
    }

    public String getSuit() { // Accessor or "getter" method
        String[] suitToString = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
        return suitToString[suit];
    }

    public void setSuit(int newSuit) { // Mutator or "setter" method
        suit = newSuit;
    }
}

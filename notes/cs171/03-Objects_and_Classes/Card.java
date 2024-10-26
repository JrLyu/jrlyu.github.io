public class Card {
    // In the real world, a deck of card contains 52 cards consisting of 13 ranks and 4 suits

    // A card will have the following properties:
    //  - A suit (e.g.: Spades, Hearts, Diamond, Clubs)
    //  - A rank (e.g.: Ace, 2, 3, ..., 9, 10, Jack, Queen, King)
    private String suit;
    private String rank;

    public Card(String cardSuit, String cardRank) { // constructor of a card
        suit = cardSuit;
        rank = cardRank;
    }

    // The call of System.out.println(object) will always print the output of object.toString().
    // To control how an object will be printed out,
    // define String toString() that returns a nicer String with the object's information
    public String toString() {
        return rank + " of " + suit;
    }
}

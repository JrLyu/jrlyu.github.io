public class DeckOfCards {
    // A deck of cards contains 52 cards and should be able to perform
    // - shuffle(): re-arranges the cards randomly. After shuffle( ), all cards are available for dealing
    // - deal(): deals out the top of the card in the deck. A card that is dealt cannot be dealt again

    private Card[] deck; // Array of 52 cards to be created
    private int dealPosition = 0; // Location of the top of the deck

    public DeckOfCards() { // Initialize a deck of 52 cards
        deck = new Card[52];
        // Define 2 arrays with all the suits and ranks
        String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                         "9", "10", "Jack", "Queen", "King"};
        int k = 0; // Index to deck[]
        // Use nested for loop to make all 52 cards and assign to deck[ ]
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[k] = new Card(suit[i], rank[j]);
                k++;
            }
        }
    }

    public void shuffle() { // Shuffle this deck of cards
        // Generate random numbers j and swap card[i] and card[j]:
        for (int i = 0; i < deck.length; i++) {
            // Generate a random number j
            int j = (int)(Math.random() * deck.length);

            Card temp = deck[i]; // create a place-holder to store the i-th card
            deck[i] = deck[j]; // swap i-th card and j-th card
            deck[j] = temp;
        }
        dealPosition = 0; // reset the next deal card position
    }

    public Card deal() { // Deal the next card from this deck
        // We do not change the size of the array; instead, we change the index of calling the card!
        Card nextCard;
        if (dealPosition < deck.length) {
            nextCard = deck[dealPosition];
            dealPosition++;
        } else {
            return null; // No more cards in the deck; Alternatively: throw an exception
        }
        return nextCard;
    }
}
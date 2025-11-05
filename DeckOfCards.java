import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card> deck = new ArrayList<>(52);
    private static final String[] SUITS = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public DeckOfCards() {
        initializeDeck();
    }

    private void initializeDeck() {
        for (String suit: SUITS) {
            for (String rank: RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }

    public Card dealCard() {
        if(deck.isEmpty()) {
            System.out.println("The deck is empty!");
            return null;
        }
        return deck.remove(0);
    }

    public int cardsRemaining() {
        return deck.size();
    }
}

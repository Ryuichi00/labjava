public class CardGameDemo {
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        System.out.println("Cards in a new deck:" + myDeck.cardsRemaining());
        myDeck.shuffle();
        int cardsToDeal = 4;
        System.out.println("\n--- Dealing the first" + cardsToDeal + " cards ---");
        for (int i = 0; i < cardsToDeal; i++) {
            Card dealtCard = myDeck.dealCard();
            if (dealtCard != null) {
                System.out.println("Card number" + (i + 1) + ": " + dealtCard);
            }
        }
        System.out.println("\nCards remaining in the deck: " + myDeck.cardsRemaining());
    }
}

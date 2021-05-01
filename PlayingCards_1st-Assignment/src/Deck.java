public class Deck {
    private static Card[] cards = new Card[52];

    public Deck() {
        int i = 0;
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                cards[i++] = new Card(rank, suit);
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }
}

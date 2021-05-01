// A program to test the deck and card classes, by creating a deck of cards and displaying its cards.
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for (Card card : deck.getCards()) {
            System.out.println(card.toString());
        }
    }
}
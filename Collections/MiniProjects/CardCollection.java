import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class Card {
    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class CardCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Use a TreeSet with a custom comparator to sort alphabetically by symbol.
        // It also ensures that only the FIRST occurrence of a specific symbol is retained.
        Set<Card> cardSet = new TreeSet<>(new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                return Character.compare(c1.getSymbol(), c2.getSymbol());
            }
        });

        int totalCardsEntered = 0;

        // Keep collecting cards until we have exactly 4 unique symbols
        while (cardSet.size() < 4) {
            System.out.println("Enter a card");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();
            totalCardsEntered++;

            Card newCard = new Card(symbol, number);
            cardSet.add(newCard);
        }

        // Print final summary stats matching the sample output format
        System.out.println("Four symbols gathered in " + totalCardsEntered + " cards.");
        System.out.println("Cards in Set are :");
        
        for (Card card : cardSet) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        scanner.close();
    }
}

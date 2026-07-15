import java.util.*;

// Represents a single card with a symbol and a number
class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public String getSymbol() { return symbol; }
    public int getNumber() { return number; }
    @Override
    public String toString() { return symbol + " " + number; }
}

public class CollectAndGroupCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use TreeMap to store cards grouped by symbol, sorted alphabetically
        Map<String, List<Card>> cardMap = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = scanner.nextLine().trim();
            int number = scanner.nextInt();
            scanner.nextLine();

            // Store cards, creating a new list if the symbol is new
            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(new Card(symbol, number));
        }

        // Output distinct symbols
        System.out.println("Distinct Symbols are :");
        System.out.println(String.join(" ", cardMap.keySet()));

        // Display grouped card details, count, and sum
        for (Map.Entry<String, List<Card>> entry : cardMap.entrySet()) {
            System.out.println("Cards in " + entry.getKey() + " Symbol");
            int sum = 0;
            for (Card card : entry.getValue()) {
                System.out.println(card);
                sum += card.getNumber();
            }
            System.out.println("Number of cards : " + entry.getValue().size());
            System.out.println("Sum of Numbers : " + sum);
        }
        scanner.close();
    }
}

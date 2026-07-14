import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        // Create a TreeSet of Strings (Default sorting is alphabetical)
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Orange");

        System.out.println("Original TreeSet (Sorted): " + ts);

        // a) Reverse the elements of the Collection using descendingSet()
        TreeSet<String> reversedTs = (TreeSet<String>) ts.descendingSet();
        System.out.println("Reversed TreeSet: " + reversedTs);

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("\nIterating reversed elements:");
        Iterator<String> it = reversedTs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check if a particular element exists or not
        String queryElement = "Banana";
        if (ts.contains(queryElement)) {
            System.out.println("\n'" + queryElement + "' exists in the TreeSet.");
        } else {
            System.out.println("\n'" + queryElement + "' does not exist in the TreeSet.");
        }
    }
}

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> empNames = new HashSet<>();

        // Add employee names to the set
        empNames.add("Alice Smith");
        empNames.add("Bob Jones");
        empNames.add("Charlie Brown");
        empNames.add("Diana Prince");

        // Retrieve elements one by one using an Iterator
        System.out.println("Listing employee names using Iterator:");
        Iterator<String> it = empNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

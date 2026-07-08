import java.util.ArrayList;
import java.util.StringJoiner;

public class NameJoiner {
    public static void main(String[] args) {
        // Create and populate the ArrayList with names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Initialize StringJoiner: delimiter =", ", prefix = "{", suffix = "}"
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        // Use forEach loop to add each name to the StringJoiner
        names.forEach(name -> sj.add(name));

        // Display the formatted output
        System.out.println("Formatted Names Sequence:");
        System.out.println(sj.toString()); 
        // Output: {Alice, Bob, Charlie, David}
    }
}

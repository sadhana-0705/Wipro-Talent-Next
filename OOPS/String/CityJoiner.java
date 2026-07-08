import java.util.StringJoiner;

public class CityJoiner {
    public static void main(String[] args) {
        // Initialize s1 with city names separated by a hyphen
        StringJoiner s1 = new StringJoiner("-");
        s1.add("New York");
        s1.add("Los Angeles");
        s1.add("Chicago");

        // Initialize s2 with city names separated by a hyphen
        StringJoiner s2 = new StringJoiner("-");
        s2.add("London");
        s2.add("Paris");
        s2.add("Tokyo");

        // Create copies to independenty test both merge scenarios
        StringJoiner s1_copy1 = new StringJoiner("-").add("New York").add("Los Angeles").add("Chicago");
        StringJoiner s2_copy1 = new StringJoiner("-").add("London").add("Paris").add("Tokyo");

        StringJoiner s1_copy2 = new StringJoiner("-").add("New York").add("Los Angeles").add("Chicago");
        StringJoiner s2_copy2 = new StringJoiner("-").add("London").add("Paris").add("Tokyo");

        // i) s1 merged to s2 (s2 calls merge, appending s1's content onto s2)
        s2_copy1.merge(s1_copy1);
        System.out.println("i) s1 merged to s2 result:");
        System.out.println(s2_copy1.toString());
        // Output: London-Paris-Tokyo-New York-Los Angeles-Chicago

        System.out.println();

        // ii) s2 merged to s1 (s1 calls merge, appending s2's content onto s1)
        s1_copy2.merge(s2_copy2);
        System.out.println("ii) s2 merged to s1 result:");
        System.out.println(s1_copy2.toString());
        // Output: New York-Los Angeles-Chicago-London-Paris-Tokyo
    }
}

import java.util.HashSet;
import java.util.Iterator;

public class CountryManager {
    // Instance variable H1
    private HashSet<String> H1 = new HashSet<>();

    // Method to save country name
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search and get country name
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String current = it.next();
            if (current.equalsIgnoreCase(CountryName)) {
                return current;
            }
        }
        return null;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CountryManager manager = new CountryManager();

        // Adding countries
        manager.saveCountryNames("India");
        manager.saveCountryNames("USA");
        manager.saveCountryNames("Japan");

        // Testing retrieval
        System.out.println("Searching for USA: " + manager.getCountry("USA"));
        System.out.println("Searching for Germany: " + manager.getCountry("Germany"));
    }
}

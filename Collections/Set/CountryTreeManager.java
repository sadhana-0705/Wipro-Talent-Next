import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeManager {
    // Instance variable updated to TreeSet (Automatically maintains natural alphabetical order)
    private TreeSet<String> H1 = new TreeSet<>();

    // Method to save country name
    public TreeSet<String> saveCountryNames(String CountryName) {
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

    public static void main(String[] args) {
        CountryTreeManager manager = new CountryTreeManager();

        // Adding countries
        manager.saveCountryNames("India");
        manager.saveCountryNames("USA");
        manager.saveCountryNames("Japan");

        // The printed set will be naturally sorted: [India, Japan, USA]
        System.out.println("Current TreeSet: " + manager.getCountry("USA") != null ? "USA Found" : "Not Found");
    }
}

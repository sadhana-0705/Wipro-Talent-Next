import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMapManager {
    // Instance variable M1
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Save country and capital
    public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    // 2. Get capital for a given country
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    // 3. Get country for a given capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Invert the map: Capital becomes Key, Country becomes Value
    public HashMap<String, String> invertMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Get an ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test all requirements
    public static void main(String[] args) {
        CountryMapManager manager = new CountryMapManager();
        
        // Sample data insertion
        manager.saveCountryCapital("India", "Delhi");
        manager.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + manager.getCapital("India"));
        System.out.println("Country with Capital Tokyo: " + manager.getCountry("Tokyo"));
        System.out.println("Inverted Map (M2): " + manager.invertMap());
        System.out.println("All Countries List: " + manager.getAllCountries());
    }
}

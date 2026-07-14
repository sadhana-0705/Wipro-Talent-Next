import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ContactListTreeMap {
    public static void main(String[] args) {
        // Create ContactList using TreeMap with generics (String, Integer)
        // Note: Elements will be automatically sorted by key (Name) alphabetically
        TreeMap<String, Integer> contactList = new TreeMap<>();

        // Add some contacts
        contactList.put("John Doe", 987654321);
        contactList.put("Jane Smith", 876543210);
        contactList.put("Alex Jones", 765432109);

        // a) Check if a particular key (Name) exists
        String testName = "Jane Smith";
        System.out.println("Does contact '" + testName + "' exist? " + contactList.containsKey(testName));

        // b) Check if a particular value (Phone Number) exists
        int testNumber = 111111111;
        System.out.println("Does number " + testNumber + " exist? " + contactList.containsValue(testNumber));

        // c) Use Iterator to loop through the map (sorted by keys)
        System.out.println("\n--- Contact List (Sorted via TreeMap) ---");
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> contact = iterator.next();
            System.out.println("Name: " + contact.getKey() + " | Phone: " + contact.getValue());
        }
    }
}

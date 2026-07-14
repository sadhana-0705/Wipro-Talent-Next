import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ContactListHashtable {
    public static void main(String[] args) {
        // Create ContactList using Hashtable with generics (String, Integer)
        // Note: Hashtable is thread-safe and does not allow null keys or null values
        Hashtable<String, Integer> contactList = new Hashtable<>();

        // Add some contacts
        contactList.put("John Doe", 987654321);
        contactList.put("Jane Smith", 876543210);
        contactList.put("Alex Jones", 765432109);

        // a) Check if a particular key (Name) exists
        String testName = "Jane Smith";
        System.out.println("Does contact '" + testName + "' exist? " + contactList.containsKey(testName));

        // b) Check if a particular value (Phone Number) exists
        int testNumber = 876543210;
        System.out.println("Does number " + testNumber + " exist? " + contactList.containsValue(testNumber));

        // c) Use Iterator to loop through the map
        System.out.println("\n--- Contact List via Hashtable ---");
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> contact = iterator.next();
            System.out.println("Name: " + contact.getKey() + " | Phone: " + contact.getValue());
        }
    }
}

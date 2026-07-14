import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {
    public static void main(String[] args) {
        // Create ContactList using HashMap with generics (String, Integer)
        HashMap<String, Integer> contactList = new HashMap<>();

        // Add some contacts
        contactList.put("John Doe", 987654321);
        contactList.put("Jane Smith", 876543210);
        contactList.put("Alex Jones", 765432109);

        // a) Check if a particular key (Name) exists
        String testName = "Jane Smith";
        if (contactList.containsKey(testName)) {
            System.out.println("Contact found for: " + testName + " -> Number: " + contactList.get(testName));
        } else {
            System.out.println("Contact not found for: " + testName);
        }

        // b) Check if a particular value (Phone Number) exists
        int testNumber = 111111111;
        if (contactList.containsValue(testNumber)) {
            System.out.println("The phone number " + testNumber + " exists in the contact list.");
        } else {
            System.out.println("The phone number " + testNumber + " does NOT exist in the contact list.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("\n--- Complete Contact List ---");
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> contact = iterator.next();
            System.out.println("Name: " + contact.getKey() + " | Phone: " + contact.getValue());
        }
    }
}

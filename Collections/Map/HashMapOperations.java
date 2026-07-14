import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap with String keys and String values
        HashMap<String, String> map = new HashMap<>();
        map.add(null, null); // Placeholder representation, use put instead
        map.clear();
        
        map.put("A101", "Alice");
        map.put("B202", "Bob");
        map.put("C303", "Charlie");

        // a) Check if a particular key exists or not
        String searchKey = "B202";
        System.out.println("Does key '" + searchKey + "' exist? " + map.containsKey(searchKey));

        // b) Check if a particular value exists or not
        String searchValue = "Diana";
        System.out.println("Does value '" + searchValue + "' exist? " + map.containsValue(searchValue));

        // c) Use Iterator to loop through the map via entrySet
        System.out.println("\nLooping through map entries using Iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }
}

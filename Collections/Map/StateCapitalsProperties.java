import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class StateCapitalsProperties {
    public static void main(String[] args) {
        // Create a Properties object
        Properties properties = new Properties();

        // Add some States of India and their Capitals
        properties.setProperty("Andhra Pradesh", "Amaravati");
        properties.setProperty("Maharashtra", "Mumbai");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");

        // Get the string property names set
        Set<String> states = properties.stringPropertyNames();
        
        // Use an Iterator to list all elements
        System.out.println("States and Capitals stored in Properties:");
        Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()) {
            String state = iterator.next();
            String capital = properties.getProperty(state);
            System.out.println("State: " + state + " | Capital: " + capital);
        }
    }
}

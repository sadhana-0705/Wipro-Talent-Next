import com.wipro.automobile.ship.compartment;

public class TestShip {
    public static void main(String[] args) {
        // Create an instance of the specific ship compartment class
        compartment cabin = new compartment(14.0, 22.5, 35.0);
        
        System.out.println("=== Testing Isolated Ship Package ===");
        cabin.printDimensions();
    }
}

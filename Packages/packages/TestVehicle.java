// Importing classes from inside the com root folder hierarchy
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("=== Testing Two Wheelers ===");
        Hero bike1 = new Hero("Hero Splendor", "AP-39-AA-1234", "Ravi", 60);
        System.out.println("Owner: " + bike1.getOwnerName() + " | Model: " + bike1.getModelName());
        System.out.println("Speed: " + bike1.getSpeed() + " km/h");
        bike1.radio();

        System.out.println("\n=== Testing Four Wheelers ===");
        Logan car1 = new Logan("Mahindra Logan", "DL-01-C-9999", "Vikram", 80);
        System.out.println("Owner: " + car1.getOwnerName() + " | Model: " + car1.getModelName());
        System.out.println("Speed: " + car1.speed() + " km/h");
        car1.gps();
    }
}

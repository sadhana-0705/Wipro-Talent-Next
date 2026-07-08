import java.util.Optional;

public class OptionalDefaultAddress {
    public static void main(String[] args) {
        // Test case 1: String initialized to null
        String address1 = null;
        Optional<String> optAddress1 = Optional.ofNullable(address1);
        // If empty, falls back to "India"
        String finalAddress1 = optAddress1.orElse("India");
        System.out.println("Address 1 Result: " + finalAddress1); // Output: India

        // Test case 2: String containing an actual address
        String address2 = "New York, USA";
        Optional<String> optAddress2 = Optional.ofNullable(address2);
        String finalAddress2 = optAddress2.orElse("India");
        System.out.println("Address 2 Result: " + finalAddress2); // Output: New York, USA
    }
}

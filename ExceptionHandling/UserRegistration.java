public class UserRegistration {

    // Method to register user and validate location constraints
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        // Perform case-insensitive check to ensure reliable matching
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration registrationSystem = new UserRegistration();

        // Example 1: Testing an out-of-country profile (Mickey, US)
        System.out.println("--- Executing Test Case 1 ---");
        try {
            registrationSystem.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println();

        // Example 2: Testing a valid domestic profile (Mini, India)
        System.out.println("--- Executing Test Case 2 ---");
        try {
            registrationSystem.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}

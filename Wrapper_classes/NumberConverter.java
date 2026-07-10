public class NumberConverter {
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command line argument.");
            return;
        }

        try {
            // Parse the command line argument into an integer
            int number = Integer.parseInt(args[0]);

            // Print the sample output header along with values
            System.out.println("Given Number: " + number);
            System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
            System.out.println("Octal equivalent: " + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));
            
        } catch (NumberFormatException e) {
            System.out.println("Error: The argument provided is not a valid integer.");
        }
    }
}

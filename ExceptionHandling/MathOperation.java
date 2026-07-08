public class MathOperation {
    public static void main(String[] args) {
        try {
            // 1. Verify that exactly 5 inputs are passed via command-line
            if (args.length != 5) {
                System.out.println("Error: Please provide exactly 5 integers as command-line arguments.");
                return;
            }

            int[] numbers = new int[5];
            int sum = 0;

            // 2. Loop through args, parse integers, populate array, and find sum
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            // 3. Compute average (using double precision to avoid precision loss)
            double average = (double) sum / numbers.length;

            // 4. Output the calculations
            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of elements: " + average);

        } catch (NumberFormatException e) {
            // Triggers if any input string is not a valid integer (e.g., "abc" or "2.5")
            System.out.println("java.lang.NumberFormatException: All 5 inputs must be valid integers.");
            
        } catch (ArithmeticException e) {
            // Triggers if an illegal mathematical operation occurs
            System.out.println("java.lang.ArithmeticException: Mathematical error occurred during computation.");
            
        } catch (Exception e) {
            // Backup catch for any other unexpected generic runtime exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

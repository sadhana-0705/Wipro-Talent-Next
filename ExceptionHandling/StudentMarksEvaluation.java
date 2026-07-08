import java.util.Scanner;

// 1. Custom Exception for negative mark entries
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// 2. Custom Exception for marks exceeding 100
class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarksEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Process data for exactly 2 students
        for (int s = 1; s <= 2; s++) {
            System.out.println("--- Entering Details for Student " + s + " ---");
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            int sum = 0;
            boolean validInput = true;

            // Collect scores across 3 separate subject fields
            for (int sub = 1; sub <= 3; sub++) {
                System.out.print("Enter marks for Subject " + sub + ": ");
                try {
                    String input = scanner.nextLine();
                    int mark = Integer.parseInt(input);

                    // Validate custom boundary conditions
                    if (mark < 0) {
                        throw new NegativeValueException("Error: Negative values are strictly prohibited.");
                    }
                    if (mark > 100) {
                        throw new ValueOutOfRangeException("Error: Value out of range! Marks cannot exceed 100.");
                    }

                    sum += mark;

                } catch (NumberFormatException e) {
                    System.out.println("java.lang.NumberFormatException: Input must be a valid whole integer.");
                    validInput = false;
                    break; // Skip current student evaluation loop step due to corrupted data
                } catch (NegativeValueException | ValueOutOfRangeException e) {
                    System.out.println(e.getMessage());
                    validInput = false;
                    break; // Skip current student evaluation loop step due to boundary failure
                }
            }

            // Calculate and display summary calculations if all fields passed validation checks
            if (validInput) {
                double average = (double) sum / 3;
                System.out.println("Summary Profile -> Name: " + name + " | Total: " + sum + " | Average: " + String.format("%.2f", average));
            }
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class SecondLastDigit {

    // Function to return the positive second last digit of a number
    public static int getSecondLastDigit(int number) {
        // Convert to positive to handle negative numbers uniformly
        int positiveNum = Math.abs(number);

        // Single-digit numbers (0 to 9) do not have a second last digit
        if (positiveNum < 10) {
            return -1;
        }

        // Divide by 10 to remove the last digit, then extract the new last digit
        return (positiveNum / 10) % 10;
    }

    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        int userInput = scanner.nextInt();

        // Call the function with user input
        int result = getSecondLastDigit(userInput);

        // Display the result
        System.out.println("The second last digit of " + userInput + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

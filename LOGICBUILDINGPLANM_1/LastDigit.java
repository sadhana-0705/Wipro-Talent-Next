import java.util.Scanner;

public class LastDigit {
    
    // Function to return the positive last digit of a number
    public static int getLastDigit(int number) {
        return Math.abs(number) % 10;
    }

    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        int userInput = scanner.nextInt();

        // Call the function with user input
        int lastDigit = getLastDigit(userInput);

        // Display the result
        System.out.println("The last digit of " + userInput + " is: " + lastDigit);

        // Close the scanner
        scanner.close();
    }
}


import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Compare the numbers and print the greater value
        if (num1 > num2) {
            System.out.println("The greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greater number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}

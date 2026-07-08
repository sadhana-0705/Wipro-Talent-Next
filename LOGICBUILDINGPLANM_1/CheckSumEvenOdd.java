import java.util.Scanner;

public class CheckSumEvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept two integer numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        // Check if the sum is even or odd using the remainder operator
        if (sum % 2 == 0) {
            System.out.println("The sum is EVEN.");
        } else {
            System.out.println("The sum is ODD.");
        }

        // Close the scanner
        scanner.close();
    }
}

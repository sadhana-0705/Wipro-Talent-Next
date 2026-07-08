import java.util.Scanner;

public class AddLastDigitsSolution {

    // Method to add the absolute last digits of two numbers
    public static int addLastDigits(int input1, int input2) {
        // Extract the positive last digit of the first number
        int lastDigit1 = Math.abs(input1) % 10;
        
        // Extract the positive last digit of the second number
        int lastDigit2 = Math.abs(input2) % 10;
        
        // Return their sum
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dynamic user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the result
        int sum = addLastDigits(num1, num2);
        System.out.println("The sum of the last digits is: " + sum);

        scanner.close();
    }
}

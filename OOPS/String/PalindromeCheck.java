import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.System.in);
        
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        // Remove case sensitivity for accurate comparison
        String cleanString = original.toLowerCase();
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(cleanString).reverse().toString();
        
        // Check if original clean string matches the reversed string
        if (cleanString.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}

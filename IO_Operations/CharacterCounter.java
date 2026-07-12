import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input file name from user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // 2. Get the character to search for
        System.out.print("Enter the character to be counted: ");
        String inputCharStr = scanner.nextLine();

        if (inputCharStr.isEmpty()) {
            System.out.println("Error: No character entered.");
            scanner.close();
            return;
        }

        // Take the first character and convert to lowercase for case-insensitivity
        char targetChar = Character.toLowerCase(inputCharStr.charAt(0));
        int count = 0;

        // 3. Read the file and count occurrences
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                // Convert current character to lowercase and compare
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }
            
            // Print the required final output format
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + inputCharStr.charAt(0) + "'.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

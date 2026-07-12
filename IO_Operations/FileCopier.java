import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input file path from user
        System.out.print("Enter the input file name: ");
        String inputFile = scanner.nextLine();

        // 2. Get output file path from user
        System.out.print("Enter the output file name: ");
        String outputFile = scanner.nextLine();

        // 3. Perform file copying using try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            // Print the required confirmation string
            System.out.println("File is copied");

        } catch (IOException e) {
            System.out.println("Error processing file operations: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

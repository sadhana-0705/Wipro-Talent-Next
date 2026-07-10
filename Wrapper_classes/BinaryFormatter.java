import java.util.Scanner;

public class BinaryFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number (between 1 and 255): ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // Check if input is within the specified range
            if (number >= 1 && number <= 255) {
                // Convert integer to raw binary string
                String binaryStr = Integer.toBinaryString(number);
                
                // Pad with leading zeros to format to 8 bits
                String paddedBinaryStr = String.format("%8s", binaryStr).replace(' ', '0');
                
                System.out.println(paddedBinaryStr);
            } else {
                System.out.println("Error: Number must be between 1 and 255.");
            }
        } else {
            System.out.println("Error: Invalid integer input.");
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class RepeatLastN {
    public static String repeatLastNChars(String str, int n) {
        if (str == null || n <= 0) {
            return "";
        }
        
        // Extract the last n characters from the string
        String lastNChars = str.substring(str.length() - n);
        
        // Repeat the extracted substring n times using StringBuilder
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1 from the assignment
        String inputStr = "Wipro";
        int n = 3;
        
        String output = repeatLastNChars(inputStr, n);
        System.out.println("Output: " + output); // Output: propropro
    }
}

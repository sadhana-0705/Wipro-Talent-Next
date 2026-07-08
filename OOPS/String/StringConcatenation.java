public class StringConcatenation {
    public static String concatStrings(String str1, String str2) {
        // Convert both inputs to lowercase immediately
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Check if the last character of str1 matches the first character of str2
        if (str1.length() > 0 && str2.length() > 0 && 
            str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // Omit the overlapping character from the second string
            return str1 + str2.substring(1);
        }
        
        // Otherwise, simply combine them
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Result 1: " + concatStrings("Sachin", "Tendulkar")); 
        // Output: sachintendulkar
        
        // Test Case 2 (Triggers double-character omission)
        System.out.println("Result 2: " + concatStrings("Mark", "kate")); 
        // Output: markate
    }
}

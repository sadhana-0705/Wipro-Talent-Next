public class RepeatChars {
    public static String repeatFirstTwo(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        
        int n = str.length();
        String substring;
        
        // Extract first 2 characters (handle cases where length is less than 2)
        if (n < 2) {
            substring = str;
        } else {
            substring = str.substring(0, 2);
        }
        
        // Append the substring to a StringBuilder n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(substring);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Result 1: " + repeatFirstTwo("wipro")); 
        // Output: wiwiwiwiwi
    }
}

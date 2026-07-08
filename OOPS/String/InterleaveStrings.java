public class InterleaveStrings {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = (a == null) ? 0 : a.length();
        int lenB = (b == null) ? 0 : b.length();
        
        // Find the maximum length to iterate through
        int maxLen = Math.max(lenA, lenB);
        
        for (int i = 0; i < maxLen; i++) {
            // Append from string 'a' if index is within bounds
            if (i < lenA) {
                result.append(a.charAt(i));
            }
            // Append from string 'b' if index is within bounds
            if (i < lenB) {
                result.append(b.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello + World -> " + mixString("Hello", "World"));
        // Output: Hweolrllod
    }
}

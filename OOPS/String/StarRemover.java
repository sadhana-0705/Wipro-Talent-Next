public class StarRemover {
    public static String removeStarAndNeighbors(String str) {
        if (str == null) return null;
        
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            // Check if current character is a star
            if (str.charAt(i) == '*') continue;
            
            // Check if the next character is a star
            if (i < len - 1 && str.charAt(i + 1) == '*') continue;
            
            // Check if the previous character was a star
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            
            // Safe character, append to result
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("ab*cd -> " + removeStarAndNeighbors("ab*cd")); // Output: ad
    }
}

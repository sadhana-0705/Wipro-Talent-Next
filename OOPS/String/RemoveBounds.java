public class RemoveBounds {
    public static String trimEdges(String str) {
        // Handle edge cases where string is too short to remove both ends
        if (str == null || str.length() <= 2) {
            return "";
        }
        
        // Extract substring excluding index 0 and the final index
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("Suman -> " + trimEdges("Suman")); // Output: uma
    }
}

public class RemoveX {
    public static String removeXBorder(String str) {
        if (str == null || str.length() == 0) return str;
        
        int start = 0;
        int end = str.length();
        
        // Check if first character is 'x'
        if (str.charAt(0) == 'x') {
            start = 1;
        }
        
        // Check if last character is 'x'
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            end = str.length() - 1;
        }
        
        // Return substring if valid, otherwise empty string
        return (start < end) ? str.substring(start, end) : "";
    }

    public static void main(String[] args) {
        System.out.println("xHix    -> " + removeXBorder("xHix"));    // Output: Hi
        System.out.println("America -> " + removeXBorder("America")); // Output: America
    }
}

public class StringHalf {
    public static String getFirstHalf(String str) {
        if (str == null) return null;
        
        int len = str.length();
        
        // Check if length is even
        if (len % 2 == 0) {
            return str.substring(0, len / 2);
        }
        
        // Return null for odd lengths
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Tomcat -> " + getFirstHalf("Tomcat")); // Output: Tom
        System.out.println("Apron  -> " + getFirstHalf("Apron"));  // Output: null
    }
}

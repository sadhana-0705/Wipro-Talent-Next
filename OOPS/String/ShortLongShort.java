public class ShortLongShort {
    public static String comboString(String a, String b) {
        int lenA = (a == null) ? 0 : a.length();
        int lenB = (b == null) ? 0 : b.length();
        
        // Determine which string is shorter and combine accordingly
        if (lenA < lenB) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println("hi, hello -> " + comboString("hi", "hello")); 
        // Output: hihellohi
    }
}

public class CaseConverter {
    public static void main(String[] args) {
        char ch = 'a'; // Set your initial alphabet here

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}

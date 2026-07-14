import java.util.ArrayList;

public class OddLengthStringsLambda {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        
        // Add 10 different words
        a1.add("Java");        // length 4 (even)
        a1.add("Lambda");      // length 6 (even)
        a1.add("Stream");      // length 6 (even)
        a1.add("Collection");  // length 10 (even)
        a1.add("List");        // length 4 (even)
        a1.add("Set");         // length 3 (odd)
        a1.add("Map");         // length 3 (odd)
        a1.add("Code");        // length 4 (even)
        a1.add("Odd");         // length 3 (odd)
        a1.add("Program");     // length 7 (odd)

        System.out.println("Strings with an odd length:");
        // Lambda inside forEach to filter and print elements with odd lengths
        a1.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word + " (Length: " + word.length() + ")");
            }
        });
    }
}

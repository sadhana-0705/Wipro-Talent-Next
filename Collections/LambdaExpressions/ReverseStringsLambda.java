import java.util.ArrayList;

public class ReverseStringsLambda {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        
        // Add 10 different words
        a1.add("Java");
        a1.add("Lambda");
        a1.add("Stream");
        a1.add("Collection");
        a1.add("ArrayList");
        a1.add("Interface");
        a1.add("Method");
        a1.add("Object");
        a1.add("Class");
        a1.add("Program");

        System.out.println("Strings in reversed character order:");
        // Lambda operation to reverse and print each string
        a1.forEach(word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        });
    }
}

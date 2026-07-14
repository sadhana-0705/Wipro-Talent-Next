// 1. Define the functional interface
@FunctionalInterface
interface WordCount {
    int count(String str);
}

// 2. Class containing the execution logic
public class MyClassWithLambda {
    public static void main(String[] args) {
        // 3. Implement the count method using a Lambda expression
        WordCount wordCounter = str -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            // Split the string by one or more whitespace characters
            String[] words = str.trim().split("\\s+");
            return words.length;
        };

        // 4. Test string inputs and display results
        String testString1 = "Hello World from Java Lambda Expressions";
        String testString2 = "SingleWord";
        
        System.out.println("Test String 1: \"" + testString1 + "\"");
        System.out.println("Word Count: " + wordCounter.count(testString1));
        
        System.out.println("\nTest String 2: \"" + testString2 + "\"");
        System.out.println("Word Count: " + wordCounter.count(testString2));
    }
}

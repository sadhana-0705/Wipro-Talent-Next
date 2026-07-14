import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePalindrome {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("radar", "hello", "level", "java", "deified", "world", "racecar", "noon", "stream", "kayak");

        // Define a Predicate to check if a word is a palindrome
        Predicate<String> isPalindrome = word -> {
            String cleanWord = word.replaceAll("\\s+", "").toLowerCase();
            String reversed = new StringBuilder(cleanWord).reverse().toString();
            return cleanWord.equals(reversed);
        };

        System.out.println("Palindrome words found:");
        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println("- " + word);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerReverseWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));
        System.out.println("Before modification: " + words);

        // Define a Consumer to modify elements at an active list position index
        // Since a basic Consumer<String> cannot update the reference inside the list directly,
        // we can loop or use ListIterator, processing structural transformations.
        Consumer<List<String>> listReverser = targetList -> {
            for (int i = 0; i < targetList.size(); i++) {
                String reversed = new StringBuilder(targetList.get(i)).reverse().toString();
                targetList.set(i, reversed);
            }
        };

        // Apply consumer
        listReverser.accept(words);
        System.out.println("After reverse transformation: " + words);
    }
}

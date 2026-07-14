import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNumbers {
    public static void main(String[] args) {
        // Create an ArrayList with a mix of positive, negative, odd, and even integers
        List<Integer> numbers = Arrays.asList(-10, -5, -4, 0, 3, 8, -2, -7, -12);
        System.out.println("Original List: " + numbers);

        // Filter negative even numbers using Stream API operations
        List<Integer> negativeEvenNumbers = numbers.stream()
                .filter(num -> num < 0 && num % 2 == 0) // Keep numbers less than 0 and divisible by 2
                .collect(Collectors.toList());         // Collect them into a new ArrayList

        // Print the filtered ArrayList elements
        System.out.println("Filtered Negative Even Numbers: " + negativeEvenNumbers);
    }
}

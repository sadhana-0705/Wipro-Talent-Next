import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionSumElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        // Define a Function that takes a list of integers and computes their sum
        Function<List<Integer>, Integer> sumCalculator = list -> {
            int totalSum = 0;
            for (int num : list) {
                totalSum += num;
            }
            return totalSum;
        };

        // Execute the function
        int totalResult = sumCalculator.apply(numbers);

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Sum of all elements: " + totalResult);
    }
}

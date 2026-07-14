import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePerfectSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 5, 9, 12, 16, 23, 25, 40, 49, 50);

        // Define a Predicate to verify perfect square status
        Predicate<Integer> isPerfectSquare = num -> {
            if (num < 0) return false;
            int sqrt = (int) Math.sqrt(num);
            return (sqrt * sqrt) == num;
        };

        System.out.println("Perfect square numbers from the list:");
        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

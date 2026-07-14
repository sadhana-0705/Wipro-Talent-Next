import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerOddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        // Define Consumer block to handle displaying evaluation
        Consumer<Integer> oddEvenPrinter = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " even");
            } else {
                System.out.println(num + " odd");
            }
        };

        System.out.println("Number status printout:");
        numbers.forEach(oddEvenPrinter);
    }
}

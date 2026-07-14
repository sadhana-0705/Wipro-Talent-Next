// 1. Define a functional interface
@FunctionalInterface
interface DigitCountFunction {
    int count(int n);
}

// 2. Define a class containing the static method
class NumberUtility {
    public static int digitcount(int n) {
        // Handle negative numbers and zero specifically
        if (n == 0) return 1;
        return String.valueOf(Math.abs(n)).length();
    }
}

// 3. Main execution class
public class StaticMethodRefDemo {
    public static void main(String[] args) {
        // Bind the static method reference directly using the class name
        DigitCountFunction counterRef = NumberUtility::digitcount;

        // Invoke the functional interface method
        int input = 123456;
        int result = counterRef.count(input);

        System.out.println("Number of digits in " + input + " using static method reference: " + result);
    }
}

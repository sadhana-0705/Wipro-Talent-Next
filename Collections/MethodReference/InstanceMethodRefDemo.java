// 1. Define a functional interface
@FunctionalInterface
interface FactorialFunction {
    int compute(int n);
}

// 2. Define a class containing the instance method
class MathOperations {
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative.");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// 3. Main execution class
public class InstanceMethodRefDemo {
    public static void main(String[] args) {
        // Instantiate the object containing the instance method
        MathOperations mathObj = new MathOperations();

        // Bind the instance method reference to the functional interface
        FactorialFunction factRef = mathObj::factorial;

        // Invoke the functional interface method
        int input = 5;
        int result = factRef.compute(input);

        System.out.println("Factorial of " + input + " using instance method reference: " + result);
    }
}

// 1. Define a functional interface whose abstract method matches the constructor signature
@FunctionalInterface
interface PrimeCheckerFactory {
    PrimeChecker create(int number);
}

// 2. Define the class with the validation logic inside its parameterized constructor
class PrimeChecker {
    public PrimeChecker(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    // Helper method to determine if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 3. Main execution class
public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Bind the constructor reference using ClassName::new
        PrimeCheckerFactory factory = PrimeChecker::new;

        // Invoke the functional interface to instantiate the object and run the constructor check
        System.out.print("Testing 17: ");
        factory.create(17);

        System.out.print("Testing 20: ");
        factory.create(20);
    }
}

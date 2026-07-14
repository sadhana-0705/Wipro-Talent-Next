import java.util.ArrayList;
import java.util.Random;

public class PrimeFilterLambda {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Random random = new Random();

        // Populate with 25 random numbers between 1 and 100
        for (int i = 0; i < 25; i++) {
            a1.add(random.nextInt(100) + 1);
        }
        System.out.println("Original List: " + a1);

        System.out.println("\nPrime numbers in the list:");
        // Lambda inside forEach using a helper condition
        a1.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
        System.out.println();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

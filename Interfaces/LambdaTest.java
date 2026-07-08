// 1. Functional Interface definition
@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

// 2. Execution class implementing Lambda Expressions
public class LambdaTest {
    public static void main(String[] args) {
        // t1: Lambda expression to add three integer parameters
        Test t1 = (a, b, c) -> a + b + c;

        // t2: Lambda expression to multiply three integer parameters
        Test t2 = (a, b, c) -> a * b * c;

        // Test values
        int val1 = 5;
        int val2 = 4;
        int val3 = 3;

        // Calling myFunction using t1 reference and printing the result
        int additionResult = t1.myFunction(val1, val2, val3);
        System.out.println("Addition Result (" + val1 + " + " + val2 + " + " + val3 + "): " + additionResult);
        // Output: 12

        // Calling myFunction using t2 reference and printing the result
        int multiplicationResult = t2.myFunction(val1, val2, val3);
        System.out.println("Multiplication Result (" + val1 + " * " + val2 + " * " + val3 + "): " + multiplicationResult);
        // Output: 60
    }
}

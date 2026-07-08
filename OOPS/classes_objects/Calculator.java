public class Calculator {

    // 1. Static method to calculate num1 raised to the power of num2 (int version)
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // 2. Static method to calculate num1 raised to the power of num2 (double version)
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // 3. Main method to invoke and test the methods
    public static void main(String[] args) {
        // Test powerInt with inputs (2, 10) -> 2^10
        int intBase = 2;
        int intExponent = 10;
        double intResult = Calculator.powerInt(intBase, intExponent);
        System.out.println(intBase + " power " + intExponent + " is: " + intResult);

        // Test powerDouble with inputs (2.5, 3) -> 2.5^3
        double doubleBase = 2.5;
        int doubleExponent = 3;
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " power " + doubleExponent + " is: " + doubleResult);
    }
}

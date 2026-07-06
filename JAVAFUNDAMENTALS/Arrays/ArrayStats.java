public class ArrayStats {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        
        // Calculate sum
        for (int num : arr) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / arr.length;
        
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

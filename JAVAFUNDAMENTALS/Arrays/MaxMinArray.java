public class MaxMinArray {
    public static void main(String[] args) {
        // Initialize the integer array
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        // Assume first element is both max and min initially
        int max = arr[0];
        int min = arr[0];
        
        // Traverse the array to find true max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

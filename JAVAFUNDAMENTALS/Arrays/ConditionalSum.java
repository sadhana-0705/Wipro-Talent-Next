public class ConditionalSum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 7, 5}; // Expected sum: 1 + 5 = 6
        int sum = 0;
        boolean ignoreMode = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                ignoreMode = true;
            }
            
            if (!ignoreMode) {
                sum += arr[i];
            }
            
            if (arr[i] == 7 && ignoreMode) {
                ignoreMode = false; // Turn off ignore mode after meeting 7
            }
        }

        System.out.println("Sum: " + sum);
    }
}

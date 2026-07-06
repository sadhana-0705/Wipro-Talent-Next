import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89, 34};
        
        System.out.print("Unique elements: ");
        // Outer loop to pick elements one by one
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if the element was already seen before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not seen before, print it
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

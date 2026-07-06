import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 7, 23, 56};

        // Sort the array
        Arrays.sort(arr);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

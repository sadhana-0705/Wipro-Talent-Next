import java.util.Arrays;

public class ExtremaNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 89, 67, 23, 1, 56};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Smallest 2 are at the beginning, largest 2 are at the end
        System.out.println("Smallest 2 numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
    }
}

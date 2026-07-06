public class SearchArray {
    public static void main(String[] args) {
        // Initialize the array and search element
        int[] arr = {1, 4, 34, 56, 7};
        int searchElement = 56; // Change this to test different cases
        int index = -1;

        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break; // Stop searching once found
            }
        }

        // Print the index value
        System.out.println(index);
    }
}

public class AsciiToChar {
    public static void main(String[] args) {
        // Initialize an integer array with ASCII values
        int[] asciiArr = {65, 66, 67, 100, 101, 102};

        // Convert and print characters in a single row
        for (int val : asciiArr) {
            System.out.print((char) val + " ");
        }
        System.out.println();
    }
}

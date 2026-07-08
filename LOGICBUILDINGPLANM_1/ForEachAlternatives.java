public class ForEachAlternateEvens {
    public static void main(String[] args) {
        int[] numbers = new int[51];
        for (int i = 0; i < 51; i++) numbers[i] = i * 2; // Fill evens

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

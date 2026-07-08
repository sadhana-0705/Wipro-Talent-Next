public class ForEachBackwards {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i <= 100; i++) numbers[i] = 100 - i; // Fill backwards

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

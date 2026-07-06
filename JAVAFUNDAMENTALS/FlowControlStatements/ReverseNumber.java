public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println("O/P: " + reversed);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer.");
        }
    }
}

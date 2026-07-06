public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            int reversed = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
            if (num == reversed) {
                System.out.println(num + " is a palindrome");
            } else {
                System.out.println(num + " is not a palindrome");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer.");
        }
    }
}

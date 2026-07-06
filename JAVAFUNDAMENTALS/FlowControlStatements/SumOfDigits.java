public class SumOfDigits {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int originalNum = num;
            int sum = 0;

            num = Math.abs(num);

            while (num > 0) {
                sum += num % 10; 
                num /= 10;       
            }

            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}

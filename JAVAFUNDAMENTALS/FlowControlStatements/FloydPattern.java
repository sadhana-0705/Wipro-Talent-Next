public class FloydPattern {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of rows as a command-line argument.");
            return;
        }
        try {
            int rows = Integer.parseInt(args[0]);
            int i = 1;
            while (i <= rows) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                i++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer.");
        }
    }
}

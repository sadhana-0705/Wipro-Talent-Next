public class Sample {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Please enter the month in numbers");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };

            // Check for valid month range
            if (month >= 1 && month <= 12) {
                System.out.println(months[month - 1]);
            } else {
                System.out.println("Invalid month");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter the month in numbers");
        }
    }
}

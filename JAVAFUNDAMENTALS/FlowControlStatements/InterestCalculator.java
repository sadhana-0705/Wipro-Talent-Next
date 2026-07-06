public class InterestCalculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide gender and age as arguments.");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double interest = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 100) {
                interest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interest = 8.4;
            } else if (age >= 59 && age <= 100) {
                interest = 10.5;
            }
        }

        System.out.println(interest + "%");
    }
}

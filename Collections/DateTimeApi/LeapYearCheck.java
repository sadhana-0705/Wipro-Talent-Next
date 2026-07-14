import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        // 1. Get the current date and extract the current year
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        // 2. Check if it's a leap year using the built-in isLeapYear() method
        boolean isLeap = today.isLeapYear();

        System.out.println("Current Year: " + currentYear);
        if (isLeap) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is not a Leap Year.");
        }
    }
}

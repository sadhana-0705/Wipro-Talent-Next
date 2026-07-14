import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        // 1. Get the current date (today)
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // 2. Add 10 days to the current date
        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("Date after 10 days: " + afterTenDays);
    }
}

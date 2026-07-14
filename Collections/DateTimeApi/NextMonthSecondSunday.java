import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextMonthSecondSunday {
    public static void main(String[] args) {
        // 1. Get today's date and move to the first day of next month
        LocalDate nextMonthFirstDay = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        // 2. Find the first Sunday of next month
        LocalDate firstSunday = nextMonthFirstDay.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        // 3. Add 7 days to get the second Sunday
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("First day of next month: " + nextMonthFirstDay);
        System.out.println("Date of next month's second Sunday: " + secondSunday);
    }
}

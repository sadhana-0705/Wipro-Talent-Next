import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PastTimeCalc {
    public static void main(String[] args) {
        // 1. Get the current system time
        LocalTime currentTime = LocalTime.now();

        // 2. Subtract 5 hours and 30 minutes from the current time
        LocalTime pastTime = currentTime.minusHours(5).minusMinutes(30);

        // Formatter for clean output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time: " + currentTime.format(formatter));
        System.out.println("Time 5 hours and 30 minutes ago: " + pastTime.format(formatter));
    }
}

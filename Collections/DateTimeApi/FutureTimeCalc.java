import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FutureTimeCalc {
    public static void main(String[] args) {
        // 1. Get the current system time
        LocalTime currentTime = LocalTime.now();

        // 2. Add 25 minutes to the current time
        LocalTime timeAfter25Mins = currentTime.plusMinutes(25);

        // Formatter for clean, readable output (HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time: " + currentTime.format(formatter));
        System.out.println("Time after 25 minutes: " + timeAfter25Mins.format(formatter));
    }
}

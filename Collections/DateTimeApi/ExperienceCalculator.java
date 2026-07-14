import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {
    public static void main(String[] args) {
        // 1. Define a sample joining date (Change this to your actual joining date)
        LocalDate joiningDate = LocalDate.of(2022, 3, 15); 
        LocalDate currentDate = LocalDate.now();

        // 2. Calculate the difference between the two dates using Period
        Period experience = Period.between(joiningDate, currentDate);

        // 3. Display the breakdown of total experience
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("\nTotal Experience in Wipro:");
        System.out.println(experience.getYears() + " Years, " 
                           + experience.getMonths() + " Months, " 
                           + experience.getDays() + " Days");
    }
}

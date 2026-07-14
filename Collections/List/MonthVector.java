import java.util.Vector;

public class MonthVector {
    public static void main(String[] args) {
        // Create a Vector to store month names
        Vector<String> months = new Vector<>();

        // Add all 12 months
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print elements of the Vector
        System.out.println("Months of the Year (using Vector):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

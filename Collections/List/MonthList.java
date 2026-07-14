import java.util.ArrayList;

public class MonthList {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store month names (Strings)
        ArrayList<String> months = new ArrayList<>();

        // 2. Add all 12 months of the year to the collection
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

        // 3. Print the elements of the ArrayList
        System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

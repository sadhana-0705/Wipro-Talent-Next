import java.util.LinkedList;

public class MonthLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store month names
        LinkedList<String> months = new LinkedList<>();

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

        // Print elements of the LinkedList
        System.out.println("Months of the Year (using LinkedList):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

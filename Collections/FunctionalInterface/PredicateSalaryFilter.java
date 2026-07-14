import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class StaffEmployee {
    private int id;
    private String name;
    private double salary;

    public StaffEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class PredicateSalaryFilter {
    public static void main(String[] args) {
        List<StaffEmployee> list = new ArrayList<>();
        list.add(new StaffEmployee(1, "Alice", 12000));
        list.add(new StaffEmployee(2, "Bob", 8500));
        list.add(new StaffEmployee(3, "Charlie", 15000));
        list.add(new StaffEmployee(4, "David", 9200));
        list.add(new StaffEmployee(5, "Emma", 11000));

        // Define a Predicate to check if salary is less than 10000
        Predicate<StaffEmployee> lowSalaryCondition = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        for (StaffEmployee emp : list) {
            if (lowSalaryCondition.test(emp)) {
                System.out.println("- " + emp.getName() + " (Salary: " + emp.getSalary() + ")");
            }
        }
    }
}

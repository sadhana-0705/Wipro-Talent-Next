import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class FunctionExtractLocation {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "New York", 50000));
        employees.add(new Employee(2, "Sarah", "London", 60000));
        employees.add(new Employee(3, "David", "Tokyo", 55000));
        employees.add(new Employee(4, "Emma", "Paris", 65000));
        employees.add(new Employee(5, "Michael", "New York", 70000));

        // Define a Function that transforms an Employee object into its Location String
        Function<Employee, String> locationExtractor = Employee::getLocation;

        List<String> locations = new ArrayList<>();
        for (Employee emp : employees) {
            // Apply the function to each employee and store the result
            locations.add(locationExtractor.apply(emp));
        }

        System.out.println("Extracted Locations: " + locations);
    }
}

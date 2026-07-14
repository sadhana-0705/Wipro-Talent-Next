import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Define the Employee class
class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;

    // Parameterized constructor to initialize properties
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{ID=" + empNo + ", Name='" + name + "', Age=" + age + ", Location='" + location + "'}";
    }
}

public class StreamFilterEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add 5 Employee objects to the list
        employees.add(new Employee(101, "Alice", 28, "Pune"));
        employees.add(new Employee(102, "Bob", 32, "Mumbai"));
        employees.add(new Employee(103, "Charlie", 24, "Pune"));
        employees.add(new Employee(104, "Diana", 29, "Bangalore"));
        employees.add(new Employee(105, "Ethan", 35, "Pune"));

        // Filter employee objects where location equals "Pune"
        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> "Pune".equalsIgnoreCase(emp.getLocation()))
                .collect(Collectors.toList());

        // Print the details of the filtered employees
        System.out.println("Employees located in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}

import java.util.Optional;

// A simple dummy Employee class for context
class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    @Override
    public String toString() { return "Employee: " + name; }
}

// User-defined Exception class
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OptionalExceptionHandling {
    public static void checkEmployee(Employee emp) {
        // Wrap the object in an Optional container
        Optional<Employee> empOpt = Optional.ofNullable(emp);

        // Verify validity or throw the custom exception
        Employee validEmp = empOpt.orElseThrow(() -> 
            new InvalidEmployeeException("Error: Invalid Employee data provided (Object is null).")
        );

        // Code execution continues normally if valid
        System.out.println("Successfully verified: " + validEmp);
    }

    public static void main(String[] args) {
        // Test case 1: Valid Employee object
        System.out.println("--- Test 1 (Valid Object) ---");
        Employee emp1 = new Employee("John Doe");
        checkEmployee(emp1);

        // Test case 2: Null Employee object (will throw exception)
        System.out.println("\n--- Test 2 (Null Object) ---");
        try {
            checkEmployee(null);
        } catch (InvalidEmployeeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}

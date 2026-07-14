import java.util.ArrayList;

// a) Create an Employee class
class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor to initialize attributes
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Method to print employee details
    public void GetEmployeeDetails() {
        System.out.println("ID: " + empId + " | Name: " + empName + 
                           " | Email: " + email + " | Gender: " + gender + 
                           " | Salary: $" + salary);
    }
}

// b) Create the application class
public class EmployeeManagement {
    // Maintain the employee list
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // (i) Add employee object to the collection
    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }

    // (ii) Delete employee object from the collection with the given empId
    public boolean deleteEmployee(int empId) {
        for (Employee e : employeeList) {
            if (e.empId == empId) {
                return employeeList.remove(e);
            }
        }
        return false; // Employee not found
    }

    // (iii) Returns the payslip / details of the employee with given empId
    public String showPaySlip(int empId) {
        for (Employee e : employeeList) {
            if (e.empId == empId) {
                return "--- PAYSLIP FOR ID " + empId + " ---\n" +
                       "Name: " + e.empName + "\n" +
                       "Monthly Basic Salary: $" + e.salary;
            }
        }
        return "Employee with ID " + empId + " not found.";
    }

    // Provide implementation for all methods and test your program
    public static void main(String[] args) {
        EmployeeManagement app = new EmployeeManagement();

        // Creating employee objects
        Employee emp1 = new Employee(101, "Alice Smith", "alice@wipro.com", "Female", 5000.0f);
        Employee emp2 = new Employee(102, "Bob Jones", "bob@wipro.com", "Male", 6000.0f);

        // Testing addEmployee
        System.out.println("Adding Alice: " + app.addEmployee(emp1));
        System.out.println("Adding Bob: " + app.addEmployee(emp2));

        // Testing showPaySlip
        System.out.println("\n" + app.showPaySlip(101));

        // Testing deleteEmployee
        System.out.println("\nDeleting employee 101: " + app.deleteEmployee(101));
        
        // Verifying deletion
        System.out.println(app.showPaySlip(101));
    }
}

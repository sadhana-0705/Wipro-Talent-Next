import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Employee class to hold individual records
class Employee {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Using Generics to create a dynamic collection
        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Loop to gather all employee details
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Enter Employee " + i + " Details:");
            
            System.out.println("Enter the Firstname");
            String firstName = scanner.nextLine();
            
            System.out.println("Enter the Lastname");
            String lastName = scanner.nextLine();
            
            System.out.println("Enter the Mobile");
            String mobileNumber = scanner.nextLine();
            
            System.out.println("Enter the Email");
            String email = scanner.nextLine();
            
            System.out.println("Enter the Address");
            String address = scanner.nextLine();

            // Store details in the collection
            employeeList.add(new Employee(firstName, lastName, mobileNumber, email, address));
        }

        // Sort the collection by first name using a Comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
            }
        });

        // Print final header using the specified format specifier
        System.out.println("\nEmployee List:\n");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        // Print each sorted employee record
        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                emp.getFirstName(), emp.getLastName(), emp.getMobileNumber(), emp.getEmail(), emp.getAddress());
        }

        scanner.close();
    }
}

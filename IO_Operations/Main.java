import java.io.*;
import java.util.Date;

// 1. Create a class called Employee that implements Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overriding toString() to easily print properties
    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "DOB: " + dateOfBirth + "\n" +
               "Department: " + department + "\n" +
               "Designation: " + designation + "\n" +
               "Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        String filename = "data";
        
        // Creating an instance of Employee with sample data
        Employee empOriginal = new Employee("John Doe", new Date(), "IT", "Software Engineer", 75000.0);

        // 2. Serialization: Save the object to a file named "data"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(empOriginal);
            System.out.println("Object successfully serialized and saved to file '" + filename + "'.\n");
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // 3. Deserialization: Read the object from the file and print its properties
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Employee empDeserialized = (Employee) ois.readObject();
            System.out.println("Object successfully deserialized from file:");
            System.out.println(empDeserialized);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}

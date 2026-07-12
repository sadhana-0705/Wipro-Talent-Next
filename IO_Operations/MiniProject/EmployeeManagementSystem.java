import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1 Add an Employee");
            System.out.println("2 Display All");
            System.out.println("3 Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    // 3. Exiting the System requirement implemented here
                    System.out.println("Exiting the System");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID : ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Employee Name : ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Employee Age : ");
        int age = scanner.nextInt();
        
        System.out.print("Enter Employee Salary : ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(id, name, age, salary);
        File file = new File(FILE_NAME);
        boolean exists = file.exists();

        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = exists ? new AppendableObjectOutputStream(fos) : new ObjectOutputStream(fos)) {
            oos.writeObject(emp);
        } catch (IOException e) {
            System.out.println("Error saving employee: " + e.getMessage());
        }
    }

    private static void displayAllEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("----Report----");
            System.out.println("----End of Report----");
            return;
        }

        System.out.println("----Report----");
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Employee emp = (Employee) ois.readObject();
                    System.out.println(emp);
                } catch (EOFException e) {
                    break; 
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading employees: " + e.getMessage());
        }
        System.out.println("----End of Report----");
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); 
    }
}

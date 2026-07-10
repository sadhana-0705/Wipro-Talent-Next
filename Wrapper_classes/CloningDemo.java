// Employee class implementing Cloneable interface
class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Setters to allow changing properties later
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    // Overriding clone method from Object class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Display employee properties
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

// Main class to demonstrate and observe cloning behavior
public class CloningDemo {
    public static void main(String[] args) {
        try {
            // 1. Create original object
            Employee emp1 = new Employee(101, "Alice Smith", 75000.0);
            System.out.println("Original Object (Before): " + emp1);

            // 2. Create a clone of the object
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Cloned Object (Before):   " + emp2);
            System.out.println("--------------------------------------------------");

            // 3. Change properties of the original object
            emp1.setId(102);
            emp1.setName("Alice Jones");
            emp1.setSalary(82000.0);

            // 4. Print both objects to note observations
            System.out.println("Original Object (After):  " + emp1);
            System.out.println("Cloned Object (After):    " + emp2);
            
            System.out.println("\n[Observation]: Changing the properties of the original "
                    + "object did not alter the cloned object. This confirms that "
                    + "clone() created a distinct, separate copy in memory.");

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}

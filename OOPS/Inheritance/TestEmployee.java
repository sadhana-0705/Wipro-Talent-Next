public class TestEmployee {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee emp = new Employee("Alice Smith", 85000.50, 2022, "AB123456C");

        // Test and display the functionalities using getter methods
        System.out.println("=== Employee Profile ===");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Test setter methods
        System.out.println("\nUpdating salary fields...");
        emp.setAnnualSalary(92000.00);
        System.out.println("New Annual Salary: $" + emp.getAnnualSalary());
    }
}

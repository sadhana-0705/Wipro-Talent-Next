public class EmployeeDetails {
    public static void main(String[] args) {
      
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }

        String searchId = args[0];

       
        String[][] employees = {
            { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
            { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
            { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
            { "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000" },
            { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
            { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
            { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" }
        };

        boolean found = false;

        for (String[] emp : employees) {
            if (emp[0].equals(searchId)) {
                found = true;

                String empNo = emp[0];
                String empName = emp[1];
                String desigCode = emp[3];
                String department = emp[4];
                
                int basic = Integer.parseInt(emp[5]);
                int hra = Integer.parseInt(emp[6]);
                int it = Integer.parseInt(emp[7]);
                
                String designation = "";
                int da = 0;

                
                switch (desigCode.toLowerCase()) {
                    case "e":
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case "c":
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case "k":
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case "m":
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                        break;
                }

                int salary = basic + hra + da - it;

                
                System.out.printf("%-10s %-12s %-12s %-15s %-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                
                
                System.out.printf("%-10s %-12s %-12s %-15s %-10d\n", empNo, empName, department, designation, salary);
                break;
            }
        }

        
        if (!found) {
            System.out.println("There is no employee with empid : " + searchId);
        }
    }
}
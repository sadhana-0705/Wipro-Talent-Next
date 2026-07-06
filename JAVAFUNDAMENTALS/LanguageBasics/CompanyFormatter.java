import java.util.Scanner;

public class CompanyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Company Name: ");
        String company = scanner.nextLine();
        
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        
        System.out.println(company + " Technologies " + location);
        
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class StringListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            // Displaying the menu options exactly as shown in the screenshots
            System.out.println("1 Insert");
            System.out.println("2 Search");
            System.out.println("3 Delete");
            System.out.println("4 Display");
            System.out.println("5 Exit");
            System.out.println("Enter your choice");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to be inserted");
                    String itemToInsert = scanner.nextLine();
                    list.add(itemToInsert);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.println("Enter the item to search");
                    String itemToSearch = scanner.nextLine();
                    if (list.contains(itemToSearch)) {
                        System.out.println("Item found in the list");
                    } else {
                        System.out.println("Item not found in the list");
                    }
                    break;

                case 3:
                    System.out.println("Enter the item to delete");
                    String itemToDelete = scanner.nextLine();
                    if (list.remove(itemToDelete)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist");
                    }
                    break;

                case 4:
                    System.out.println("The items in the list are");
                    for (String item : list) {
                        System.out.println(item);
                    }
                    break;

                case 5:
                    // Exits directly without printing anything else
                    break;

                default:
                    // Fallback for incorrect numeric selections
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}

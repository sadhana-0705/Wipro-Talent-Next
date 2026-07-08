import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore store = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6): ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer newline element
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input string
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to Add: ");
                    String addName = scanner.nextLine();
                    store.addVideo(addName);
                    break;

                case 2:
                    System.out.print("Enter the name of the video you want to Check Out: ");
                    String checkoutName = scanner.nextLine();
                    store.doCheckout(checkoutName);
                    break;

                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String returnName = scanner.nextLine();
                    store.doReturn(returnName);
                    break;

                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = scanner.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    store.receiveRating(rateName, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting..!! Thanks for using the application.");
                    break;

                default:
                    System.out.println("Selection out of range. Try again.");
            }
        }
        scanner.close();
    }
}

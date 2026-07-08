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
                scanner.nextLine(); // Clear scanner buffer

                switch (choice) {
                    case 1:
                        System.out.print("Enter the name of the video to add: ");
                        String addName = scanner.nextLine();
                        store.addVideo(addName);
                        break;
                    case 2:
                        System.out.print("Enter the name of the video to check out: ");
                        String checkoutName = scanner.nextLine();
                        store.checkOut(checkoutName);
                        break;
                    case 3:
                        System.out.print("Enter the name of the video to return: ");
                        String returnName = scanner.nextLine();
                        store.returnVideo(returnName);
                        break;
                    case 4:
                        System.out.print("Enter the name of the video to rate: ");
                        String rateName = scanner.nextLine();
                        System.out.print("Enter the rating (1-5): ");
                        if (scanner.hasNextInt()) {
                            int rating = scanner.nextInt();
                            scanner.nextLine();
                            if (rating >= 1 && rating <= 5) {
                                store.receiveRating(rateName, rating);
                            } else {
                                System.out.println("Invalid rating values! Enter between 1 and 5.");
                            }
                        } else {
                            System.out.println("Invalid input!");
                            scanner.nextLine();
                        }
                        break;
                    case 5:
                        store.listInventory();
                        break;
                    case 6:
                        System.out.println("Exiting system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option selection! Please enter a choice between 1 and 6.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid token
            }
        }
        scanner.close();
    }
}

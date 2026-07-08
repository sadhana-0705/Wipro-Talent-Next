public class VideoStore {
    private Video[] store;
    private int videoCount;

    public VideoStore() {
        this.store = new Video[10]; // Capacity for 10 videos
        this.videoCount = 0;
    }

    public void addVideo(String title) {
        if (videoCount < store.length) {
            store[videoCount] = new Video(title);
            videoCount++;
            System.out.println("Video \"" + title + "\" added successfully.");
        } else {
            System.out.println("Store inventory is full!");
        }
    }

    public void checkOut(String title) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getTitle().equalsIgnoreCase(title)) {
                if (!store[i].isCheckedOut()) {
                    store[i].doCheckedOut();
                    System.out.println("Video \"" + title + "\" checked out successfully.");
                } else {
                    System.out.println("Video is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found in store.");
    }

    public void returnVideo(String title) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getTitle().equalsIgnoreCase(title)) {
                if (store[i].isCheckedOut()) {
                    store[i].doReturn();
                    System.out.println("Video \"" + title + "\" returned successfully.");
                } else {
                    System.out.println("Video was not checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found in store.");
    }

    public void receiveRating(String title, int rating) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getTitle().equalsIgnoreCase(title)) {
                store[i].receiveRating(rating);
                System.out.println("Rating added successfully.");
                return;
            }
        }
        System.out.println("Video not found in store.");
    }

    public void listInventory() {
        if (videoCount == 0) {
            System.out.println("No videos in store inventory.");
            return;
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s\n", "Video Title", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < videoCount; i++) {
            String status = store[i].isCheckedOut() ? "Checked Out" : "Available";
            System.out.printf("%-20s | %-15s | %-10.1f\n", store[i].getTitle(), status, store[i].getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}

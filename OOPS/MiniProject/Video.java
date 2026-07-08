public class Video {
    // Member variables
    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        this.videoName = name;
        this.checkout = false; // By default, video is available
        this.rating = 0;       // Initial rating is 0
    }

    // Member functions
    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

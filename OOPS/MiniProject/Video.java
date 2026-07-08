public class Video {
    private String title;
    private boolean checkedOut;
    private double averageRating;
    private int ratingCount;
    private double totalRating;

    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.averageRating = 0.0;
        this.ratingCount = 0;
        this.totalRating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public double getRating() {
        return averageRating;
    }

    public void doCheckedOut() {
        this.checkedOut = true;
    }

    public void doReturn() {
        this.checkedOut = false;
    }

    public void receiveRating(int rating) {
        this.totalRating += rating;
        this.ratingCount++;
        this.averageRating = this.totalRating / this.ratingCount;
    }
}

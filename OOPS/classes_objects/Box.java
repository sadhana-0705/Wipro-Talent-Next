public class Box {
    // Dimensions of the box
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume
    public double calculateVolume() {
        return width * height * depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Creating a Box object with width=5.0, height=3.5, depth=2.0
        Box myBox = new Box(5.0, 3.5, 2.0);

        // Testing the volume calculation method
        double volume = myBox.calculateVolume();

        // Displaying the result
        System.out.println("The volume of the box is: " + volume);
    }
}

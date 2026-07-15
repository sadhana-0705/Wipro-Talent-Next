import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class Box {
    private double length;
    private double width;
    private double height;
    private double volume;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        // Calculate volume: length * width * height
        this.volume = length * width * height;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getVolume() { return volume; }
}

public class UniqueBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TreeSet with a custom comparator to sort boxes by volume in ascending order.
        // If volumes are equal, it compares dimensions to prevent unique boxes from being rejected.
        Set<Box> boxSet = new TreeSet<>(new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                int volumeCompare = Double.compare(b1.getVolume(), b2.getVolume());
                if (volumeCompare != 0) {
                    return volumeCompare;
                }
                int lengthCompare = Double.compare(b1.getLength(), b2.getLength());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                int widthCompare = Double.compare(b1.getWidth(), b2.getWidth());
                if (widthCompare != 0) {
                    return widthCompare;
                }
                return Double.compare(b1.getHeight(), b2.getHeight());
            }
        });

        // The example shows up to Box 5 details being collected
        int totalBoxes = 5;

        for (int i = 1; i <= totalBoxes; i++) {
            System.out.println("Enter the Box " + i + " details");
            
            System.out.println("Enter Length");
            double length = scanner.nextDouble();
            
            System.out.println("Enter Width");
            double width = scanner.nextDouble();
            
            System.out.println("Enter Height");
            double height = scanner.nextDouble();

            boxSet.add(new Box(length, width, height));
        }

        // Print the final formatted unique box list
        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f\n",
                    box.getLength(), box.getWidth(), box.getHeight(), box.getVolume());
        }

        scanner.close();
    }
}

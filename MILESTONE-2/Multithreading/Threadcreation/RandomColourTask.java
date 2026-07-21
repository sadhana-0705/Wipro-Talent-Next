import java.util.Random;

public class RandomColourTask implements Runnable {

    private String[] colours = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            // Generate a random index between 0 and colours.length - 1
            int index = random.nextInt(colours.length);
            String chosenColour = colours[index];

            System.out.println(chosenColour);

            // Stop the display loop if "red" is selected
            if ("red".equalsIgnoreCase(chosenColour)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Create Runnable task and wrap it in a Thread
        RandomColourTask task = new RandomColourTask();
        Thread thread = new Thread(task);

        // Start execution
        thread.start();
    }
}
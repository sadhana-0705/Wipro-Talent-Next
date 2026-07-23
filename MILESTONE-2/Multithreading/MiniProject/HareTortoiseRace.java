class RaceThread extends Thread {
    private static volatile boolean raceOver = false;
    private String runner;

    public RaceThread(String runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        for (int meter = 1; meter <= 100 && !raceOver; meter++) {

            System.out.println(runner + " ran " + meter + " meters");

            // Hare sleeps after 60 meters
            if (runner.equals("Hare") && meter == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 ms...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }

            // Small delay to visualize race
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }

            // Check winner
            if (meter == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n" + runner + " WINS THE RACE!");
            }
        }
    }
}

public class HareTortoiseRace {
    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Part (b): Set higher priority to Hare
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Race Started...\n");

        hare.start();
        tortoise.start();
    }
}
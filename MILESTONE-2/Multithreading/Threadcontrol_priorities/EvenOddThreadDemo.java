public class EvenOddThreadDemo {

    public static void main(String[] args) {
        // Thread to print even numbers from 1 to 20
        Thread evenThread = new Thread(() -> {
            System.out.println("--- Even Numbers ---");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });

        // Thread to print odd numbers from 1 to 20
        Thread oddThread = new Thread(() -> {
            System.out.println("--- Odd Numbers ---");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        });

        // Start even thread first
        evenThread.start();

        try {
            // Wait for evenThread to finish execution before starting oddThread
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Start odd thread after even thread completes
        oddThread.start();
    }
}
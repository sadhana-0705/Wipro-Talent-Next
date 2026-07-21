public class ThreadPriorityDemo implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        
        System.out.println("Started: " + threadName + " [Priority: " + priority + "]");
        
        // Simulating work
        for (int i = 1; i <= 100; i++) {
            // Dummy computation
            Math.sin(i);
        }
        
        System.out.println("Completed: " + threadName);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPriorityDemo(), "MAX-Priority-Thread");
        Thread t2 = new Thread(new ThreadPriorityDemo(), "MIN-Priority-Thread");
        Thread t3 = new Thread(new ThreadPriorityDemo(), "NORM-Priority-Thread");

        // Set Thread Priorities
        t1.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        t2.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t3.setPriority(Thread.NORM_PRIORITY); // Priority 5

        // Start threads at the same time
        t1.start();
        t2.start();
        t3.start();
    }
}
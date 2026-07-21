public class ThreadNameDemo implements Runnable {

    @Override
    public void run() {
        // Display the current thread's name
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create Runnable instance
        ThreadNameDemo task = new ThreadNameDemo();

        // Create two threads and set their names
        Thread t1 = new Thread(task, "Scooby");
        Thread t2 = new Thread(task, "Shaggy");

        // Start the threads
        t1.start();
        t2.start();
    }
}
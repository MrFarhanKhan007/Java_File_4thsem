public class Experiment22 implements Runnable {
    public void run() {
        // Code to be executed in this thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        Experiment22 myRunnable = new Experiment22();

        // Create a new thread with the MyRunnable instance as the target
        Thread myThread = new Thread(myRunnable);

        // Start the thread
        myThread.start();
    }
}

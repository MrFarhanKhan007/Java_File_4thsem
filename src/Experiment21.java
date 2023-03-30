class MyThread2 extends Thread{
    public void run() {
        // Code to be executed in this thread
        System.out.println("Thread is running.");
    }
}
public class Experiment21 {
    public static void main(String[] args) {
        // Create an instance of the MyThread class
        MyThread2 t = new MyThread2();

        // Start the thread
        t.start();
    }
}

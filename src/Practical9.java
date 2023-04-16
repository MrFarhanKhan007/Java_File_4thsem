public class Practical9 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(new MyRunnable(resource));
        Thread thread2 = new Thread(new MyRunnable(resource));

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("Incremented count: " + count);
    }

    public void decrement() {
        synchronized(this) {
            count--;
            System.out.println("Decremented count: " + count);
        }
    }

    public static synchronized void reset() {
        System.out.println("Resetting count");
    }
}
class MyRunnable implements Runnable {
    private SharedResource resource;

    public MyRunnable(SharedResource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.increment();
        resource.decrement();
        SharedResource.reset();
    }
}

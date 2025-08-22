import java.util.concurrent.locks.*;

class Counter {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Acquiring lock
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
        } finally {
            lock.unlock(); // Releasing lock
        }
    }
}

class Worker extends Thread {
    private Counter resource;

    public Worker(Counter resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        Counter resource = new Counter();

        Thread t1 = new Worker(resource);
        Thread t2 = new Worker(resource);

        t1.start();
        t2.start();
    }
}


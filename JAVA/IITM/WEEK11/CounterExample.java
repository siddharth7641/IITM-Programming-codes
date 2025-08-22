class Counter {
    private int count = 0;

    // Method to increment count using a synchronized block
    public void increment() {
	count++; 
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }

    public int getCount() {
        return count;
    }
}

class Worker extends Thread {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100);  // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating multiple threads accessing the same Counter object
        Thread t1 = new Worker(counter);
        Thread t2 = new Worker(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}


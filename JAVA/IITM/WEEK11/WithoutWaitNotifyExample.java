class SharedResource {
    private int data;
    private boolean available = false; // Flag to check if data is ready

    // Producer method to produce data
    public synchronized void produce(int value) {
        if(!available){
		data = value;
        	available = true;
        	System.out.println("Produced: " + data);
       	}
    }

    // Consumer method to consume data
    public synchronized void consume() {
        if(available){
        	System.out.println("Consumed: " + data);
        	available = false;
        }
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(200); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(300); // Simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WithoutWaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
	consumer.start();
	producer.start();
	
    }
}


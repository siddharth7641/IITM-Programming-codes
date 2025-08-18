public class liveSess2 {
    public static void main(String[] args) {
        // Runnable r1 = new ping();
        // Runnable r2 = new pong()
        ping p1 = new ping();
        pong p2 = new pong();

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);

        th1.start();
        th2.start();

        Thread th3 = new Thread(
            () -> {
                System.out.println("Thread is running: "+Thread.currentThread().getName());
            }
        );
        th3.start();
        /*
        So, while Thread is not a functional interface, its constructor accepts an object of the functional interface Runnable. 
        The lambda expression is simply a modern, concise way to provide that Runnable object.
         */
    }
}

class ping implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.print(" PING ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class pong implements Runnable{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.print(" PONG ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}



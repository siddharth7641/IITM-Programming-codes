public class liveSess4 implements Runnable{
    static int counter =0;
    Object lock = new Object(); 
    public void run(){
        incrementLoop();
    }
    // public synchronized void incrementLoop(){ //to make function sychronized
    public void incrementLoop(){
        synchronized(lock){ // too makek block of code syncronized or synchronized(this)
            for(int i=0;i<10000;i++){
                //will not be synchronized for th1 & th2 if we dont use sychronized keyword 
                counter++; //critical section
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        liveSess4 task = new liveSess4();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected output: 20000");
        System.out.println("Expected output: "+counter);

    }
}



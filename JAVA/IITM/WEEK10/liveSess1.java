class ping extends Thread{
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

class pong extends Thread{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.print(" PONG ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

public class liveSess1 {

    public static void main(String[] args) {
        // Thread th1 =new ping();
        // Thread th2 = new pong();
        // th1.start();
        // th2.start();

        ping ot1 =new ping();
        pong ot2 = new pong();
        ot1.start();
        ot2.start();
    }
}
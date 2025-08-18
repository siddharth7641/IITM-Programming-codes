public class liveSess3 {
    public static void main(String[] args) throws InterruptedException{
        Thread h1 = new print(100);
        Thread h2 = new print(200);
        h1.start();
        h2.start();
        h1.join(); // wait for complition of h1 then resume main thread execution
        h2.join(); // wait for complition of h2 then resume main thread execution
        for(int i=300;i<=310;i++){
            System.out.print(" "+i+" ");
            Thread.sleep(200);
        }

    }
}

class print extends Thread{
    private int start;
    public print (int i){
        start = i;
    }
    public void run(){
        try {
            for(int i=start;i<=start+10;i++){
                System.out.print(" "+i+" ");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void pascal(){
        System.out.println("Hello world");
    }

}

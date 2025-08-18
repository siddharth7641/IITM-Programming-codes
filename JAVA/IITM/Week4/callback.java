public class callback {
    public static void main(String[] args) {
        A objA = new A();
        objA.start();
    }
}

interface Doable {
    void finish();
    
}

class A implements Doable {
    public void start(){
        B objb = new B(this);
        objb.task();
    } 
    public void finish(){
        System.out.println("task is completed");
    }
}

class B {
    Doable obja;
    public B(Doable obj) {
        obja = obj;
    }

    public void task(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        obja.finish();
    }
}
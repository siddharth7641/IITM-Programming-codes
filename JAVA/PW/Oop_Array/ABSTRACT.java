abstract class structure {

    abstract public void sleep();
    public void awake(){
        System.out.println("Awake for 8 hours.");
    };
}

class animals  extends structure {
    public void sleep(){
        System.out.println("Animals sleep lesser.");
    }

    public void awake(){
        System.out.println("Stay awake for long.");
    }
    
}
public class ABSTRACT {
    public static void main(String[] args) {
        animals al = new animals();
        al.sleep();
        al.awake();
    }
}

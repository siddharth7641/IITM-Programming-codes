abstract class structure {

    abstract public void sleep();
    abstract public void awake();
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

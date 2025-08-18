interface A{
    int age = 18;
    void show(); 

    default void sleep(){
        System.out.println("in sleep");

    }

    static void awake(){
        System.out.println("I'm awake.");
    }
}

interface X{
    void disp();
}

class B implements A,X{
    
    public void show(){
        System.out.println("in show");
    }  

    public void disp(){
        System.out.println("in disp");
    }
}

public interface INTERFACE {

    public static void main(String[] args) {
        
        B objB = new B();
        objB.show();
        objB.disp();

    }
}
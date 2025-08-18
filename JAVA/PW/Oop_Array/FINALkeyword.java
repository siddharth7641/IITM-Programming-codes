
// FINAL class can't be inherited
final class human{
    public void sleep(){
        System.out.println("human sleep");
    }
}

class animals{

// FINAL variable becomes immutable
    final int age=19;

// FINAL method can not be modified or overrided in subclass
    final public void sleep(){
        System.out.println(
            "animals sleeps.");
    }
}


public class FINALkeyword {
    public static void main(String[] args) {
        
        
    }
}

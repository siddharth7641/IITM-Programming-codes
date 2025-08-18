// TYPES
// SINGLE LEVEL
// MULTI LEVEL
// HIRARCHICAL

class human {

    private String name ;
    int age ;

    // constructor
    // constructor also doesnot participate in inheritance, but can get executed
    // because when we call constructor of child class and it has in-build super() method 
    // which call the constructor of parent class if it staisfy the parameters
    human() 
    {
        System.out.println("human constfructor");
    }

    public void sleep(){
        System.out.println("Human need a good sleep.");
    }
    
}

// student class all methods of human class using extend keyword
class student extends human{

    void disp(){
        age=18; // age variable is inherited from parent class
        System.out.println("Age: " +age );
        // System.out.println("Name: " +name ); // private members doesnot participate in inheritance

    }
}

public class inheritance {
    public static void main (String[] args){

        // as student inherits all the methods of human class 
        // that why we can call any method of human class using student class obj. 
        student stu  = new student();
        stu.sleep();
        stu.disp();
        
    }
}
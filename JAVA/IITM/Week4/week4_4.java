/*
 * ABOUT INTERFACE AND IMPLEMENTATION
 */

public class week4_4 {
    public static void main(String[] args) {
        bill b = new bill();
        // b.pay();
        b.show();
        // b.display();
    }
}

abstract class displayable{
    // public abstract void show();
    public void show(){
        System.out.println("Show");
    }
}

class  bill extends displayable implements Payable{
    
    
} 



interface Payable {
    // void pay();
    default void show(){
        System.out.println("Show payable amount");
    }
}

// interface Displyable{
//     // default void display(){
//     //     System.out.println("Display the element");
//     // }
//     void display();
// }

// class bill implements Payable, Displyable{
//     public void pay(){
//         System.out.println("BILL:");
//     }
//     public void display(){
//         System.out.println("Display the entities");
//     }  
// }


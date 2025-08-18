public class class_and_obj {
    int a; // INSTANCE VARIABLE:- STORED IN HEAP
    String name;
    public static void main(String[] args) {
        // declare the variable
        // create the object

        int num = 9;  // LOCAL VARIABLE:- STORED IN STACK OF THE METHOD

        // CAN CREATE NUMEROUS OBJECTS AND CAN CONTAIN DIFFERENT VALUES OF INSTANCE VARIABLE
        class_and_obj obj1 =new class_and_obj(); // REFRENCE VARIABLE
        class_and_obj obj2 =new class_and_obj();
        obj2.name = "siddharth";
        obj1.a = 10; // ACCESS OR CHANGE INSTANCE VARIABLE
        
        System.out.println(obj1.name); // initially null
        System.out.println(obj2.name); // lateron we clanged it with this
        System.out.println(obj1.a);
        System.out.println(obj2.a);

    }
    
}

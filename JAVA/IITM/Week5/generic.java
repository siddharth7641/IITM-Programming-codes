/*
 * GENERIC NOTES AND CODES, FROM WHERE U LEARNT
 * https://engineeringdigest.medium.com/generics-b158a743d18f 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
NEED FOR GENERIC, because of
    No Type safety
    Manual casting
    No Compile Time checking
A GENERIC TYPE is a class or interface that is parameterized over types. 
    For example, a generic class can work with any type specified by the user, and that type can be enforced at compile time.

WILDCARS --> wildcards when dealing with generic interfaces to allow for more flexibility with the types used at runtime. 
    Wildcards allow an implementation to be more permissive about the types of parameters it accepts.
*/

/* 
GENERIC TYPE EXTENDS :-->
    In generic type, while extending or implementing we use only extend keyword.
    like, class className<T extends parentClass & interface> 
    while doing this extended class name comes first then inteface name
*/

/*
TYPE ERASURE :-->
Type Erasure is a process by which the Java compiler removes generic type information after compilation.
FOR example type erasure of class box will be, 
        class Box {
    private Number value;
    public Number getValue() {
        return value;
    }
    public void setValue(Number value) {
        this.value = value;
    }
}

*/

public class generic {
    public static void main(String[] args) {
// INTRODUCTION to TYPE SAFETY
        /*
        ArrayList <String> list = new ArrayList <>();
        list.add("hello");
        list.add("10");
        list.add("11.1");
        String s1 = list.get(0);
        String s2 = list.get(1);
        */
// BOUNDED TYPE PARAMETER 
        /* 
        box <Integer> b = new box<>();
        b.setValue(1);
        int value=b.getValue();
        System.out.println(value);
        */
// MULTIPLE GENRIC PARAMETER
        /* 
        pair<String,Integer> stu =new pair<>("age", 19); 
        System.out.println(stu.getKey());
        System.out.println(stu.getValue());
        */
// ENUM CLASS OPERATIONS USING GENERIC 
        /* 
        System.out.println(Operation.ADD.apply(10.,20 ));
        System.out.println(Operation.SUBTRACT.apply(10.,20 ));
        System.out.println(Operation.MULTIPLY.apply(10.,20 ));
        System.out.println(Operation.DIVIDE.apply(10.,20 ));
        */

        

    }
// UPPER ANND LOWER BOUND with WILDCARD 
    /* 
    // UPPER BOUND --> number could be anything that extends Number 
    public static double sum(List<? extends Number> numbers){
        double sum =0;
        for (Number o : numbers) {
            sum+= o.doubleValue();
        }
        return sum;
    }
    // LOWER BOUND -->  list must be something that is in super class of integer 
    public static void printNumbers(List <? super Integer> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    */
}



// GENERIC INTERFACE AND IMPLEMENTATION
/*
interface container<T>{
    void add(T items);
    T get();
}
class genericContainer<T> implements container<T>{
    private T item;
    public void add(T item){
        this.item = item;
    }
    public T get(){
        return item;
    }
}
*/

/* 
enum Operation{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T val1, T val2){
        switch (this) {
            case ADD:
                return val1.doubleValue() +val2.doubleValue();
            case SUBTRACT:
                return val1.doubleValue() -val2.doubleValue();
            case MULTIPLY:
                return val1.doubleValue() *val2.doubleValue();
            case DIVIDE:
                return val1.doubleValue() /val2.doubleValue();
            default:
                throw new AssertionError("Unknown Opperation :" + this);
        }
    }
}
*/

/*
class box2{
// GENERIC CONSTRUCTORS EVEN IF YOUR CLASSS IS NOT GENERIC
    public <T extends Number> box2 (T value){

    }
// GENERIC METHODS __ SYNTAX --> public <T> return_type method_name (){}
    public <T> void display(T value){
        System.out.println("The input is : " value);
    }
    // Specific Normal INTEGER type overloading
    public void display(Integer value){
        System.out.println("The integer input is : " value")
    }
}
*/

// BOUNDED PARAMETER
class box<T extends Number>{
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

class pair<K,V>{
    private K key;
    private V value;
    public pair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
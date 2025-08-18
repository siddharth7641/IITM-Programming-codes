import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class highOrderFunction {

    // Method that takes a Calculator (functional interface) and two numbers
    public static int compute(int a, int b, Calculator op) {
        return op.operation(a, b);
    }

    public static void show(int r , displayable d){
        d.print(r);
    }
    public static void main(String[] args) {
// Type inference: compiler infers type from right-hand side
        // var x = "siddharth";   // String
        // var age = 25;          // int
        // var xage = x + 25;     // String + int → String (concatenation)
        // System.out.println("x: " + x);
        // System.out.println("age: " + age);
        // System.out.println("xage: " + xage);

// HIGH ORDER FUNCTION
        sarkar s =new sarkar();
        s.workForMe(()->{
            System.out.println("HELLO, from lambda in main.");
            System.out.println("**********************************************");
        });
        System.out.println("**********************************************");

        Danceable danceable = ()-> {
            System.out.println("I love dancing.");
        };
        s.testing(danceable);
        System.out.println("**********************************************");
        
        // Lambda for addition
        Calculator add =(x, y) -> x + y;
        // Directly pass lanbda without naning it
        int result1 = compute (18, 5, add);
        int result2= compute(16, 5, (x, y)-> x*y); // subtraction 
        // int result3= compute (18, 5, (x, y) -> x-y); // multiplication
        show(result1 , (r) -> System.out.println(r));
        System.out.println("**********************************************");
        show(result2 , (r) -> System.out.println(r));
        System.out.println("**********************************************");
        // System.out.println("Addition:"+ result1); //15 
        // System.out.println("Subtraction:" + result2); //5
        // System.out.println("Multiplication: + result3"); // 50


        List<student> people = Arrays.asList(
            new  student("Alice",20),
            new student("Bob", 15),
            new student("Prince",19)
        );
        // compareByRoll cr = new compareByRoll();
        // rather than implementing comparator and creeating a object and passing it in collection.sort we can just pass the implementation
        Collections.sort(people, (a,b)-> a.getRollNo()-b.getRollNo()); // sorting in basis of rollNo
        System.out.println(people);
        System.out.println("**********************************************");
        Collections.sort(people, (a,b)-> b.getName().length()-a.getName().length()); // sorting on basis of length of name
        System.out.println(people);
        

    }
}

class student{
    private String name ;
    private int rollNo;
    public student(String n,int r){
        name=n;
        rollNo =r;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return rollNo+" : "+name;
    }
}

// class compareByRoll implements Comparator<student>{
//     public int compare(student a, student b){
//         return a.getRollNo()-b.getRollNo();
//         // if (a.getRollNo()==b.getRollNo()){
//         //     return 0;}
//         // else if (a.getRollNo()>b.getRollNo() ){
//         //     return 1;
//         // }
//         // else{
//         //     return -1;}
//     }
// }

@FunctionalInterface
interface displayable{
    public void print(int r);
}

interface Calculator {
        int operation(int a, int b);
}
   
class sarkar {
    public void workForMe(Runnable run){
        run.run();
        System.out.println("Yes boss, I'm working for u");
}

    public void testing (Danceable danceable){
        danceable.dance();
    }
}

@FunctionalInterface
interface Danceable{
    public void dance();
}
// public class HELLO{
//     static int ADD(int n,int s){
//         return n+s ;
//     }
//     public static void main(String[] arg){
//         System.out.println("Hello World");
//         int num1 =5;
//         int num2 =6;
//         int result = HELLO.ADD(num1,num2);
//         System.out.println("RESULT:" + result);
//     }
// }


import java.util.Scanner;
public class HELLO{
    public static void main(String[]args){
        
    // TYPE CASTING 
        int num1 =5;
        double num2 ;
        num2 = num1;
        System.out.println(num2);
    
    // SCANNER CLASS
        // create object for scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age"); 
        int Age = scan.nextInt();

        System.out.println("Enter the Name"); 
        String Name = scan.next();

        System.out.println(Name+"\'s"+ " age is" + Age);



    }
}
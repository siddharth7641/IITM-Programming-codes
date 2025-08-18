import java.io.*;
public class L1 {

    public static double findSquareRoot(double num){
        assert num >=0: "Number must be non negative";
        return Math.sqrt(num);
    }

    public static int factorial(int n){
        assert n>0: "Factorial is undefined in negativee number: n = "+ n;

        int result  =1;
        for(int i =2;i<=n; i++){
            result*= i;

            assert result>0 :"Overflow detected at i = "+i;
        }
        return result;
    }

    public static void findfile()throws IOException{
        File file = new File("test.txt");
        FileInputStream stream = new FileInputStream(file);
        // may throw exception 
        int a  = 10/0;
    }

    public static void checkAge(int age){
        if (age<18){
          throw new IllegalArgumentException("You must be atleast 18.");
        } 
        System.out.println("You are old enough");
    }
    public static void main(String[] args) {
              
        // try {
        //   int n = 10/0;
        // } catch(IndexOutOfBoundsException e) {
        //   System.out.println(e.getMessage());
        // }catch(ArithmeticException e) {
        //   System.out.println(e.getMessage());
        // }finally{
        //   System.out.println("Finally block");
        // }
        // System.out.println("Hello World !");
        
        // try{
        //   FileReader fr = new FileReader("file.txt");
        // }catch(FileNotFoundException e){
        //   System.out.println("checked exception caught:"+e.getMessage());
        // }
        
        // try {
        //   int n = 10/0;
        // } catch(IndexOutOfBoundsException e) {
        //   System.out.println("checked exception caught:"+e.getMessage());
        // }
        
        // String[] arr =new int[2];
        // try {
        //   System.out.println(arr[5]);
        // } catch(Exception e) {
        //   System.out.println("Arrayy index is out of bound");
        // }
        
        
        try {
          checkAge(14);
        } catch(Exception e) {
          System.out.println(e.getMessage());
        }

        try {
            findfile();
        }catch (IOException e) {
            System.out.println("File not found or cannot be opened.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(factorial(5));
        System.out.println(factorial(20));


        double result = findSquareRoot(-5);
        System.out.println("Square root : "+result);




    }
}

class myException extends Exception{
    public myException (String message){
        super(message);
    }
}
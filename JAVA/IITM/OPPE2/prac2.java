
import java.util.Scanner;

// DEFINE a user-defined exception: InvalidAgeException
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}


public class prac2 {

    // DEFINE method isEligibletoVote
    public static boolean isEligibletoVote(int age) throws InvalidAgeException{
        if (age>=18){
            return true;
        }
        throw new InvalidAgeException("Invalid age to vote");
        
    }
    // DEFINE method isEligibletoWriteUPSC
    public static boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException{
        if(age>32){
            throw new InvalidAgeException("Invalid age to write UPSC");
        }
        return true;
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            isEligibletoVote(age);
            isEligibletoWriteUPSC(age);
            System.out.println("Eligible to vote and to write UPSC");
        } catch (InvalidAgeException ie) {
            System.out.println(ie.getMessage());
        }
        sc.close();
    }
}
import java.util.Scanner;
import java.util.*;

//Define class SpeedLimitException
class SpeedLimitException extends Exception{
    public SpeedLimitException(String message){
        super(message);
    }
}

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(sc.nextLine());
        try {
            myCar.accelerate(sc.nextDouble());
            myCar.accelerate(sc.nextDouble());
        } catch (SpeedLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCar);
        sc.close();
    }
}

class Car {
    private String model;
    private double speed;
    public Car(String model) {
        this.model= model;
        this.speed= 0.0;
    }

    public void accelerate(double increment) throws SpeedLimitException {
        if (speed+increment >120)
            throw new SpeedLimitException("slow down");
        speed += increment;
    }

    public String toString() {
        return "Car Model: + model Speed:"+ speed+ "km/h";
    }
 }

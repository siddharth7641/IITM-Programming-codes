/*
Problem Statement
You are given two integers as input to form an object (r1) of type Rectangle and two double
values as input to form an object r2 of type Rectangle. Complete the Java code to print
the larger area among the areas of r1 and r2.
• Define a generic class Rectangle with the following members.
– Instance variables length and breadth
– Constructor to initialize the instance variables
– Method area( ) that returns the area of a rectangle object
– Method compareArea( ) that returns the larger area among that of r1 and r2.
• Class Test has method main( ), and takes two integers and two double values as input
to create two objects of Rectangle type. It then invokes the necessary methods and
prints large area.
What you have to do
• Define method area() and compareArea() of class Rectangle.
*/
import java.util.*;
class Rectangle<T extends Number>{
    private T length;
    private T breadth;
    public Rectangle(T len, T bre){
    length = len;
    breadth = bre;
    }
//Define method public double area() here
    public double area(){
        return length.doubleValue()*breadth.doubleValue();
    }
//Define method compareArea() here
    public double compareArea(Rectangle<?> r){//
        double r1 = this.area();
        double r2 = r.area();
        if (r1>r2) {
            return r1;
        }
        return r2;
    }
}
public class oppe7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rectangle<Integer> r1 = new Rectangle<>(sc.nextInt(), sc.nextInt());
    Rectangle<Double> r2 = new Rectangle<>(sc.nextDouble(), sc.nextDouble());
    double large_area = r1.compareArea(r2);
    System.out.println(large_area);
    }
}
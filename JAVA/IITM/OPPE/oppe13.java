/*
 * Doctor and Surgeon - Inheritance
A hospital management system maintains records of doctors and their specializations. The base class Doctor has attributes for the doctor’s name and department. 
The subclass Surgeon inherits from Doctor and has an additional attribute for the number of surgeries performed.

Write a Java program that creates a Surgeon object and displays the surgeon’s name, department, and number of surgeries performed.

Class Doctor has the following members:
Private instance variables String name and String department
Constructor to initialize the instance variables
Method toString() that returns a formatted string with doctor name and departement.
Class Surgeon should:
Inherit from Doctor
Have a private instance variable int surgeries
Constructor to initialize the instance variables
Override toString() such that it uses the parent class’s toString() method and appends surgeries information to the returned string as given in the test cases.
Class HospitalSystem should:
Create an object of Surgeon using input values for name, department, and surgeries
Print the object
What you have to do
Define the constructor in class Doctor
Define the toString() method in class Doctor
Define the constructor in class Surgeon
Define the toString() method in class Surgeon
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api
Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

Template Code(Click to Expand)

 */

import java.util.ArrayList;
import java.util.Iterator;

public class oppe13 {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();   
        arr.add("Hello");
        arr.add("siddhart");
        arr.add("how");
        arr.add("r u?");

        System.out.println(arr);
        arr.add(1, "FRIEND");
        System.out.println(arr);

        arr.set(0, "Lakshay");
        System.out.println(arr);

        ArrayList<String> list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add("good");
        
        arr.addAll(list);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

        System.out.println(arr.contains("how"));

        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }






    }
    
}



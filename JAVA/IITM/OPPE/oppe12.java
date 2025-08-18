/*
Write a program that takes input to create an array of Staff objects and prints the remuneration of each staff for their duties. Faculty should be assigned to Invigilation duty, and Hod should be assigned to Squad duty.

Abstract class Staff has the following members:

String name, String duty and int num as private instance variables, where duty is the type of duty which may be either Invigilation or Squad, and num is the number of hours of duty
constructor to initialize the instance variables
required accessor methods
method toString() to return the name of the staff
abstract method abstract String remuneration()
Class Faculty is a child class of Staff and has the following members:

constructor to initialize the instance variables
method remuneration() returns the remuneration as num * 150, if the duty is Invigilation, otherwise returns the string Wrong duty assigned
Class Hod is a child class of Staff and has the following members:

constructor to initialize the instance variables
method remuneration() returns the remuneration as num * 500, if the duty is Squad, otherwise returns the string Wrong duty assigned
Class ExamBranch has the following members:

method printStaffRemunerations that prints the name and remuneration of the staff if they are assigned valid duty, otherwise prints the name and the corresponding error message for each staff
main method accepts the name, duty and number of hours of two Faculty members followed by that of two Hods, and invokes method printStaffRemunerations
What you have to do
Define method printStaffRemunerations in class ExamBranch
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times. 
Write a program that takes input to create an array of Staff objects and prints the remuneration of each staff for their duties. Faculty should be assigned to Invigilation duty, and Hod should be assigned to Squad duty.
*/

import java.util.*;

abstract class Staff {
    private String name;
    private String duty;
    private int num;

    public Staff(String name, String duty, int num) {
        this.name = name;
        this.duty = duty;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getDuty() {
        return duty;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return name;
    }

    public abstract String remuneration();
}

class Faculty extends Staff {
    public Faculty(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equalsIgnoreCase("Invigilation")) {
            return String.valueOf(getNum() * 150);
        } else {
            return "Wrong duty assigned";
        }
    }
}

class Hod extends Staff {
    public Hod(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equalsIgnoreCase("Squad")) {
            return String.valueOf(getNum() * 500);
        } else {
            return "Wrong duty assigned";
        }
    }
}

class oppe12 {

    // Define method printStaffRemunerations in class ExamBranch
    public static void printStaffRemunerations(Staff[] staffList) {
        for (Staff s : staffList) {
            System.out.println(s + " " + s.remuneration());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] staffArr = new Staff[4];

        for (int i = 0; i < 2; i++) {
            String name = sc.next();
            String duty = sc.next();
            int num = sc.nextInt();
            staffArr[i] = new Faculty(name, duty, num);
        }

        for (int i = 2; i < 4; i++) {
            String name = sc.next();
            String duty = sc.next();
            int num = sc.nextInt();
            staffArr[i] = new Hod(name, duty, num);
        }

        printStaffRemunerations(staffArr);
    }
}

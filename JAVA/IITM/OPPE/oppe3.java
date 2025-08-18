/*
• Define class Employee that has the following members.
– String name, double salary as private instance variables
– Constructor to initialize the instance variables
– Overload constructor public Employee(Employee e), such that it initialize
variables name and salary using parameter e
– Override method toString() that returns the name and salary of the Employee
as a single concatenated string

• Define class CopyCon that has the main method.
– Create an object e1 of Employee.
– Create one more object e2 of Employee by passing e1 as parameter to the
overloaded constructor
– Display e1 and e2
*/

public class oppe3 {
    public static void main(String[] args) {
        employee e1 = new employee("siddharth", 20);
        employee e2 = new employee(e1);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
    }
}

class employee {
    private String name;
    private double salary;
    public employee(String name, double salary){
        this.name =name;
        this.salary =salary;
    }
    public employee(employee e){
        this.name =e.name;
        this.salary =e.salary;
    }
    public String toString(){
        return name+" :"+salary;
    }
}


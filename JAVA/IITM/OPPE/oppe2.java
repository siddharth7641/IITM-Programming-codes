/*
• Define class Employee that has the following members.
– String name, double salary as private instance variables
– Constructor to initialize the instance variables
– Define method print() to display name and salary of an Employee
– Overload method print() as print(float percent) to display the name,
salary and bonus of an Employee
– Method public double bonus(float percent) that returns the bonus com-
puted as (percent/100.0)*salary

• Define class Manager that extends class Employee and has the following members.
– String secretary as private instance variable
– Define a constructor to initialize the instance variables of Manager that in-
cludes the instance variables of Employee
– Override method print() to display the name, salary and secretary of
Manager.
– Override method print(float percent) to display the name, salary, secretary
and bonus of a Manager
– Override public double bonus(float percent) that returns the bonus of a
  Manager as 50 percent extra bonus than a regular employee

• Define class InheritanceTest that has the main method.
– Here, take two reference variables obj1 and obj2 of an Employee.
– Initialize obj1 with Employee class object.
– Initialize obj2 with Manager class object.
– call print() and print(float percent) methods using both obj1 and obj2.
*/

public class oppe2 {
    public static void main(String[] args) {
        employee e= new employee("Siddharth", 5000);
        manager m = new manager("Lakkshay", 100,"ritik");
        e.print();
        System.out.println("=============================================================");
        e.print(10);
        System.out.println("=============================================================");
        m.print();
        System.out.println("=============================================================");
        m.print(20);
        System.out.println("=============================================================");

    }
}

class employee {
    private String name;
    private double salary;
    public employee(String name, double salary){
        this.name =name;
        this.salary =salary;
    }
    public double bonus(float percent){
        return (percent/100.0)*salary;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public void print(float percent) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus(percent));
    }
}

class manager extends employee{
    private String secretary;
    public manager (String name, double salary, String secretary){
        super(name, salary);
        this.secretary = secretary;
    }
    public void print() {
        super.print();
        System.out.println("Secretary: "+ secretary);
    }
    public void print(float percent) {
        super.print();
        System.out.println("Secretary: "+ secretary);
        System.out.println("Bonus: " + bonus(percent));
    }
    public double bonus(float percent){
        return super.bonus(percent)*1.5;
    }
}
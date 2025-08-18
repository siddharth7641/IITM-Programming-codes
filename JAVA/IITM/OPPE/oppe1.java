/*
 **Write Java code as instructed. [Basic class and method]
• Define class Employee that has the following members:
– Private instance variables String empName, double salary
– Mutator methods to update the instance variables
– Accessor methods to access the instance variables
– Method public double bonus(float percent) that returns the bonus com-
puted as (percent/100.0)*salary

• Define class Manager that extends class Employee and has the following members.
– String secretary as private instance variable
– Mutator method to update the instance variable
– Accessor method to access the instance variable
– Override public double bonus(float percent) that returns the bonus of a
  Manager as 50 percent extra bonus than a regular employee

• Define class InheritanceTest that has the main method.
– Create object obj1 of Manager using an Employee class reference variable
– Mutator methods to set the values of name and salary
– Create object obj2 of Manager using an Manager class reference variable
– Mutator method to set the value of secretary for obj2
– Accessor methods for name and salary using obj1
– Invoke method bonus(float percent) using obj1
– Accessor method of secretary using obj2
 */


public class oppe1 {
    public static void main(String[] args) {
        
        Employee m1 = new Manager();
        m1.setEmpName("Siddharth");
        m1.setSalary(10000);
        Manager m2 = new Manager();
        m2.setSecretary("XYZ");
        
        
        System.out.println("Employee name: "+m1.getEmpName());
        System.out.println("Employee Salary: "+m1.getSalary());
        System.out.println("Manager's Secretary: "+m2.getSecretary());
        System.out.println("Manager's Bonus: "+m1.bonus(20));

    }
    
}
class Employee{
    private String empName;
    private double salary;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double bonus(float percent){
        return (percent/100.0)*salary;
    }
    
}

class Manager extends Employee {
    private String secretary;
    public String getSecretary() {
        return secretary;
    }
    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }
    public double bonus(float percent){
        return super.bonus(percent)*1.5;
    }
}
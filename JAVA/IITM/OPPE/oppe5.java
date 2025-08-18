/*It has been decided to give promotion to one of the four employees in the Sales depart-
ment of a company based on the following criteria. An employee with the maximum
number of years of experience is considered the ideal candidate for promotion. If two
employees have maximum experience, then the one who has taken the minimum number
of days of leave will be considered for promotion. Assume that no two of them have
taken the same number of days of leave.
Class Employee must implement the interface Comparable, and should have the following
members.
• Instance variables: ID (employee ID), experience (number of years of experience),
nleaves (number of days of leave taken so far)

• Override the method equals(Object o) such that it returns true if the two em-
ployees being compared have the same ID; else, return false.

• Override the method compareTo(Object obj) to compare two Employee objects,
based on experience and nleaves.
Class Company has two methods:
• The method main() in Class Company accepts the inputs to instantiate four objects
of Employee[] type. The input is accepted in the order ID, experience, and
nleaves, for each employee. It then invokes the method displayID(e), which
returns the ID of the employee who gets the promotion.
• int displayID(Employee[] emo) returns the ID of the Employee object who gets
the promotion, by using the method compareTo(Employee e) inside the class
Employee.
Sample Input:
10 2 1
10 2 1
11 3 1
12 3 0
Output:
1
Public test case 1:
10 2 1
10 2 1

Page 4

11 3 1
12 3 0
Output:
12
Public test case 2:
20 2 1
21 3 2
22 4 2
23 2 4
Output:
22
Private test case 1:
Input:
100 2 3
101 2 2
102 2 1
103 2 0
Output:
103
*/
import java.util.*;
class Employee implements Comparable<Employee>{
    int ID;
    int experience;
    int nleaves;
    public Employee(int i, int e, int l){
        ID = i;
        experience = e;
        nleaves = l;
    }
    // Override equals(Object o) here
    public boolean equals(Object o){
        if (o instanceof Employee) {
            Employee emp = (Employee)o;
            if (this.ID==emp.ID ) {
                return true;
            }
        }return false;
        
    }
    // Override compareTo(Object o) here
    public int compareTo(Employee o){
        
            if (this.experience != o.experience) {
                return Integer.compare(this.experience, o.experience);
            }
            return Integer.compare(o.nleaves, this.nleaves);
        
        
    }
}

public class oppe5 {
    public static int displayID(Employee[] emp){
        int max = 0;
        int n = 0;
        for(int i = 0; i < 4; i++){
            int count = 0;
            for(int j = 0; j < 4; j++){
                if(!emp[i].equals(emp[j])){
                    count = count + emp[i].compareTo(emp[j]);
                }
            }
            if(count > max){
                max = count;
                n = emp[i].ID;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[4];
        e[0] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[1] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[2] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        e[3] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int id = displayID(e);
        System.out.println(id);
}
}

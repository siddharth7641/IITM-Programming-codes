/*Problem Statement
Write a Java program that, given as input the names of employees in an insurance company
and the policy sales target achieved by each of them in 3 consecutive months, prints the
names of those employees who have achieved at least 10 in all the months. Complete the
program as specified below.
• Class Company has/should have the following members:
– Private Instance variable Map<String, ArrayList<Integer>> employeeMap (maps
the employee name to the list of the sales target achieved by them in each month).
– A constructor to initialize the instance variable.
– An accessor method to access the instance variable.
• Class FClass has the following members:
– A method getFinalList() that takes an object of class Company as input and
returns the list of employee names who has/have scored at least 10 in all the
months.
– main() method does the following:
∗ accepts inputs to instantiate an object of Company. The input is accepted in
the order - employee name followed by the list of their policy sales target.
∗ invokes method getFinalList(), to get the list of employee names who
has/have achieved at least 10 in all the months.
∗ prints the list returned by the method getFinalList()

What you have to do
• Define method getFinalList() of class FClass.
Template Code
*/

import java.util.*;
class Company{
    private Map<String, ArrayList<Integer>> employeeMap;
    public Company( Map<String, ArrayList<Integer>> e) {
    employeeMap = e;
    }
    public Map<String, ArrayList<Integer>> getEmployeeMap(){
    return employeeMap;
    }
}
public class oppe6{
    public static ArrayList<String> getFinalList(Company c) {
    ArrayList<String> eList = new ArrayList<String>();
    for (Map.Entry<String, ArrayList<Integer>> entry :c.getEmployeeMap().entrySet()){
        ArrayList<Integer> targetList = entry.getValue();
        int i = 0;
        while (i < targetList.size() && targetList.get(i) >= 10) {
            i++;
        }
        if (i == targetList.size()) {
            eList.add(entry.getKey());
        }
    }
    return eList;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> emap =
        new LinkedHashMap<String, ArrayList<Integer>>();
        for(int i = 0; i < 3; i++) {
        ArrayList<Integer> targetList = new ArrayList<Integer>();
        String name = sc.next();
        for(int j = 0; j < 3; j++) {
            targetList.add(sc.nextInt());
        }
        emap.put(name, targetList);
        }
        Company c = new Company(emap);
        System.out.println(getFinalList(c));
    }
}
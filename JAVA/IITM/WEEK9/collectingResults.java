import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class collectingResults {
    public static void main(String[] args) {
        
        // Create a list of integers
        List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 18, 8, 4);
    
        /*
    // Use collect()
        // Pass appropriate factory method from Collectors Static method that directly calls a constructor
    // Use Stream to filter even numbers, square them, and print each
    //[filter]-->[forEach]
    // Create a list from a stream
        List<Integer> output1 =numbers.stream()
                .filter(n -> n%2 ==0)
                .map(n-> n*n) // Square each number
                .collect(Collectors.toList()); // Filter even numbers
        
        // Create a set from a stream
        Set<Integer> output2=numbers.stream()
                .filter(n -> n%2 ==0)
                .map(n-> n*n) // Square each number
                .collect(Collectors.toSet()); // Filter even numbers
        
        // Create a treeSet from a stream
        Set<Integer> output3=numbers.stream()
                .filter(n -> n%2 ==0)
                .map(n-> n*n) // Square each number
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        */


        /* 
    // Get summary statistics from the stream
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    // Print the statistics
        System.out.println("Count: "+ stats.getCount()); 
        System.out.println("Sum : "+ stats.getSum());
        System.out.println("Min : "+ stats.getMin());
        System.out.println("Max : "+ stats.getMax());
        System.out.println("Average: "+ stats.getAverage());
        */


    // Create a map from a stream
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee (101, "Alice", "HR"),
                new Employee (102, "Bob", "Engineering"),
                new Employee (103, "Charlie", "Finance")
        );
        // Convert to Map with id as key and Employee as value
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(
                Employee::getId,  // key: employee ID
                emp -> emp       // value: entire Employee object
        ));
        System.out.println(employeeMap);
        System.out.println("*********************************************************************************************\n");
        
        // Group element by dept
        Map<String, List<Employee>> groupByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDept)
        );
        System.out.println(groupByDept);
        System.out.println("*********************************************************************************************\n");

        // Partition by whether department is "Engineering"
        Map<Boolean, List<Employee>> partitioned=employees.stream()
                .collect(Collectors.partitioningBy(emp -> "Engineering".equals(emp.getDept()))
        ); 
        // Print the partitioned map
        System.out.println("Engineering department:");
        partitioned.get(true).forEach(System.out::println);
        System.out.println("\nother departments:");
        partitioned.get(false).forEach(System.out::println);









    }
}

class Employee{
    private int id;
    private String name;
    private String dept;
    public Employee(int id , String name, String dept){
        this.id = id;
        this.name = name ;
        this.dept =dept;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public  String toString(){
        return "Emplyee{id=" +id+ ", name="+name +", dept="+dept+"}";
    }
}
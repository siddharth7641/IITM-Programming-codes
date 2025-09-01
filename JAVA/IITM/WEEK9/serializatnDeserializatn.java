import java.io.*;

class Employee implements Serializable{
    private String name ;
    private double salary;

    public Employee(String name, double salary){
        this.name = name ;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return "name: " + name + ", "+ "salary: "+salary;
    }
    
}






public class serializatnDeserializatn {
    public static void main(String[] args) {
    
    /* 
        String filepath = "Employeeser.txt";
    // Serialization
        Employee emp1 = new Employee("Arun", 5000.0);
        Employee emp2 = new Employee("Lakshay", 45000.0);
    // Write into a file
        try {
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            oos.writeObject(emp2);
        } catch (Exception e) {
            System.out.println(e.getMessage());        
        }
    // Deserialization
        // reading
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deserializedEmp1 = (Employee) ois.readObject();
            Employee deserializedEmp2 = (Employee) ois.readObject();

            System.out.println("Employee object deserialized:\n"+deserializedEmp1);
            System.out.println("Employee object deserialized:\n"+deserializedEmp2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    */

    /*
        String filepath = "Employeetransient.txt";

        Manager man = new Manager("Siddharth", "Parth");
    // Serialization
        try {
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(man);
            System.out.println("Employee object serialized and saved to "+ filepath);

        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }

    // Deserialization
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Manager deserializedMan = (Manager) ois.readObject();
            System.out.println("Employee object deserialized :\n"+ deserializedMan);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    */

        
    }
}

class Manager implements Serializable{
    private String name;
    private transient String secName;
    
    public Manager(String name, String secName){
        this.name= name ;
        this.secName = secName; 
    }

    public String getName (){
        return name;
    }
    public String getSecName(){
        return secName;
    }

    // custom serialization method
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();  //write default serialized field
        out.writeUTF(secName);    //write secName manually
    }

    //custom deserialization method
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject(); //read default serialized fields
        secName = in.readUTF(); //read secName manually
    }

    public String toString(){
        return "name: "+ name +", secretary: "+secName;
    }
}
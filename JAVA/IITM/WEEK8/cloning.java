import java.util.ArrayList;

public class cloning{
    public static void main(String[] args) throws CloneNotSupportedException {
        
        student obj1 = new student();
        obj1.name ="siddharth";
        obj1.rollNo = 54;
        address Aobj1 = new address();
        Aobj1.addressId = 99;
        obj1.adrs =Aobj1;
        obj1.setCourses(1, "MAD");
        obj1.setCourses(4, "Java");
        obj1.setCourses(5, "DBMS");


        student obj2 = (student) obj1.clone();
        obj2.name = "Lakshay";
        obj2.rollNo =55;
        obj2.setAdrs(10);;
        obj2.setCourses(1, "CT");


        System.out.println("Original: "+ obj1);
        System.out.println("Cloned: "+ obj2);


    }
} 

class student implements Cloneable{
    String name ; //immutable , alway create a new object
    int rollNo ; //primitive , just store the value ,  not reference
    ArrayList<String> courses; // mutable, so, must be cast implicitly through deep copy
    address adrs; // mutable nested object, so, must be cast implicitly through deep copy

    public student() {
        courses = new ArrayList<>();
        // Initialize with 3 empty values so setCourses works
        courses.add("Statistics");
        courses.add("Maths");
        courses.add("Python");
    }

    public void setCourses(int index , String course ){
        if (index>=0 && index < courses.size()) {
            courses.set(index, course);
        }
    }

    public void setAdrs(int n){
        adrs.setAddressID(n);
    }

// // SHALLOW COPY  
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }

// DEEP COPY
    @Override
    public Object clone() throws CloneNotSupportedException {
        student cloned = (student) super.clone(); //shallow copy
        cloned.courses = new ArrayList<>(this.courses); //deep copy of courses
        cloned.adrs = (address) adrs.clone(); //deep copy of nested object
        return cloned;
    }

    public String toString(){
        return name +" , "+ rollNo+" , "+ adrs.addressId+" , "+courses;
    }
}

class address implements Cloneable{
    int addressId;

    public void setAddressID(int a){
        addressId =a;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
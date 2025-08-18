class student{

    private int age;
    private String name;

    // rather than using setter we can use constructor to set the value during the creation of object
    // no return type and same name as class with arguments
    student(){
        
    }

    student(String name){
        this.name = name ;
        this.age = 18;
    }

    student(String name, int age){
        this.name = name ;
        this.age = age;
    }

    public void setAge(int age){  // setter
        this.age = age;
    }
    public void setName(String name){ // setter
        this.name =name;
    }

    public int getAge(){ //agegetter
        return age;
    }
    public String getName(){ //namegetter
        return name;
    }

    public void disp(){  // to display 
        System.out.println(name + " is "+ age + " years old.");
    }
}

public class encapsulation {
    public static void main(String[] args) {
// SETTERS AND GETTERS
        // without constructor using setter and zero perameter
        // student stu =new student();
        // stu.disp();
        // stu.setAge(19);
        // stu.setName("Siddharth");
    

        // String stu1Name = stu.getName();
        // int stu1Age = stu.getAge();

        // System.out.println(stu1Name );
        // System.out.println(stu1Age);
        
// CONTRUCTOR AND OVERLOADING
        // with contructor and no parameters
        student stu1 =new student();
        stu1.disp();

        // with contructor of only name parameter
        student stu2 =new student("siddharth");
        stu2.disp();

        // with constructor and parameter to set values of object
        student stu3 =new student("siddharth",19);
        stu3.disp();

        
    }
}
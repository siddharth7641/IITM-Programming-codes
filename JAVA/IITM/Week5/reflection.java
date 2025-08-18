import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * WHY USE REFLECTION??
 * for framework
 * for testing a class
 * AVOID REFLECTION, if u can cuz it make code slower, complecated and bugged.
 */


public class reflection {
    public static void main(String[] args) throws Exception{
    
        Cat myCat = new Cat("Stella", 6);
        Field [] catFields = myCat.getClass().getDeclaredFields();
        Method[] catMethod = myCat.getClass().getDeclaredMethods();

    // ACCESSING FIELDS IN CLASS
        for (Field field : catFields) {
            // System.out.println(field.getName());
        }
    
    // Modifying private final name which is generally not doable, but we can don using reflection and writing throws Exception in main method 
        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat,"Jimmy");
            } 
        }
        // System.out.println(myCat.getName());

    // calling the meow method using reflection
        for (Method method : catMethod) {
            if (method.getName().equals("meow")) {
                method.invoke(myCat);
            }
            // System.out.println(method);
        }

    // Invooke a PRIVATE METHOD using reflection
        for (Method method : catMethod) {
            if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat); // or method.invoke(null);
            }
        }

    // Invooke a PRIVATE STATIC METHOD using reflection
        for (Method method : catMethod) {
            if (method.getName().equals("heyThisIsPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(myCat); // or method.invoke(null);
            }
        }
    }
}

class Cat{
    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void setAge(Integer age){
        this.age =age;
    }
    
    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void meow(){
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("How did u call this??");
    } 

    public static void heyThisIsPublicStaticMethod(){
        System.out.println("I'm Public and Static");
    }

    private static void heyThisIsPrivateStaticMethod(){
        System.out.println("Hey, I'm Private and Static");
    }

    public void setAge(int age) {
        this.age = age;
    }
}

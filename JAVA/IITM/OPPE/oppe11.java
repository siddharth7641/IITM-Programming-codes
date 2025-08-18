/*Complete the Java code that uses the concept of inheritance to demonstrate dynamic method dispatching.

Class WaterBody has the following members:

Private instance variable name
Constructor to initialize name
Accessor method for name
Method display to display the text: Inside an anonymous body of water
Classes River and Lake should be defined in such a way that any object of River or Lake can be assigned to a reference variable of type WaterBody. See the main method to understand the context.

For an object of River, method display should print the message Inside river followed by the name of the river.
For an object of Lake, method display should print the message Inside lake followed by the name of the lake.
What you have to do
Define an accessor method for name inside class WaterBody
Define method display inside class WaterBody
Define classes River and Lake
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

Template Code(Click to Expand)
*/

public class oppe11 {
    public static void main(String[] args) {
        WaterBody w =new WaterBody("SID");
        WaterBody r = new River("PAGLU");
        WaterBody l = new Lake("TAKLU");
        w.display();
        r.display();
        l.display();
    }
    
}

class WaterBody{
    private String name;
    public WaterBody(String s){
        name = s;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Inside an anonymous body of water");
    }
}

class River extends WaterBody{
    public River(String r){
        super(r);
    }
    @Override
    public void display() {
        System.out.println("Inside river "+ getName());
    }
}
class Lake extends WaterBody{
    public Lake(String l){
        super(l);
    }
    @Override
    public void display() {
        System.out.println("Inside lake "+ getName());
    }
}
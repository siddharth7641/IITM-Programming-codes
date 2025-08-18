/*
A laptop is both a computer and a portable device. Complete the Java program below
in order to print customized messages based on which among the two roles - computer or
portable device - of a laptop is being given as input.
• Interface Computer has the abstract method compute()
• Interface PortableDevice has the abstract method batteryBalance()
• Class Laptop has properties of both a Computer and a PortableDevice, and has the
following members:
– method compute() that returns the string: <Name of the device> computes
– method batteryBalance() that returns the string: <Name of the device> is
fully charged
• Class InterfaceTest has the main method that does the following:
– Accepts as input the types and names of 3 devices
– If the type is C, then invoke method compute(), else invoke method batteryBalance()
– Print the messages
What you have to do
• Define interface Computer
• Define interface PortableDevice
• Define class Laptop
 */

import java.util.*;
 //DEFINE interface Computer
interface Computer {
    String compute();    
 }
 //DEFINE interface PortableDevice
interface PortableDevice{
    String batteryBalance();
}
 //DEFINE class Laptop
class Laptop implements Computer,PortableDevice{

    String name;
    public Laptop(String n){
        name = n;
    }
    public String compute(){
        return name + " computes";
    }
    public String batteryBalance(){
        return name+" is fuly charged";
    }
}
public class oppe8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> messagesList = new ArrayList<>();
        for(int i=0;i<3;i++){
            String type = sc.next();
            if (type.equals("C")){
                Computer c = new Laptop(sc.next());
                messagesList.add(c.compute());
            }
            else if (type.equals("M")){
                PortableDevice m = new Laptop(sc.next());
                messagesList.add(m.batteryBalance());
            }
        }
        for (String s:messagesList){
            System.out.println(s);
        }
        sc.close();
    }
}
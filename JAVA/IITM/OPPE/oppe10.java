import java.util.*;
public class oppe10 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // evenDisplay(s);

        // String [] projects ={"Data Structure", "Java", "Python"};
        // student s1 = new student("Ranjit", projects);
        // student s2 = new student(s1);
        // s2.setName("Preeti");
        // s2.setProject(1,sc.next());
        // System.out.println(s1 +"\n"+s2);


    }
    public static void evenDisplay(String s){
        for(int i=0; i<s.length();i++){
            if ((i%2)%2==0) {
                System.out.print(s.charAt(i));
            }
        }
    }
    
}

// deep copy
class student{
    String name;
    String [] projects;
    public student(String name , String[] projects){
        this.name = name;
        this.projects =projects;
    }
    public student(student s){
        this.name = new String(s.name);
        this.projects =new String[s.projects.length];
        for (int i =0;i<s.projects.length;i++) {
            this.projects[i] =s.projects[i];
        }
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProject(int index) {
        return projects[index];
    }
    public void setProject(int index,String project) {
        this.projects[index] = project;
    }
    public String toString(){
        return name+ " : "+ getProject(1);
    }
    
}

interface wearableGadget{
    public abstract String showTime();
}

interface FitnessTracker{
    String trackSteps();
}

class smartWatch implements wearableGadget, FitnessTracker {
    private String name;
    public smartWatch(String name){
        this.name = name;
    } 
    public String showTime(){
        return name + " show the current time.";
    }
    public String trackSteps(){
        return name + " play media.";
    }

} 
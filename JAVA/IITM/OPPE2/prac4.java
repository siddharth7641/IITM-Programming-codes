import java.util.*;
import java.util.stream.*;

public class prac4 {
    public static void main(String[] args) {
        ArrayList<Patient> Patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            Patient obj = new Patient(sc.next(), sc.nextInt(), sc.next());
            Patients.add(obj);
        }

        //Call processor method here to filter patients and print them
        
        Stream<Patient> streamp = Patient.patientProcessor(Patients);
        streamp.forEach(
          System.out::println);
        
        sc.close();
    }
}

class Patient {
    private String name;
    private int age;
    private String chronicCondition;

    public Patient(String n, int a, String cC) {
        name = n;
        age = a;
        chronicCondition = cC;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public int getage() {
        return age;
    }

    public String getchronicCondition() {
        return chronicCondition;
    }

    //Write processor method here to filter patients
    public static Stream<Patient> patientProcessor(ArrayList<Patient> p){
      return p.stream().filter(a -> a.getage()<30 ).filter(a -> a.getchronicCondition().equals("Diabetes"));
      
    }
}


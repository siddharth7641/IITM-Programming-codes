package practice;
import java.util.Scanner;

class launchFarmer {
    int pa;
    float td;
    static float ri=8.5f;
    float si;
    

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please metion the amount required:");
        pa=scan.nextInt();
        System.out.println("Please mention the time duration:");
        td=scan.nextFloat();
    }

    void compute(){
        si=(pa*ri*td)/100f;
    }

    void disp(){
        System.out.println("SI is: "+si);
    }
}

public class FARMER {
    public static void main(String[] args) {
        launchFarmer in = new launchFarmer();
        in.input();
        in.compute();
        in.disp();
    }

    
}



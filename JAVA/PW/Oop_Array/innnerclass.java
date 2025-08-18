@FunctionalInterface
interface  car{
    void drive(int avg);
}
class outer{

    public void show(){
        System.out.println("in show");
    } 
    class inner{ // inner class

        public void disp(){
            System.out.println("in disp");
        }

    }
    static class inner1{ // inner class

        public void portray(){
            System.out.println("in portray");
        }
    }
}

public class innnerclass {
    public static void main(String[] args) {

// INNERCLASS
        outer out = new outer();
        outer.inner in = out.new inner();
        outer.inner1 in1 = new outer.inner1();

        out.show();
        in.disp();
        in1.portray();

// LAMBDA
        //  no parameter
        // car obj = () -> System.out.println("Driving...!!!");

        // one parameter
        car obj1 = avg -> System.out.println("average- " + avg);

        obj1.drive(40);
    }
    
}

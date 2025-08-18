class aeroplane 
{
    
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off.");
    }

    public void fly()
    {
        System.out.println("Aeroplane is flying.");
    }
    
}

class cargoPlane extends aeroplane 
{

    // fly is overriden method, where we made some chnges in already existing method of parent class
    public void fly()
    {
        System.out.println("Cargoplane is flying a lower height. ");
    }

    public void takeOff()
    {
        System.out.println("Cargoplane require medium runway.");
    }

}

class passengerPlane extends aeroplane 
{

    // fly is overriden method, where we made some chnges in already existing method of parent class
    public void fly()
    {
        System.out.println("Passengerplane is flying a high height. ");
    }

    public void takeOff()
    {
        System.out.println("Passengerplane requires long runway.");
    }

}

class fighterPlane extends aeroplane 
{

    // fly is overriden method, where we made some chnges in already existing method of parent class
    public void fly()
    {
        System.out.println("Fighterplane requires on small runway. ");
    }

    public void takeOff()
    {
        System.out.println("Fighterplane flies at high height.");
    }

}


class Airport {

    public void poly(aeroplane ref){

        ref.takeOff();
        ref.fly();
        
        System.out.println("---------------------------------------");
    }
    
}
public class polymorphism {
    public static void main(String[] args) {

        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();

        // using polymorphism we can call takeoff and fly method in each child class
        // by using its referance to parent class in airport class

        Airport ap = new Airport();

        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);


    }
}

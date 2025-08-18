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

    // takeoff is an inherited method, where we dont change anything

    // fly is overriden method, where we made some chnges in already existing method of parent class
    public void fly()
    {
        System.out.println("Cargoplane is flying a lower height. ");
    }

    // cargoMaterial is a specialized method, which was not present in parent class
    public void cargoMaterial()
    {
        System.out.println("Cargo carries goods.");
    }

}


public class inhmethodtypes {
    public static void main(String[] args) {

        cargoPlane cp =new cargoPlane();
        cp.takeOff();
        cp.fly();
        cp.cargoMaterial();
        
    }
}

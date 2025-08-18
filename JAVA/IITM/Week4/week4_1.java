public class week4_1 {
    public static void main(String[] args) {
        
        geospace[] g = new geospace[3];
        g[1] = new cube();
        g[2] = new rectangle();

        for(int i =1; i<3;i++){
            g[i].area();
            g[i].volume();
        }
    }
}

interface  geospace {
    void area();
    void volume();
}

class cube implements geospace{

    public void area(){
        System.out.println("Area of Cube.");
    }
    public void volume(){
        System.out.println("Volume of Cube.");
    }
}

class rectangle implements geospace{
    
    public void area(){
        System.out.println("Area of Rectangle.");
    }
    public void volume(){
        System.out.println("Volume of Rectangle.");                
    }
}
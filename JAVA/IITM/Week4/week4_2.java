package Week4;
class employee{
    String name ;
    address a ;
    public employee(String name){
        this.name = name ;
    }
    private class address{
        private String city;
        public  address(String city){
            this.city = city;
        }
        public String toString(){
            return city;
        }
    } 
    public void addandsetadress(String s){
        a= new address(s);
    }

    public String toString(){
        return "name: "+ name + ", address: " + a;
    }
}
public class week4_2 {
    public static void main(String [] args){
        employee e = new employee("MEENA");
        e.addandsetadress("Agra");
        System.out.println(e);
}
}

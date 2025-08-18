class calc{
    public int add(int n1, int n2){
        int result = n1 +n2;
        return result;
    }
    // what if we want to add 3 nubers, so for that we can keep the method name same but change the parameter for other method
    public int add(int n1, int n2, int n3){
        int result = n1 +n2;
        return result;
    }
    // just like that, we can also create method for float addition with samae method name 
    public double add(double n1, double n2){
        double result = n1 +n2;
        return result;
    }
    public int sub(int n1, int n2){
        int result = n1-n2;
        return result;
    }
} 

public class mthd_overloading {
    
    public static void main(String[] args) {
        short a=5;
        short b=6;
        calc addcCalc =new calc();
        int result1 = addcCalc.add(4,5);
        System.out.println(result1);
        System.out.println(addcCalc.add(a,b));
        System.out.println(addcCalc.add(4,5,6));
        System.out.println(addcCalc.add(4.5,5.6));


    }
}

import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        ComplexNum<Integer> c1 = new ComplexNum<>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);

        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
// DEFINE class ComplexNum
class ComplexNum <T extends Number>{
  T r;
  T i;
  public ComplexNum(T r, T i){
    this.r =r;
    this.i =i;
  }
  public ComplexNum<Double> add(ComplexNum<?> c){
    ComplexNum<Double> dc = new ComplexNum<>(0.0,0.0);
    dc.r =this.r.doubleValue() + c.r.doubleValue();
    dc.i = this.i.doubleValue() + c.i.doubleValue();
    return dc;
  }
  public String toString(){
    return r.doubleValue() + " + "+ i.doubleValue()+ "i";
  }
}

package practice;
class recArea {
    int area(int l, int h){
        return l*h;

    }
    
}

public class REC_area {
    public static void main(String[] args) {
        recArea reca = new recArea();
        int Result = reca.area(10, 20);
        System.out.println(Result);
    }
}

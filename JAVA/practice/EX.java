public class EX {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>(10);
        Container<String> strContainer = new Container<> ("siddharth");
        Container<Double> doubleContainer= new Container<> (10.54);
        intContainer.disp();
        strContainer.disp();
        doubleContainer.disp();
            
    }
    
}

class Container <T>{
    private T value;
    public Container (T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void disp(){
        System.out.println(value);
    }
}
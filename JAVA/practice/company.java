interface  computer{
    public void compileCode();
}

class laptop implements computer {

   public void compileCode(){
       System.out.println("You got 5 ERRORS!!!!!");
   }
}

class desktop implements computer{

   public void compileCode(){
       System.out.println("You got 5 ERRORS!!!, FASTER");
   }
}

class developer{
   
   public void buildApp(computer lap){
       System.out.println("Building App.");
       lap.compileCode();
   }
}

public class company {
   public static void main(String[] args) {
       
       computer des = new desktop();
       computer lap = new laptop();
       developer dev = new developer();
       dev.buildApp(lap);
       dev.buildApp(des);

   }
   
}
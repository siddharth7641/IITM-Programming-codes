public class myweb {
    public static void main(String[] args) {

        painacular p = new painacular(5);
        Intermyweb i= p.secAccess("sid", "3096");
        System.out.println("-----------------------------------");
        i.mynovels();  
        System.out.println("-----------------------------------");
        i.mypains();
        System.out.println("-----------------------------------");
        i.mydisgusts();    
        System.out.println("-----------------------------------");       
    }
}

interface Intermyweb {
    void mynovels();
    void mypains();
    void mydisgusts();
}
class painacular{
    secret s;
    String [] pains;
    int size;
    int curPains=0;
    public painacular(int n){
        size = n;
        pains =new String[size];
    }
    public void addPain(String pain){
        if (curPains<size-1){
            pains[curPains++] = pain;
        }
    }
    public Boolean isThatYou(String usr, String pass){
        if(usr=="sid" && pass == "3096"){
            return true;
        }
        return false;
    }
    public secret secAccess(String usr, String pass){
        if (isThatYou(usr, pass)){
            return new secret();
        }
        return null;   
    }
    class secret implements Intermyweb{
        public void mynovels(){
            System.out.println("GUNAHON KE DEVTA");
            System.out.println("GOOD GIRL'S GUIDE TO MURDER SERIES");
            System.out.println("WHITE NIGHTS");
            System.out.println("HIDDEN HINDU SERIES");
        }
        public void mypains(){
            System.out.println("IN HEAD");
            System.out.println("IN BACK");
            System.out.println("IN EYES");
        }
        public void mydisgusts(){
            System.out.println("IGNORANCE");
            System.out.println("TELLING ONE THING AGAIN & AGAIN");
            System.out.println("SUMMERS");
        }
    }
}
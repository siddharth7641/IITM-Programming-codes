
import java.util.Scanner;
import java.util.Arrays;

public class BCA {
    public static void main(String[] args) {
        
        practical p = new practical();
        // p.product();
        // p.LargestNum();
        
        // String l[] = new String[]{"sid " , "rabbit" , "cow ", "racoon"};
        // p.AscNameSort(l);

        p.palindrome("manna");
        p.palindrome("naman");
    }


}

class practical {
    
    Scanner s =new Scanner(System.in);
    
    public void product() {
        int a,b ;
        System.out.println("Enter numbers 1 :");
        a= s.nextInt();
        System.out.println("Enter numbers 2 :");
        b= s.nextInt();

        int product = a*b;
        System.out.println(product);
    }
    
    public void LargestNum(){
        

        System.out.println("How many numbers you wanna compare??");
        int n = s.nextInt();
        int LNum =0;

        for (int i=0; i<n; i++){
            int x = s.nextInt(); 
            if (x>LNum){
                LNum= x;
            }     
        }     
        System.out.println("The largest number among givens is :" + LNum);  
    }
    
    public void AscNameSort(String []l){
        
        Arrays.sort(l);
        System.out.println("Sorted names:");
        for( String s : l){
            System.out.print( s + ", ");
        }
    }

    public void palindrome(String s){

        String reversed = "";
        for (int i = (s.length() -1) ; i>=0 ; i-- ){
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println("String is a Palindrome.");
        }else{
            System.out.println("String is not a Palindrome.");
        }
    }
    
}



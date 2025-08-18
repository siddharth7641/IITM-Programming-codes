// public class operators {//ARITHMETIC OPERATORS
//     public static void main(String[] args){
//         int num1 =5;
//         int num2 =9;
//         System.out.println(num1 + num2);
//         System.out.println(num1 - num2);
//         System.out.println(num1 * num2);
//         System.out.println(num1 / num2);
//         System.out.println(num1 % num2);
//         System.out.println(num1 / (float)num2);
//     }
// }



// public class operator{//INCREMENT AND DECREMENT
//     public static void main(String[] args){
//         int a=5;
//         int d=5;
//         //pre increment/decrement
//         // ++a;
//         // --a;
//         //post increment/decrement
//         // a++;
//         // a--;

//         // both acts same if we do the operation on same variable but when we assigh value of a variable to another variable
//         // using opst or pre they work different
//         // post first assign the value to B then inc/dec A 
//         // pre, first inc/dec A then assign value of A to B
        
//         int b = ++a;
//         int c = d++;
//         System.out.println(b);
//         System.out.println(c);

//     }
// }

// public class operator {//ASSIGNMENT OPERATOR

//     public static void main(String[] args) {
//         //different waays of assignment
//         //1
//         int a=5;
//         //2
//         int b,c,d;
//         b=1 ,c=2,d = 3;
//         //3
//         int m1,m2,m3;
//         m1=m2=m3=10;
//     }
// }


// public class operator {// RELATIONAL OPERATORS
//     public static void main(String[] args) {
//         //provide outputs in boolean values
//         int a= 5;
//         int b=7;
//         System.out.println(a==b);
//         System.out.println(a>b);
//         System.out.println(a>=b);
//         System.out.println(a<b);
//         System.out.println(a<=b);
//         System.out.println(a!=b);
//     }
// }

// public class operator { //LOGICAL OPERATORS
//     public static void main(String[] args) {
//         int a=5;
//         int b=7;
//         System.out.println(a<b && a==5 );
//         System.out.println(a<b || a==b );
//         System.out.println(!true);
//     }
// }

public class operator { //TERNARY OPERATORS
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=9;
        //GREATER NUMBER
        int result=(a<b)?b:a;
        System.out.println(result);

        // NESTED TERNARY
        int res = (a<b)?(c<b?b:c):(c<a?a:c);
        System.out.println(res);
    }
}
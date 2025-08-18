
public class Array {
    public static void main(String[] args) {
    // // 1-D ARRAY
    // // when we know the values 
        int num1[] = {1,2,3,1,2,3};

    //     // access the values 
    //     System.out.println(num1[0]);

    //     // change in value
    //     num1[1]=20;

    //     // TRAVERSING
    //     for (int i=0; i<=5;i++){
    //         System.out.print(num1[i]+" ");
    //     }
    //     System.out.println("num1");

    // // when u dont know the values
    //     // we create an object
    //     int[] num2 = new int[3];
        
    //     // initially values are zero, cuz it is stored in heap memory
    //     // inseting values
    //     num2 [0]=50;
    //     num2[1]=20;
    //     num2[2]=30;

    //     // TRAVERSING
    //     for (int i=0; i<3;i++){
    //         System.out.print(num2[i]+" ");
    //     }System.out.println("num2");


    // // 2-D ARRAY
    // // when we know the values 
    //     int num3[][] = {
    //         {2,4},{3,6}
    //     };

    // // when u dont know the values
    //     int num4[][]= new int[2][2];

    //     num4[0][0] = 5;
    //     num4[0][1] = 4;
    //     num4[1][0] = 9;
    //     num4[1][1] = 10;

    //     // to traverse this we have to use nested loops 
    //     for (int i=0; i<2;i++){
    //         for(int j=0; j<2; j++){
    //             System.out.print(num4[i][j]+" ");
    //         }System.out.println();
            
    //     }System.out.println("num4");


    // // JAGGED ARRAY - no. of rows are fixed but not no. of columns
        int [][]num5 = new int[3][];
        //we can metion the no. of colums for each row saparately
        num5[0]=new int[4];
        num5[1]=new int[1];
        num5[2]=new int[2];

        //inserting values
        num5[0][0] = 5;
        num5[0][1] = 4;
        num5[0][2] = 7;
        num5[0][3] = 8;
        num5[1][0] = 9;
        num5[2][0] = 10;
        num5[2][1] = 20;

    //     // traversing forr jagged array is bit dofferent bcuz no. of colums are not fixed 
    //     // that why we dont know fixed walue of j condition
    //     // son we put (num5[i].length) which tells no. of columns present 

    //     for (int i=0; i<=2;i++){
    //         for(int j=0; j<num5[i].length; j++){
    //             System.out.print(num5[i][j]+" ");
    //         }System.out.println();
            
    //     }System.out.println("num5");


    // // ENHANCED "FOR" LOOP OR "FOR-EACH" LOOP
    //     // SINGLE-DIMENSION ARRAY
           
    //        for(int a : num1){
    //             System.out.print(a+" ");
    //        }System.out.println();
    //        System.out.println();


    //     // MULTI-DIMENSIONAL ARRAY
        
    //        for (int a[] : num5){
    //         for (int b : a){
    //             System.out.print(b+" ");
    //         }System.out.println();
    //        }
    // // LENGTH OF AN ARRAY
    //     //    NO. of elements in array
    //        System.out.println("The length of array num1 is "+ num1.length);
        
    //     // In 2-d array it tells about the no. of rows present
    //        System.out.println("The length of array num5 is " + num5.length);
           

 

    }
    
}

public class pattern {
    public static void main(String[] args) {
        // //PATTERN PROGRAMMING TO PRINT "****"
        // for(int i=0; i<4;i++){
        //     System.out.print("*");
        // }System.out.println();

        // System.out.println();
        // //PATTERN PROGRAMMING TO (SOLID SQUARE) PRINT "****"/n "****"/n "****"/n "****"/n
        // for(int i=0; i<4;i++){
        //     for (int j=0; j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // //PATTERN PROGRAMMING TO (SOLID RECTANGLE) PRINT "*****"/n "*****"/n "*****"/n "*****"/n
        // for (int l=0; l<4; l++){
        //     for (int m=0;m<5;m++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // System.out.println();
        // // HOLLOW RECTANGLE
        // // *****
        // // *   *
        // // *   * 
        // // *****

        // for (int a=0; a<4;a++){
        //     for(int b=0; b<5; b++){
        //         if(a==0 || b==0|| a==3 || b==4){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }

        // System.out.println();
        //HALF PYRAMID
        // *
        // **
        // ***
        // ****
        // for(int c=1 ;c<=4;c++){
        //     for (int d=1 ; d<=c; d++) {
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // //INVERTED HALF PYRAMID
        // // ****
        // // ***
        // // **
        // // *
        // for (int e=4; e>=1;e--){
        //     for(int f=1;f<=e;f++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // //INVERTED HALF PYRAMID rotated 180degree
        // //    *
        // //   **
        // //  ***
        // // ****
        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1;j<=4-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++)
        //     {
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // // HALF PYRAMID WITH NUMBERS
        // // 1
        // // 12
        // // 123
        // // 1234
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }System.err.println();
        // }

        // // INVERTED HALF PYRAMID WITH NUMBERS
        // // 1 2 3 4
        // // 1 2 3
        // // 1 2
        // // 1
        // for(int i=4;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }System.err.println();
        // }

        // FLOYD'S TRIANGLE
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // int num=1;
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(num+" ");
        //         num++;
        //     }System.err.println();
        // }

        // 0-1 TRANGLE
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // int num=1;
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if ((i+j)%2 ==0)
        //         {
        //             System.out.print(1+" ");
        //         }
        //         else
        //         {
        //             System.out.print(0+" ");
        //         }
        //     }System.err.println();
        // }

        // BUTTERFLY PATTERN
        // *             * 
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
        // for (int i=1;i<=4;i++)
        // {
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print("*"+" ");
        //     }
        //     for (int j=1; j<=(2*(4-i));j++ )
        //     {
        //         System.out.print(" "+" ");
        //     }
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print("*"+" ");
        //     }System.out.println();
        // }
        // for(int i=4;i>=1;i--)
        // {
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print("*"+" ");
        //     }
        //     for (int j=1; j<=(2*(4-i));j++ )
        //     {
        //         System.out.print(" "+" ");
        //     }
        //     for (int j=1;j<=i;j++)
        //     {
        //         System.out.print("*"+" ");
        //     }System.out.println();
        // }

        // SOLID RHOMBUS
        //         * * * * * 
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *
        int n=5;
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n;j++)
            {
                System.out.print("*"+" ");
            }System.out.println();
        }
    }
}

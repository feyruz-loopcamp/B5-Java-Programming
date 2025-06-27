package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiDimArrayExample {
    public static void main(String[] args) {

        int [] a = {5, 10, 20, 10};             // Single Dimensional array
        int [] b = {5, 10, 30, 40, 50, 23};     // Single Dimensional array

        int [][] twoDimArr1 = {a, b};                 // Two Dimensional array
        int [][] twoDimArr2 = { {32, 345, 2, 354}, {432, 5,-4, 345, -234, 45} };

        // Printing Single Dimensional arrays
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("--------------------------");
        // Printing 2 Dimensional arrays
        System.out.println(twoDimArr1);                     // will show memory location
        System.out.println(Arrays.toString(twoDimArr1));    // will show memory location
        System.out.println(Arrays.toString(twoDimArr2));    // will show memory location

        System.out.println(Arrays.deepToString( twoDimArr1 )); // [ [5, 10, 20, 10], [5, 10, 30, 40, 50, 23] ]
        System.out.println(Arrays.deepToString( twoDimArr2 )); // [ [32, 345, 2, 354], [432, 5, -4, 345, -234, 45] ]

        System.out.println("--------------------------");
        int [] c = new int[4];                  // Single Dimensional array declaration with size
        int [][] twoDimArr3 = new int[3][];     // this 2 Dimensional array will hold 3 Single Dimensional array of ANY size
        System.out.println(Arrays.deepToString( twoDimArr3 )); // Object default value: null ---  > [null, null, null]

        int [] arr1 = {1, 2, 3};
        twoDimArr3[0] = arr1;
        System.out.println(Arrays.deepToString( twoDimArr3 ));
        int [] arr2 = {1, 2, 3, 4, 5, 6};
        twoDimArr3[1] = arr2;
        System.out.println(Arrays.deepToString( twoDimArr3 ));
        int [] arr3 = {1, 2};
        twoDimArr3[2] = arr3;
        System.out.println(Arrays.deepToString( twoDimArr3 ));

        System.out.println("--------------------------");
        int [][] twoDimArr4 = new int[3][2]; // this 2 Dimensional array will hold 3 Single Dimensional array of size 2
        int [] arr4 = {1, 2};
        twoDimArr4[0] = arr4;
        int [] arr5 = {1, 2, 3}; // TODO: why not getting index error.
        twoDimArr4[1] = arr5;
        System.out.println(Arrays.deepToString( twoDimArr4 ));



        System.out.println("--------------------------");
        int [] arr6 = {1, 2};
        System.out.println(arr6[1]);

        int [][] twoDimArr7 = {
                {12, 45, 65},       // Single dim array
                {453, 4563},        // Single dim array
                {54, 67, 87, 9876}  // Single dim array
        };


        System.out.println(  twoDimArr7[1]  );
        System.out.println(  Arrays.toString(  twoDimArr7[1] ) );
        System.out.println(   twoDimArr7[1][1] );
        System.out.println(   twoDimArr7[2][3]);

        //twoDimArr7[0][3] = 56; // ArrayIndexOutOfBoundsException

    }
}

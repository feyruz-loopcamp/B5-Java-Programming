package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr1; // declared double array
        arr1 = new double[4]; // assigned value to array that will hold 4 elements

        // !!! - With directly giving values we canNOT declare and then give values
        //double [] arr2;
        //arr2 = {32.3, 78.9};
        int num = 5;
        double [] arr2 = {32.3, 78.9, 7, num}; // double can hold int - there IMPLICIT CONVERSION (CASTING)
        //int [] arr3 = {32.3, 78.9, 7}; // int cannot hold double - not IMPLICIT CONVERSION (CASTING)
        int [] arr3 = {(int)32.3, (int)78.9, 7}; // int cannot hold double - but with EXPLICIT CONVERSION (CASTING) we can - data loss is possible

        System.out.println( arr1.length); // 4
        System.out.println( arr2.length); // 2

        System.out.println();
        System.out.println(Arrays.toString(arr1)); // Since I have made an Array of 4 elements with no initial value, it will show the default value of that dataType
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println();
        // Q: Once I have made an array and declared that it will hold 4 elements, now I want to assign values those locations
        // [0.0, 0.0, 0.0, 0.0]
        //   0    1    2    3
        System.out.println( arr1[0]); // 0.0
        arr1[0] = 45.6;
        System.out.println(Arrays.toString(arr1));

        arr1[1] = 77;
        System.out.println(Arrays.toString(arr1));

        double price = 0.99;
        int quantity = 4;
        arr1[2] = price * quantity;
        System.out.println(Arrays.toString(arr1));


        arr1[3] = 99.9;
        System.out.println(Arrays.toString(arr1));

        //arr1[4] = 67.9; // ArrayIndexOutOfBoundsException
        //System.out.println(Arrays.toString(arr1));


        System.out.println();
        //Q: How can I get the last element in array
        // [45.6, 77.0, 3.96, 99.9]

        // - with String
        String str = "hello";
        //System.out.println(str.lastIndexOf('l'));
        System.out.println( str.charAt( str.length() - 1 ));

        // - with array
        // arr1[3]
        System.out.println(  arr1[arr1.length - 1] ); // 99.0

        //System.out.println( Arrays.toString(arr1) ); // "[45.6, 77.0, 3.96, 99.9]"
        //String str1 = Arrays.toString(arr1);
        //System.out.println(str1.substring(str1.lastIndexOf(" ") + 1)); // "99.9]"

        //System.out.println( arr1 ); // "[45.6, 77.0, 3.96, 99.9]"


        // Q: How can I re-assign a new value 44.2 to last index of arr1
        arr1[arr1.length - 1] = 44.2;
        System.out.println(Arrays.toString( arr1 ));


        System.out.println();
        arr1 = new double[5]; // re-assinged arr1 to a new array which has 5 locations in it.
        System.out.println(Arrays.toString( arr1 ));

        // assign 5.2 to the last element
        arr1[arr1.length - 1 ] = 5.2;
        System.out.println(Arrays.toString( arr1 ));
        System.out.println(arr1.length); // 5


    }
}
/*
    Default values of dataTypes in array
    		int --- > 0
			double --- > 0.0
			object --- > null  |  non-primitive data types - (String)
			boolean --- > false
			char  --- > ‘\u0000’
	Re-Assigning array itself
	Re-Assigning array index


 */

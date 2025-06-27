package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr1 = {30, 90, 60, 360, 180}; // [30, 60, 90, 180, 360]
        int [] arr2 = {180, 360, 90, 60, 30}; // [30, 60, 90, 180, 360]

        // How to print arrays / how to convert array to string including [] and comma
        String str = Arrays.toString(arr1); // "[30, 90, 60, 360, 180]"
        System.out.println(str);
        System.out.println( Arrays.toString(arr1) ); // toString method takes 1 arguments
        System.out.println( Arrays.toString(arr2) );

        System.out.println();
        // How to compare two arrays
        System.out.println("Before sorting method");
        boolean isEqual = Arrays.equals(arr1, arr2); // equals method takes 2 arguments
        System.out.println(isEqual);
        System.out.println(  Arrays.equals(arr1, arr2)  );

        System.out.println();
        System.out.println("After sorting method");
        // How can I sort arrays?
        Arrays.sort(arr1); // sort method takes 1 argument
        Arrays.sort(arr2);

        isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);
        System.out.println(  Arrays.equals(arr1, arr2)  );


        System.out.println();
        // how to join elements in array / how to convert array into String
        String [] strArr = {"java", "selenium", "jira", "sprint", "release"};
        System.out.println(Arrays.toString(strArr));

        String str2 = String.join("", strArr);  // join method takes 2 argument
        System.out.println(str2);
        String str3 = String.join("*", strArr);
        System.out.println(str3);
        System.out.println( String.join(", ", strArr) ); //"java, selenium, jira, sprint, release"

        System.out.println();
        // How to convert String into char array
        String str4 = "loopcamp";
        char []  strCharArr = str4.toCharArray(); // ['l', 'o', 'o', 'p', 'c', 'a', 'm', 'p']
        System.out.println(  Arrays.toString( strCharArr ) );


    }
}

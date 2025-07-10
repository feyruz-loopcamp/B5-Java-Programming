package day28_arraylist;

import java.util.*;

//import java.util.ArrayList;
//import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        // Array can hold PRIMITIVE and NON-PRIMITIVE
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};          // holds primitive data type
        Integer [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};      // holds object data type


        ArrayList <Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        nums1.add(6);
        nums1.add(7);
        nums1.add(8);
        nums1.add(9);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(nums1);

        System.out.println("----------------------------------------");

        Arrays.asList(arr2); // This is converting Integer array into ArrayList of Integer

        //ArrayList <Integer> numArrayList1 = Arrays.asList(arr1); // Cannot assign directly like this
        //ArrayList <Integer> numArrayList1 = new ArrayList<>(Arrays.asList(arr1)); // Cannot assign int [] into ArrayList
        //ArrayList <Integer> numArrayList2 = Arrays.asList(arr2); // Cannot assign directly like this
        ArrayList <Integer> numArrayList2 = new ArrayList<>(Arrays.asList(arr2)); // OK - can assign Integer [] into ArrayList

        // We added all the elements into the arraylist at the declaration by using .asList method from Arrays class which helps converting array into ArrayList
        ArrayList <Integer> numArrayList3 = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) );


        System.out.println(numArrayList2);
        System.out.println(numArrayList3);

        System.out.println("----------------------------------------");
        ArrayList <String> list4 = new ArrayList<>(Arrays.asList("java", "jira", "softskills", "mentors"));
        System.out.println(list4);


    }
}

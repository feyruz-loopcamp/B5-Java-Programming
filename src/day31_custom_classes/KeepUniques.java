package day31_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Keep Uniques / Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.

    @param nums - The given ArrayList of numbers @return - ArrayList of numbers

        Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
 */
public class KeepUniques {

    public static ArrayList <Integer> keepUniq (ArrayList <Integer> list){
        ArrayList <Integer> uniqList = new ArrayList<>();
        for ( Integer each : list){
            if (Collections.frequency(list, each) == 1 ){
                uniqList.add(each);
            }
        }
        /*
            1st - > 1 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 2
            2nd - > 3 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 1 --- > {3}
            3rd - > 5 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 2
            4th - > 1 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 2
            5th - > 4 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 1 --- > {3, 4}
            6th - > 5 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 2
            7th - > 9 ---- > {1, 3, 5, 1, 4, 5, 9} --- > 1 --- > {3, 4, 9}
         */
        return uniqList;
    }


    public static ArrayList <Integer> removeDup (ArrayList <Integer> list) { // 1, 3, 5, 1, 4, 5, 9
        ArrayList <Integer> uniqList = new ArrayList<>(list);
        uniqList.removeIf(each -> (Collections.frequency(uniqList, each) > 1) ); // removeIf -- > removes all matches  (not first match)
        return uniqList;
    }

    public static void main (String [] args ){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println("Original: " + nums);
        System.out.println("Uniques: " + keepUniq(nums) );

        System.out.println("------------------------------------------------");
        ArrayList <Integer> nums2 = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println("Original: " + nums2);
        System.out.println("Uniques: " + removeDup(nums2) );
    }


    /*
        TODO: Homework
            -- > String str = "vnslursdfsbrs"
            -- > 1) Using Collection knowledge, created a method that finds unique characters
            -- > Using Collection knowledge, created a method that finds duplicate (more than 1) characters

            Ex: String str = "vnslursdfsbrs"

            1)  ['v', 'n', 'l', 'u', 'd', 'f', 'b']
            2)  ['s', 'r']

            Method will accept String and return ArrayList <Characters>
     */

}

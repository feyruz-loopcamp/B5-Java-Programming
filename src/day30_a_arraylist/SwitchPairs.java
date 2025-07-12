package day30_a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}

        There is two pairs:
            "Cat" and "in"
            "the" and "hat"

    Output:
        {"in", "Cat", "hat", "the"}
 */
public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "app"));

        System.out.println("Original: " + list);
        System.out.println( "Swapped: " + switchPair(list) );
    }


    public static ArrayList <String> switchPair (ArrayList <String> list) {

        // ArrayList <String> copylist = list;  // This is point to the same one.
        ArrayList <String> copylist = new ArrayList<>(list);  // Created a new one by copying list

        if (copylist.size() % 2 == 0){

            for (int i = 0; i < copylist.size(); i+=2) {
                //copylist.get(i);
                //copylist.get(i+1);

                Collections.swap(copylist, i, i+1);
            }

        } else {
            System.out.println("Number of elements are not even!");
            copylist = null;
        }

        return copylist;
    }
}



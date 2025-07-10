package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        // Create an empty ArrayList of String and add elements one by one
        //ArrayList <String> list1;  // Not actual ArrayList object yet. This is just a reference
        //new ArrayList<>();  // This is the actual ArrayList object but with no reference to it.
        //System.out.println(new ArrayList<>()); // this is completely different ArrayList object.

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Monday");
        list1.add("Tuesday");
        System.out.println(list1);


        // Create an ArrayList and give directly the initial values at the declaration
        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("Monday", "Tuesday"));
        System.out.println(list2);

        System.out.println("------------------");
        ArrayList <String> list3 = list1; // We did nto create a new ArrayList object. We are just pointing to the same object as the list1 is pointing
        System.out.println(list3);

        System.out.println("------------------");
        list1.set(0, "MON");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("------------------");
        ArrayList <String> list4 = new ArrayList<>(list2); // We created a new ArrayList object by copying the list2
        list2.set(0, "M");
        System.out.println(list2);
        System.out.println(list4);


    }
}

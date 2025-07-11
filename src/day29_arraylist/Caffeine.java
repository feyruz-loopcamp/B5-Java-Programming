package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();  // created empty ArrayList of String
        list1.add("coffee");
        list1.add("soda");
        list1.add("tea");
        list1.add("energy drinks");
        list1.add("tea");
        System.out.println(list1);


        ArrayList <String> list2 = list1; // not created a new Arraylist of String - just pointing to the same one as list1 does
        System.out.println(list2);

        ArrayList <String> list3 = new ArrayList<>(list1); // created a new ArrayList of String by copying the list1
        System.out.println(list3);

        System.out.println("---------------------------------------");
        list1.remove("soda");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


        System.out.println("---------------------------------------");
        list2.remove("energy drinks");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);



        System.out.println("---------------------------------------");
        String [] arr = {"soda", "tea", "cofee"};
        //ArrayList <String> list4 = arr;                       // NOT VALID
        //ArrayList <String> list4 = new ArrayList<>(arr);      // NOT VALID
        ArrayList <String> list4 = new ArrayList<>(Arrays.asList(arr));        // VALID
        System.out.println(list4);


        System.out.println("---------------------------------------");
        // BULK OPERATIONS
        System.out.println("BULK OPERATIONS");

        // .addAll()
        ArrayList <String> list5 = new ArrayList<>();
        //list5.add("soda");
        //list5.add("tea");
        //list5.add("coffee");
        //list5.add("energy drinks");

        // list1.addAll("soda", "tea", "coffee", "energy drinks");   // NOT VALID  - because we need to provide collection type data
        list5.addAll( Arrays.asList("soda", "tea", "coffee", "energy drinks") );
        System.out.println(list5);
        list5.add("Milkshake");
        System.out.println(list5);
        list5.addAll(Arrays.asList("mocha", "hot chocolate"));
        System.out.println(list5);

        list5.addAll(0, Arrays.asList("chai latte", "hot cocoa"));
        System.out.println(list5);

    }
}



/*
    ArrayList
        - size is flexible
        - keeps insertion order
        - allows duplicate element
        - has indexes
        - internally uses array
 */
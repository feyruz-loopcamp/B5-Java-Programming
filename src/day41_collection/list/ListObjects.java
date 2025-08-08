package day41_collection.list;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {

        /*
            ArrayList<String> list1 = new ArrayList<>();    // Reference: ITSELF
            List<String> list2 = new ArrayList<>();         // Reference: "Parent" Interface List
            Collection<String> list2 = new ArrayList<>();   // Reference: "Parent" Interface Collection
            Iterable<String> list2 = new ArrayList<>();     // Reference: "Parent" Interface Iterable
         */

        /*
            Arraylist
                - Internally using dynamic arrays
                - Insertion order is kept
                - adding/removing elements makes the process slower since it using indexes in the background
                - reading (retrieving/getting elements) is faster since it works with indexes.
                - it accepts "null" value as well
                - it accepts duplicate values
         */
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null);
        list1.add("a");
        System.out.println(list1.get(0));
        System.out.println(list1);


        System.out.println("----------------------------------");
         /*
            LinkedList
                - Internally using pointers
                - Insertion order is kept
                - adding/removing elements makes the process faster since it using pointers
                - reading (retrieving/getting elements) is slower since it starts from beginning and goes 1 by 1
                - it accepts "null" value as well
                - it accepts duplicate values
         */
        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2.get(0));
        System.out.println(list2);

        System.out.println("----------------------------------");
         /*
            Vector
                - Internally using dynamic arrays
                - Insertion order is kept
                - it accepts "null" value as well
                - it accepts duplicate values
                - it is synchronized / thread safe
         */
        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3.get(0));
        System.out.println(list3);


    }
}

package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(); // size = 0; capacity = 10;
        list1.addAll( Arrays.asList(10, 2, 4, 62, 23, 9) ); // size = 6;
        System.out.println(list1); // [10, 2, 4, 62, 23, 9]

        // Collections class
        //.sort();
        Collections.sort(list1);
        System.out.println(list1);


        //.reverse();
        Collections.reverse(list1);
        System.out.println(list1);

        //.max() \ .min()
        System.out.println( Collections.min( list1 ) );
        System.out.println( Collections.max( list1 ) );

        //.swap();
        Collections.swap(list1, 0, list1.size()-1);
        System.out.println(list1);


        //.frequency();
        String str = "java is cool programming language";
        // str.split("")                             --- >  array       - ["j", "a", "v", "a", " ", ........ "e"]
        // Arrays.asList( str.split("") );           --- >  arrayList   - ["j", "a", "v", "a", " ", ........ "e"]
        ArrayList <String> list2 = new ArrayList<>( Arrays.asList( str.split("") ) );
        //Collections.frequency(Arrays.asList( str.split("") ), " ");
        int countOfSpace = Collections.frequency(list2, " ");
        System.out.println("In your sentence, there are " + (countOfSpace+1)+ " words.");


        // You can do it directly like below
        String [] arr1 = str.split(" ");
        System.out.println("In your sentence, there are " + arr1.length + " words.");

        //Or even you can do it directly like below
        ArrayList <String> list3 = new ArrayList<>( Arrays.asList( str.split(" ") ) );
        System.out.println("In your sentence, there are " + list3.size() + " words.");



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
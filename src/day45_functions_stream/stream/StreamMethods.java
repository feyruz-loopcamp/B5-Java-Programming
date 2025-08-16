package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    - stream is not a data structure.
    - It is a method that get the input from all the other data structures
        - which will help us to use some of the built-in re-usable method
    - can work with Array and all teh other Collection
        1. Arrays
        2. Collection
 */
public class StreamMethods {
    public static void main(String[] args) {

        // 1 - .stream() with array
        int [] numbers = {1, 2, 3, 4, 5};

        /*
            Steps to use array with stream
                1. convert array into stream
                    - NOT VALID for array: numbers.stream();
                    - VALID: Arrays.stream(numbers);
                2. Apply the method we want from stream.
                3. Then convert stream back to array

                *. DOES NOT CHANGE ORIGINAL ARRAY
         */
        Arrays.stream(numbers);




        // 2 - .stream() with Collection (List)
        List <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         /*
            Steps to use array with stream
                1. convert array into stream
                    - VALID: list.stream();
                2. We will apply the method we want from stream.
                3. Then convert stream back to Collection

                *. DOES NOT CHANGE ORIGINAL COLLECTION
         */
        list.stream();


        System.out.println("---------------------------------------------------");
        // Method 1: .distinc();
        List <Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 54, 2, 54, 1, 654, 23, 1, 2));
        System.out.println("List before distinct: " + l1);
        //System.out.println("List after distinct: " + l1.stream().distinct()); // MEMORY LOCATION: java.util.stream.DistinctOps$1@4a574795
        System.out.println("List after distinct: " + l1.stream().distinct().collect(Collectors.toList()));
        /*
            1. l1.stream()
            2. l1.stream().distinct().
            3. l1.stream().distinct().collect(Collectors.toList())
         */

        System.out.println("...................................................");

        int [] n1 = {1, 2, 3, 4, 5, 54, 2, 54, 1, 654, 23, 1, 2};
        System.out.println("Array before distinct: " + Arrays.toString(n1));
        System.out.println("Array after distinct: " + Arrays.toString(Arrays.stream(n1).distinct().toArray()));


        /*
            1. Arrays.stream(n1)
            2. Arrays.stream(n1).distinct()
            3. Arrays.stream(n1).distinct().toArray()
         */


        System.out.println("########################################");
        // Method 2: .limit(num); keeps the number of elements from beginning to the given num
        List <Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("List before limit: " + l2);
        System.out.println("List after limit: " + l2.stream().limit(5).collect(Collectors.toList()));

        System.out.println("...................................................");
        // Method 3: skip(); removes the number of elements from beginning to the given num
        System.out.println("List before skip: " + l2);
        System.out.println("List after skip: " + l2.stream().skip(3).collect(Collectors.toList()));

        System.out.println("...................................................");
        // Method chaining with stream methods
        System.out.println("List before stream chaining: " + l2);
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //.skip(3); --- > 4, 5, 6, 7, 8, 9, 10
        //.limit(2); --- > 4, 5
        System.out.println( "List after stream chaining: "  +  l2.stream().skip(3).limit(2).collect(Collectors.toList())) ;


        System.out.println("########################################");
        // Method 4: .count();
        List <Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5));
        System.out.println("List before count: " + l3);
        System.out.println("List before count - size: " + l3.size());
        System.out.println("List after count: " + l3.stream().count());

        // get me how many element I have after removing duplicates
        System.out.println("List after count on uniques: " + l3.stream().distinct().count());
        System.out.println("List after size on uniques: " + l3.stream().distinct().collect(Collectors.toList()).size());


        System.out.println("...................................................");
        String str = "aaabbbddddssseeettssffss";

        //1 - str.split("");
        //2 - Arrays.stream(str.split("")).distinct();
        //3 - Arrays.stream(str.split("")).distinct().toArray();
        System.out.println(   Arrays.toString(Arrays.stream(str.split("")).distinct().toArray())  );
        // Convert array to stream --> apply stream method ---> convert back to array -- > print array
        System.out.println(   Arrays.stream(str.split("")).distinct().toArray().length  );
        System.out.println(    Arrays.stream(str.split("")).distinct().collect(Collectors.toList())   );
        // Convert array to stream --> apply stream method ---> convert back to list -- > print list

    }
}

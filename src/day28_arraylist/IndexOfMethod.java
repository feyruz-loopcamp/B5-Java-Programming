package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "loopcamp";
        //            01234567
        System.out.println( str.indexOf("o") ); // find the index of first match from the beginning
        System.out.println( str.indexOf("K") ); // No match -- > -1
        System.out.println( str.lastIndexOf("p")); // find the index of first match from the end


        System.out.println("--------------------------");
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(200);
        nums.add(600);
        System.out.println(nums);
        // [100, 200, 300, 400, 500, 200, 600]
        //   0    1    2    3    4    5    6

        // indexOf(Element);
        System.out.println( nums.indexOf(200) ); // find the index of first match from the beginning
        System.out.println( nums.indexOf(700) ); // No match -- > -1
        // lastIndexOf(Element);
        System.out.println( nums.lastIndexOf(200)); // find the index of first match from the end


    }

    /*
    ArrayList Methods
        .size();
        .add(Element);
        .add(index, Element);
        .get(index);
        .isEmpty();
        .contains(Element);
        .clear();
        .set(index, Element);
        .indexOf(Element);
        .lastIndexOf(Element);


    ArrayList
        - size is NOT fixed
        - keeps insertion order
        - allows duplicate elements
        - works with NON-PRIMITIVE (Object type) data type
        - Internally uses Array
 */
}

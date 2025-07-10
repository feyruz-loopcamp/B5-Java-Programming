package day28_arraylist;

import java.util.ArrayList;

public class Recap {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();

        System.out.println(nums);
        nums.add(100);
        System.out.println(nums);
        nums.add(200);
        System.out.println(nums);
        nums.add(300);
        System.out.println(nums);
        nums.add(400);
        System.out.println(nums);

        System.out.println("-----------------------------");
        System.out.println( nums.size() );
        System.out.println( nums.get(0) );
        // System.out.println( nums.get( 3 ));
        System.out.println( nums.get( nums.size() - 1 ));

        System.out.println("-----------------------------");
        nums.add(500);
        nums.add(500); // Insertion order is KEPT
        nums.add(300); // duplicate ELEMENTS/Data is kept
        System.out.println(nums);


        System.out.println("-----------------------------");
        nums.add(1, 900);
        System.out.println(nums);

        //nums.add(10, 900); //IndexOutOfBoundsException

        nums.add(nums.size()-1, 800);
        System.out.println(nums);

        nums.add(1000);
        System.out.println(nums);

        System.out.println("-----------------------------");
        int n = 0;
        nums.remove(0); // Removing by index
        System.out.println(nums);

        nums.remove(n);
        System.out.println(nums);

        Integer n2 = 0;
        nums.remove(n2); // Removing by Element - if no match is found, nothing is removed.
        System.out.println(nums);

        //nums.remove(200); // Removing by index and since we do not have index 200 existing in this ArrayList, we are getting IndexOutOfBoundsException
        //System.out.println(nums);

        nums.remove( (Integer)300); // removes the first matching ELEMENT (not index)
        System.out.println(nums);

    }
}

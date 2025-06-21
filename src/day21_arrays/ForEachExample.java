package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {4, 24, 6, 2};
        // nums.length -- > 4


        // fori loop / traditional for loop
        for (int i = 1; i < nums.length; i++) {
            System.out.println( nums[i] );
        }

        System.out.println("-------");
        int [] nums2 = new int[5]; // [10, 10, 10, 10, 10]

        // loop through and assign 10 to all index
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = 10;
        }

        System.out.println("-------");
        // foreach loop
        // - if you do not need specific index
        // - if you need to get all the elements from beginning all the way to the end
        // {4, 24, 6, 2}
        // 1 - int eachElem = 4;
        // 2 - int eachElem = 24;
        // 3 - int eachElem = 6;
        // 4 - int eachElem = 2;
        for (int eachElem : nums) {
            System.out.println(eachElem);

            // eachElem = 30; // THIS DOES NOT RE_ASSING values those indexes in array
        }
        System.out.println( Arrays.toString(nums) );

        System.out.println("-------");

        String [] names = {"Tom", "Jim", "Jack"};

        for(String eachElem : names) {
            System.out.println( eachElem.toUpperCase()  );
        }


    }
}

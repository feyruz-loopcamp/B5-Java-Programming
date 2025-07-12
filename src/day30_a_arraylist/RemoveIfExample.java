package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));

        System.out.println("Before: " + nums);
//        for (Integer each : nums) {
//
//            if (each == 54){
//                nums.remove(each);
//            }
//
//        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                nums.remove(nums.get(i));
            }
        }

        System.out.println("After: " + nums);

        // Q: Why some are removed but some did not even though condition is true
        // A: It is all because of ArrayList is not fixed.Since I removed some elements all other elemens shifted. Possible that some elements will not be even checked

        // 3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3
        // i = 0; ---- > 3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3
        //               0  1   2   3   4  5 ............
        // i = 1; ---- > 3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3
        //               0  1   2   3   4  5 ............
        //               i--;

        // i = 2; ---- > 3, 54, 3, 54, 2, 654, 65, 347, 87, 3
        //               0  1   2   3   4  5 ............


        System.out.println("-------------------------------------------");
        ArrayList <Integer> nums2 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Before: " + nums2);

        // LAMBDA EXPRESSION: referenceName -> condition
        nums2.removeIf( eachSingElement -> (eachSingElement % 2 == 0 ));
        /*
            from nums2 ArrayList
                - take each element and assign it into "eachSingElement" reference name
                - check the condition (eachSingElement % 2 == 0 )
                    - if true, remove it
         */
        System.out.println("After: " + nums2);



        System.out.println("-------------------------------------------");
        //.replaceAll()
        ArrayList <Integer> nums3 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Before: " + nums3);
        nums3.replaceAll( eachSingleElem -> (eachSingleElem + 2) );
        System.out.println("After: " + nums3);
        nums3.replaceAll( eachSingleElem -> (eachSingleElem * 2) );
        System.out.println("After: " + nums3);


        System.out.println("-------------------------------------------");
        ArrayList <Integer> nums4 = new ArrayList<>(Arrays.asList(3, 54, 54, 3, 54, 2, 654, 65, 347, 87, 3));
        System.out.println("Beofre: " + nums4);

        // Doing same thing with fori loop
        for ( int i = 0; i < nums4.size(); i++) {
            nums4.set(i, nums4.get(i) * 2);
        }

        System.out.println("After: " + nums4);





    }
}




















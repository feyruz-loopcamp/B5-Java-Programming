package day26_methods;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        System.out.println( Arrays.toString(nums) );

        int [] nums2 = addElem(nums, 89);
        System.out.println( Arrays.toString(nums2) );

        System.out.println("--------------------------");

        addElem2(12, 23, 54, 345, 54);

    }

    // Create a method which adds a given number into an array
    public static int [] addElem (int [] nums, int num){

        int [] newNums = Arrays.copyOf(nums, nums.length+1);  // {1, 2, 3, 4, 5, 6, _0_};
        newNums[newNums.length-1] = num; // // {1, 2, 3, 4, 5, 6, _89_};

        return newNums;
    }

    // Create a method which adds a given number into an array - var args
    public static int [] addElem2 ( int num, int ... nums){

        int [] newNums = Arrays.copyOf(nums, nums.length+1);  // {1, 2, 3, 4, 5, 6, _0_};
        newNums[newNums.length-1] = num; // // {1, 2, 3, 4, 5, 6, _89_};

        return newNums;
    }


}

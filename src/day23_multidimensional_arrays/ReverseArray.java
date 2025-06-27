package day23_multidimensional_arrays;

import java.util.Arrays;

/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */
public class ReverseArray {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};
        //             0  1  2  3  4
        int [] reversed = new int[nums.length]; // [ _, _, _, _, _ ]

        for (int i = nums.length-1; i >= 0; i--) {
            reversed [nums.length - i - 1]   =  nums[i];
            //reversed [5 - 4 - 1]   =  nums[4];
            //reversed [5 - 3 - 1]   =  nums[3];
            //reversed [5 - 2 - 1]   =  nums[2];
            //reversed [5 - 1 - 1]   =  nums[1];
            //reversed [5 - 0 - 1]   =  nums[0];
        }

        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Reversed: " + Arrays.toString(reversed));


        System.out.println("-----------------------------");
        // {1, 2, 3, 4, 5}
        int [] reversed2 = new int[nums.length]; // [ _, _, _, _, _ ]
        for (int i = nums.length - 1, j = 0  ; i >=0; i--, j++) { // 4 - 3 -2 -1 -0
             reversed2[j] = nums[i];
            // i = 4 - 3 - 2 - 1 - 0
            // j = 0 - 1 - 2 - 3 - 4
        }
        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Reversed2: " + Arrays.toString(reversed2));


    }
}

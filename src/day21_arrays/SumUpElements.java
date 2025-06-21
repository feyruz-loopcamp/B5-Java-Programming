package day21_arrays;

import java.util.Arrays;

/*
    declare and assign an array of numbers

        {3, 6, 10}

    sum all the numbers in the array
 */
public class SumUpElements {
    public static void main(String[] args) {
        int [] nums = {3, 6, 10};
        System.out.println("Size of array: " + nums.length);
        System.out.println("Getting elements with indexes: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println("Getting all elements: " + Arrays.toString(nums).replace("[", "").replace("]",""));

        System.out.println("----------------------------------");
        // loop though array and print each
        for (int i = 0; i < nums.length; i++) {
            System.out.println( nums[i] );
        }

        System.out.println("----------------------------------");
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i]; // 3 - 6 - 10
        }
        System.out.println("Sum of all: " + result);

    }
}

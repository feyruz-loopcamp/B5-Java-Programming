package day25_methods;

import my_util.ArrayUtil;

import java.util.Arrays;

public class MinAndMaxNum {
    // create a method finds min from int array
    public static int minNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    // create a method finds max from int array
    public static int maxNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int [] numbers = {3, 65, 12, 124, 765, 23, 675, -1};

        System.out.println( minNumInArray(numbers) );
        System.out.println( maxNumInArray(numbers) );


        System.out.println("--------------");
        System.out.println(ArrayUtil.maxNumInArray(numbers));
        System.out.println(ArrayUtil.minNumInArray(numbers));

    }
}

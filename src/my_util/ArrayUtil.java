package my_util;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method find the min element in int array
     * @param nums given int array
     * @return min element
     */
    public static int minNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    /**
     * This method finds the max element in int array
     * @param nums given int array
     * @return max element
     */
    public static int maxNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}

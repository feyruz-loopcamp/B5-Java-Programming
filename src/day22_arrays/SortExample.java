package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {23, 54, -2, 45, 234, 65, -234};
        System.out.println("Before sorted: " + Arrays.toString(nums));

        int [] sortedNums = nums; // Here I did not create a new array. I just point to the same one.
        System.out.println("Before sorted: " + Arrays.toString(sortedNums));

        System.out.println("------------------------------------------");
        Arrays.sort(nums); // sorts the nums from SMALLEST to BIGGEST
        System.out.println("After sorted: " + Arrays.toString(nums));
        System.out.println("After sorted: " + Arrays.toString(sortedNums));

        System.out.println("------------------------------------------");
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);


        System.out.println("------------------------------------------");
        int [] num2 = new int[ nums.length ]; // created a new array with same size as nums array
        for (int i = 0; i < nums.length; i++) { // ... and with the loop I copied all the elements from nums array into num2 array
            num2[i] = nums[i];
        }
        System.out.println("After created a new array and making copy of num array: " + Arrays.toString(num2));

        num2[0] = 100;
        System.out.println("Num2: " + Arrays.toString(num2));
        System.out.println("Nums: " + Arrays.toString(nums));
        System.out.println("SortedNums: " + Arrays.toString(sortedNums));


    }
}

package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int maxNum = -2147483648;
        //int minNum = 2147483647;
        int minNum = Integer.MAX_VALUE;

        // NOTE: some other utility classes
        //System.out.println( Integer.MAX_VALUE );
        //System.out.println( Integer.MIN_VALUE );
        //System.out.println( Byte.MIN_VALUE );

        System.out.print("Please, tell me how many numbers do you want to compare: "); // 5

        int [] nums = new int[ key.nextInt() ]; // 5

        for (int i = 0; i < nums.length; i++) { // 5
            System.out.print("Please, enter num: ");
            nums[i] = key.nextInt();
        }

        //System.out.println("Your array: " + nums); // memory location
        System.out.println("Your array: " + Arrays.toString(nums));


        for (int eachElem : nums) { // [12, 4, -1] --- > 12

            if (eachElem > maxNum) {
                maxNum = eachElem;
            }

            if (eachElem < minNum) {
                minNum = eachElem;
            }
        }

        System.out.println("Max: " + maxNum);
        System.out.println("Min: " + minNum);



    }
}

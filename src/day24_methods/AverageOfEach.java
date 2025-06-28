package day24_methods;

import java.util.Arrays;

/*
            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30
 */
public class AverageOfEach {
    public static void main(String[] args) {
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double sumOf2DArray = 0;
        int totalCount = 0;

        for ( int [] eachSingDArr: nums) {
            // int [] eachSingDArr = {3, 4, 5, 6};
            double sumOfEachArr = 0;

            for (int eachNum : eachSingDArr) {
                sumOfEachArr += eachNum; // 3 + 4 + 5 + 6 == > 18.0
            }

            sumOf2DArray += sumOfEachArr;  // 18.0 + 13.0 + 60.0 == > 91.0
            totalCount += eachSingDArr.length; // 4 + 3 + 3 -- > 10
            System.out.println("Average of " + Arrays.toString( eachSingDArr ) + " is: " + sumOfEachArr / eachSingDArr.length);
        }

        // sumOf2DArray = 91.0
        // totalCount == 10.0

        System.out.println("Average of " + Arrays.deepToString( nums) + " is: " + sumOf2DArray / totalCount);


    }
}

package day21_arrays;
/*
    Average Number from Array
    Given an int array calculate the average number ->Challenge: Make it flexible so it will work with any array size
    Examples:
    [1,2,3] -> average: 2
    [10, 15, 5, 6] -> average: 9
    [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */
public class AverageNum {
    public static void main(String[] args) {
        int [] nums = {23, 64, 23, 65, 76};

        // add all numbers / by how many numbers

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Total: " + sum );
        System.out.println("Average: " + sum / nums.length);
        System.out.println("Average: " + (double)sum / nums.length);

        System.out.println("----------------------");
        sum = 0;
        for (int eachNum :  nums) {
            sum += eachNum;
        }
        System.out.println("Total: " + sum );
        System.out.println("Average: " + sum / nums.length);
        System.out.println("Average: " + (double)sum / nums.length);

    }
}

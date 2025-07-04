package my_util;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method find the min element in int array
     * @param nums given int array
     * @return min element
     */
    public static int minNumInArray (int [] nums) {
        int [] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        return numsCopy[0];
    }

    /**
     * This method finds the max element in int array
     * @param nums given int array
     * @return max element
     */
    public static int maxNumInArray (int [] nums) {
        int [] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        return numsCopy[numsCopy.length-1];
    }

    /**
     * This methods checks the given int arrays whether contains given num
     * @param nums given int array
     * @param num given in number
     * @return boolean if array contains num
     */
    public static boolean contains (int [] nums, int num){

        boolean result = false;

        for ( int eachElem: nums) {
            if (eachElem == num){
                result = true;
                break;
            }
        }

        return result;
    }


    /**
     * This methods checks the given String arrays wether contains given word
     * @param strs given String array
     * @param word given String word
     * @return boolean if array contains word
     */
    public static boolean contains (String [] strs, String word){

        boolean result = false;

        for ( String eachElem: strs) {
            if (eachElem.equalsIgnoreCase(word)){
                result = true;
                break;
            }
        }

        return result;
    }


    /**
     * This method finds the index of the given num in int nums array
     * @param nums is the given int array
     * @param num is the given number to find the index of
     * @return the index of the number in array
     */
    public static int indexOf (int [] nums, int num) {
        int index = -1;
        //{23, 54, 65, 234, 754, -23, 453}; --- 65

        for (int i =0; i < nums.length; i++) {

            if (nums[i] == num){
                index = i;
                break;
            }
        }

        return index;
    }



    /**
     * This method finds the index of the given words in String array
     * @param strs is the given String array
     * @param word is the given word to find the index of
     * @return the index of the word in array
     */
    public static int indexOf (String [] strs, String word) {
        int index = -1;
        //{23, 54, 65, 234, 754, -23, 453}; --- 65

        for (int i =0; i < strs.length; i++) {

            if (strs[i] == word){
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * This method calculates total of all elements
     * @param arr is the given int array
     * @return sum of all elements
     */
    public static int sumOfElems (int ... arr){ // int array --- > var args

        int result = 0;

        for ( int eachElem : arr) {
            result += eachElem;
        }

        return result;
    }

    /**
     * This method adds a number into array
     * @param num is given new element
     * @param nums is the given int array
     * @return new array with added element at the end
     */
    public static int [] addElem ( int num, int ... nums){

        int [] newNums = Arrays.copyOf(nums, nums.length+1);  // {1, 2, 3, 4, 5, 6, _0_};
        newNums[newNums.length-1] = num; // // {1, 2, 3, 4, 5, 6, _89_};

        return newNums;
    }



    /**
     * This method adds a number into array
     * @param word is given new element
     * @param strs is the given int array
     * @return new array with added element at the end
     */
    public static String [] addElem ( String word, String ... strs){

        String [] newNums = Arrays.copyOf(strs, strs.length+1);  // {1, 2, 3, 4, 5, 6, _0_};
        newNums[newNums.length-1] = word; // // {1, 2, 3, 4, 5, 6, _89_};

        return newNums;
    }


}

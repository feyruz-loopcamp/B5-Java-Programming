package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    String numbers to sum

    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
        Input:
        "123", "34", "513"

        Output:
        [ 6, 7, 9 ]
 */
public class AddStringNumbers {
    public static void main(String[] args) {
        ArrayList <String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList("12", "453", "65", "23", "65", "2"));
        System.out.println("Orig: " + nums);

        System.out.println( sumOfAllElements(nums) );


    }


    public static ArrayList <Integer> sumOfAllElements (ArrayList <String> list){
        ArrayList <Integer> result = new ArrayList<>();



        /*
            loop and get each arraylist element
                - "12" -- >  split ["1", "2"]
                - loop and get each array element
                    "1" -- > 1
                    int sum += 1

                    "2" -- > 2
                    sum += 2
         */

        for ( String eachListElem: list) {

            // ("12", "453", "65", "23", "65", "2") --- > "12"
            String [] arr = eachListElem.split("");

            int sum = 0;
            for ( String eachArrElem : arr) {
                sum += Integer.parseInt(eachArrElem);
            }
            result.add(sum); // AUTOBOXING
        }
        return result;
    }
}

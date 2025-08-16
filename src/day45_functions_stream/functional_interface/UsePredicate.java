package day45_functions_stream.functional_interface;

import my_util.StringUtil;

import java.util.function.Predicate;
/*
    Predicate <T>
        - The abstract method in this functional interface:
            - it accepts ONE any type of object
            - it returns a boolean value

            - boolean test(T t);
 */
public class UsePredicate {
    public static void main(String[] args) {

        // Lambda Expression ---- > () -> {}

        Predicate <String> isPalindrome = (str) -> {
            // Option 1
            String reverseStr = StringUtil.reverse(str);

            // Option 2
            //StringBuilder reverseStr = new StringBuilder(str);
            //reverseStr.reverse();

            // Option 3
            //String reversed = "";
            //for (int i = str.length()-1; i >= 0 ; i--) {
            //    reversed += str.charAt(i);
            //}

            return str.equals(reverseStr);
        };


        System.out.println(isPalindrome.test("racecar"));
        System.out.println(isPalindrome.test("loop"));

        System.out.println("-------------------------------------------");

        Predicate <Integer> isPrime = (num) -> {
            int count = 0;
            for (int i = 1; i <= num ; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            //if (count == 2) {
            //    return true;
            //} else {
            //    return false;
            //}

            return count == 2 ? true : false;
        };

        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(9));


        System.out.println("***********************************************");

        System.out.println(UtilityFunctions.isPalindrome.test("anna"));
        System.out.println(UtilityFunctions.isPalindrome.test("camp"));

        System.out.println("-------------------------------------------");
        System.out.println(UtilityFunctions.isPrime.test(7));
        boolean is11Prime = UtilityFunctions.isPrime.test(11);
        System.out.println(is11Prime);

    }
}

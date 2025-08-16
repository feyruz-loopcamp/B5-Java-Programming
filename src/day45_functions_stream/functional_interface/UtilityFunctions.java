package day45_functions_stream.functional_interface;

import my_util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UtilityFunctions {
    public static Predicate<String> isPalindrome = (str) -> {
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


    public static Predicate <Integer> isPrime = (num) -> {
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


    public static Consumer<Integer> printNumbers = (num) -> {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    };


    public static Function< int [], List<Integer>> convertArrToList = (arr) -> {

        List <Integer> list = new ArrayList<>();

        for ( int eachNUm : arr) {
            list.add(eachNUm);
        }

        return list;
    };


}

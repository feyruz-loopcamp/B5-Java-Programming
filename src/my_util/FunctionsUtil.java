package my_util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionsUtil {
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

    public static BiPredicate<Integer, Integer []> contains = (num, numArr) -> {
        boolean result = false;

        for ( Integer eachNum : numArr) {
            if ( eachNum == num ){
                result = true;
                break;
            }
        }

        return result;
    };


    public static BiConsumer<String, Integer> printWordNumOfTimes = (str, num) -> {
        for (int i = 1; i <= num ; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    };


    public static BiFunction <Integer, Integer, Integer> findBiggest = (num1, num2) -> {
        return num1 > num2 ? num1 : num2;
    };


    public  static BiFunction <List<String>, List<Integer>, Map<String, Integer>> makeMap = (list1, list2) -> {

        Map <String, Integer> map = new LinkedHashMap<>();

        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                map.put(list1.get(i), list2.get(i));
            }
        } else {
            throw new RuntimeException("Lists are not same size!");
        }

        return map;
    };



}

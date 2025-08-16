package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.function.BiPredicate;
/*
    BiPredicate <T>
        - The abstract method in this functional interface:
            - it accepts TWO any type of object
            - it returns a boolean value

            - boolean test(T t, U u);
 */
public class UseBiPredicate {
    public static void main(String[] args) {
       //Implement function which check if given number is in the Array
        // Lambda Expression ---- > () -> {}
        BiPredicate <Integer, Integer []> contains = (num, numArr) -> {
            boolean result = false;

            for ( Integer eachNum : numArr) {
                if ( eachNum == num ){
                    result = true;
                    break;
                }
            }

          return result;
        };

        Integer [] arr = {1, 2, 3, 4, 5};
        System.out.println( contains.test(9, arr) );
        System.out.println( contains.test(2, arr) );


        System.out.println("*************************************");
        System.out.println(FunctionsUtil.contains.test(9, arr));
        System.out.println(FunctionsUtil.contains.test(4, arr));



    }
}

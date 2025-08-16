package day45_functions_stream.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
    Function <T, R>
        - The abstract method in this functional interface:
            - it accepts ONE any type of object (T t)
            - it returns ONE any type of object (R)

            - R apply(T t);
 */
public class UseFunction {
    public static void main(String[] args) {
        // Lambda Expression ---- > () -> {}

        Function < int [], List<Integer> > convertArrToList = (arr) -> {

            List <Integer> list = new ArrayList<>();

            for ( int eachNUm : arr) {
                list.add(eachNUm);
            }

            return list;
        };


        int [] arrNum = {1,2,3,4,5};
        List <Integer> l = convertArrToList.apply(arrNum);
        System.out.println(l);


        System.out.println("*******************************************");
        System.out.println( UtilityFunctions.convertArrToList.apply(arrNum) );


    }
}

package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/*
    BiConsumer <T, U>
        - The abstract method in this functional interface:
            - it accepts TWO any type of object (T t, U u)
            - it returns void (does not return any value)

            - void accept(T t, U u);
 */
public class UseBiConsumer {
    public static void main(String[] args) {
        // LAMBDA EXPRESSION ---- > () -> {}

        // Implement BiConsumer function which takes a word and a number and print word with count of given number
        BiConsumer <String, Integer> printWordNumOfTimes = (str, num) -> {
            for (int i = 1; i <= num ; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };

        printWordNumOfTimes.accept("Hello", 5);

        System.out.println("**************************************");
        FunctionsUtil.printWordNumOfTimes.accept("Hello", 5);


        System.out.println("\n.......................................");
        Map <String, Integer> map = new LinkedHashMap<>();
        map.put("Tom", 10);
        map.put("Jerry", 20);
        map.put("Bob", 30);

        map.forEach( (eachKey, eachValue) ->
                System.out.println( eachKey.toUpperCase() + " - " + (eachValue+10) ) );

        System.out.println();
        map.keySet().forEach( eachKey -> System.out.println(eachKey.toUpperCase()) );

         Set<String> set = map.keySet();
         set.forEach( eachKey -> System.out.println(eachKey.toUpperCase()) );

    }
}

package day45_functions_stream.functional_interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
    Consumer <T>
        - The abstract method in this functional interface:
            - it accepts ONE any type of object
            - it returns void (does not return any value)

            - void accept(T t);
 */
public class UseConsumer {
    public static void main(String[] args) {
        // LAMBDA EXPRESSION ---- > () -> {}

        Consumer <Integer> printNumbers = (num) -> {
            for (int i = 0; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        };


        printNumbers.accept(5);

        System.out.println("***************************************");
        UtilityFunctions.printNumbers.accept(5);


        System.out.println("\n.......................................");
        List <String> list = new LinkedList<>(Arrays.asList("Java", "Selenium", "API"));

       Consumer<String> actionN = (each) -> {
            System.out.println(each);
        };
        list.forEach(actionN);
        list.forEach((each) -> System.out.println(each) );

        System.out.println();
        for ( String each: list) {
            System.out.println(each);
        }
    }
}

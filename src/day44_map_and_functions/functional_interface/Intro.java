package day44_map_and_functions.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro {
    public static void main(String[] args) {

        // LAMBDA EXPRESSION:     () -> {}

        List <Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list1);
        list1.removeIf(each -> each % 2 == 0);
        System.out.println(list1);

        System.out.println("----------------------------------------------------------------");
        List <Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2.forEach(each -> System.out.println(each));

    }
}

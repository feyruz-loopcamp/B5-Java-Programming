package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday tuesday thursday friday saturday sunday";
        System.out.println("String size: " + str.length());

        String [] days = str.split(" ");
        System.out.println(Arrays.toString(days)); // [monday, tuesday, thursday, friday, saturday, sunday]
        System.out.println("Array size: " + days.length);

        System.out.println("----------------------------------------");
        String [] days2 = str.split("day");
        System.out.println(Arrays.toString(days2)); // [mon, _tues, _thurs, _fri, _satur,  sun]

        for (int i = 0; i < days2.length; i++) {
            days2[i] = days2[i].trim();
        }
        System.out.println(Arrays.toString(days2));


        System.out.println("----------------------------------------");
        String [] days3 = str.split("day ");
        System.out.println(Arrays.toString(days3));

        System.out.println("----------------------------------------");
        String [] days4 = str.split("");
        System.out.println(Arrays.toString(days4)); //["m", "o", n, d, a, y,  , t, u, e, ........ d, a, y]

        char [] days5 = str.toCharArray();
        System.out.println(Arrays.toString(days5)); //['m', 'o', 'n', d, a, y,  , t, u, e, ........ d, a, y]


        System.out.println("----------------------------------------");
        String [] day6 = str.split("-"); // ["monday tuesday thursday friday saturday sunday"]
        System.out.println(Arrays.toString(day6));
        System.out.println(day6.length); //



    }
}

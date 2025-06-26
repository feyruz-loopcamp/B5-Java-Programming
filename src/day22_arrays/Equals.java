package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b); // DO NOT use "==" when comparing arrays / any objects
        System.out.println(a == c); // Same memory location since point to the same. BUT DO NOT use "=="

        System.out.println("------------------------------");
        // Comparing actual arrays / objects value
        System.out.println(  Arrays.equals(a, b)  );
        System.out.println(  Arrays.equals(a, c)  );
        System.out.println(  Arrays.equals(b, c)  );

        System.out.println("------------------------------");
        boolean isAandBEqual = Arrays.equals(b, c);
        System.out.println(isAandBEqual);

        System.out.println("------------------------------");
        int [] d = {4, 3, 2, 1};

        System.out.println(  Arrays.equals(a, d )  ); // when it compares arrays, the location of each element has to match as well.

        // Can you check if both array have same elements

        Arrays.sort(a);
        Arrays.sort(d);
        System.out.println(  Arrays.equals(a, d )  );

    }
}

package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] str = {"java", "hello", "by", "Hi", "Apple", "Abc", "4", "3", "$", "?"};

        // NOTE: Order of String sorting: Special Characters > Numbers > special char >  UPPER CASE > lowercase, then Alphabetic order
        // String sorting follows the ASCII table order
        System.out.println("Before sorted: " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("After sorted: " + Arrays.toString(str));

    }
}

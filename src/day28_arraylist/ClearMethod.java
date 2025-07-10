package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); // capacity by default 10 -- size (number of actual elements) is 0
        System.out.println( nums.size() ); // 0
        System.out.println( nums.isEmpty() ); // true
        System.out.println( nums.contains(1)); // no match
        System.out.println( nums.contains("1")); // no match

        System.out.println("-----------------");
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums);
        System.out.println( nums.size() ); // 5
        System.out.println( nums.isEmpty() ); // false
        System.out.println( nums.contains(1)); // no match
        System.out.println( nums.contains("1")); // no match
        System.out.println( nums.contains("20")); // no match
        System.out.println( nums.contains(20)); // match

        System.out.println("-----------------");
        nums.clear(); // this method will remove all the elements from ArrayList
        System.out.println(nums);
        System.out.println( nums.size()); // 0
        System.out.println( nums.isEmpty() ); // true



    }
}


/*
    ArrayList Methods
        .size();
        .add(Element);
        .add(index, Element);
        .get(index);
        .isEmpty();
        .contains(Element);
        .clear();
 */
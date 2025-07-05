package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1);
        nums.add(30);
        nums.add(6);
        nums.add(20);
        nums.add(-10);
        nums.add(0);
        nums.add(3);

        System.out.println(nums);
        System.out.println(nums.size());

        System.out.println("------------------------------------------");
        /*
            remove(byIndex-int)
            remove(byObject-data)
         */

        // [100, 1, 30, 6, 20, -10, 0, 3]
        //   0   1   2  3   4   5   6  7
        nums.remove(3); // this will remove by index- because 3 is int in here
        System.out.println(nums);

        // What is the element you want to remove
        String str = "I want to remove 3";
        str = str.substring(str.lastIndexOf (" " ) + 1); //--- > "3"
        Integer num = Integer.valueOf(str); //---- > "3" --- > Integer 3
        nums.remove (num);
        System.out.println(nums);

        System.out.println("------------------------------------------");
        nums.add(3);
        System.out.println(nums);
        nums.remove( (Integer) 3 ); // Here, I explicitly casted "int" to be "Integer"
        System.out.println(nums);


    }
}

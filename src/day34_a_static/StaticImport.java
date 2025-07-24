package day34_a_static;

//import my_util.ArrayUtil;

import static my_util.ArrayUtil.*; // This will import all statics in ArrayUtil in my_util package
public class StaticImport {
    public static void main(String[] args) {
        int [] nums = {32, 54, 23, 76, 8, 234};

        System.out.println( sumOfElems(nums) ); // Since we did static import, we can use the method directly.
    }
}

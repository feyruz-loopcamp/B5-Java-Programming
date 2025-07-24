package day34_a_static;

// import my_util.*; // This will import everything in my_util package
import my_util.ArrayUtil; // This will import everything in ArrayUtil class in my_util package

public class NormalImport {
    public static void main(String[] args) {
        int [] nums = {32, 54, 23, 76, 8, 234};
        System.out.println( ArrayUtil.sumOfElems(nums) );
    }
}

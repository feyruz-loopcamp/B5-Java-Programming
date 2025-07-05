package day27_wrapper_arraylist;

public class MaxAndMinValues {
    public static void main(String[] args) {

        // In each Wrapper Class, we have some useful (already pre-built) re-usable method, values we can use.

        /*
            Character.isUpperCase(char);
            Character.isLowerCase(char);
            Character.isDigit(char);
         */

        // Finding the range that byte can hold
        System.out.println(Byte.MIN_VALUE );
        System.out.println(Byte.MAX_VALUE);


        // Finding the range that int can hold
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        // Finding the range that double can hold
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        byte max = Byte.MAX_VALUE; // 127 (byte)
        Byte max2 = Byte.MAX_VALUE; // 127 (byte) ---- > AUTOBOXING


    }
}

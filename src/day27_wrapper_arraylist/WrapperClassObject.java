package day27_wrapper_arraylist;

import java.util.Scanner;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 2;  // primitive data type for variable a (local variable)

        //Integer a2 = new Integer(10); // Deprecated  -- > no longer in use
        Scanner key = new Scanner(System.in);
        String str = new String("Hello");


        Integer a2 = 10;    // 10 by default is "int" --- > AUTOBOXING
        Integer a3 = a;     // variable 'a' holds 2 which is "int" -- > AUTOBOXING

        int a4 = a2;        // converting "Integer" 10 into "int" --- > UNBOXING


        System.out.println(a);  // 2    - int
        System.out.println(a2); // 10   - Integer
        System.out.println(a3); // 2    - Integer
        System.out.println(a4); // 10   - int


        byte b = 2;     // primitive data type
        Byte b2 = b;    // AUTOBOXING - > going from "byte"  into "Byte"

        System.out.println(b);  // 2 - > byte
        System.out.println(b2); // 2 - > Byte


    }
}

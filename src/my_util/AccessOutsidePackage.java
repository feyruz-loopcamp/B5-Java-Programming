package my_util;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

// DIFFERENT Package + DIFFERENT CLASS
public class AccessOutsidePackage {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println( obj.a ); // "a" has "public", so it is reachable anywhere
        //System.out.println( obj.b ); // "b" has default, so it is reachable in SAME package
        //System.out.println( obj.c ); // "c" had "private", so it is reachable in SAME class

        System.out.println("--------------------------------------");
        System.out.println( AccessModifiers.a2);
        // System.out.println( AccessModifiers.b2 );
        // System.out.println( AccessModifiers.c2 );

    }
}

package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {
    // Access Modifiers
    // public - reachable anywhere
    // "default" - reachable up to SAME package
    // private - reachable only SAME class


    // Instance var - applying access modifiers to instance variables
    public int a;           // public access modifier
    int b;                  // default access modifier
    private int c;          // private access modifier
    //protected int d;      // protected access modifier -- >  Will talk later


    // static var - applying access modifiers to static variables
    public static int a2;           // public access modifier
    static int b2;                  // default access modifier
    private static int c2;          // private access modifier
   // protected static int d2;      // protected access modifier -- >  Will talk later


    // SAME Package + SAME Class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println( obj.a ); // "a" has "public", so it is reachable anywhere
        System.out.println( obj.b ); // "b" has default , so it is reachable in SAME package
        System.out.println( obj.c ); // "c" had "private", so it is reachable in SAME class


        System.out.println("--------------------------------------");
        System.out.println( AccessModifiers.a2 );
        System.out.println( AccessModifiers.b2 );
        System.out.println( AccessModifiers.c2 );
    }
}

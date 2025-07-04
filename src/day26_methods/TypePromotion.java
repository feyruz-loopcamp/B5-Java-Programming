package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {

        /*
            TYPE PROMOTION
                - when calling a methods with parameters
                    - it first tries to find the EXACT MATCHING data type
                    - if not found, it will call the next matching

         */


        //use(10); // whole number by default are "int" datatype in Java

        byte b = 10;
        use(b); // TYPE PROMOTION

        short s = 20;
        use(s);


    }

    public static void use (byte b) {
        System.out.println("printing byte");
    }

    public static void use (short s) {
        System.out.println("printing short");
    }

    public static void use (int i) {
        System.out.println("printing int");
    }


    public static void use (float f) {
        System.out.println("printing float");
    }

    public static void use (double d) {
        System.out.println("printing double");
    }
}


// byte < short < int < long < float < double

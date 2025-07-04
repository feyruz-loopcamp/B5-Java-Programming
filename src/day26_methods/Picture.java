package day26_methods;

public class Picture {

    /*

        METHOD OVERLOADING
            - Same method name + different parameters (different data type and different order and different number of parameters)
            - happens in the SAME CLASS
            - Return type does not affect the Method Overloading

        -this allows us to change how the methods work when we get different parameter types, but still

        We can NOT have methods with SAME NAME + EXACT SAME DATA TYPE PARAMETERS
        METHOD SIGNATURE - > methodName(); - > NAME + (DATA TYPE PARAMETERS)

     */

    // NON-PARAMETERIZED method
    public static void draw (){
        System.out.println("Trying to draw");
    }


    // PARAMETERIZED method - accepts 1 String argument / 1 String parameter
    public static void draw (String color) {
        System.out.println("Trying to draw with " +  color);
    }

    // Because we already have a method called "draw" and accepts a String
    //public static void draw (String str){
    //
    //}

    // This has a different METHOD SIGNATURE
    public static void draw (String clr, String clr2){
        System.out.println("Trying to draw with " + clr + " and " + clr2 );
    }


    public static void draw (int num) {
        System.out.println("Trying to draw with " + num + " brushes");
    }


    public static void draw (String color, int num){
        System.out.println("1 - Trying to draw with " + color + " and with " + num + " brushes"  );
    }



    // This is a different METHOD SIGNATURE
    // Order of the PARAMETERS - Data Types MATTERS
    public static void draw (int num, String color){
        System.out.println("2 - Trying to draw with " + color + " and with " + num + " brushes"  );
    }

    // There is no method overloading between "paint" and "draw" methods
    // but there is Method Overloading between "paint" method s
    public static void paint (String str) {

    }

    public static void paint (String str, String str2) {

    }


    // Return type does not affect the Method Overloading
    public static String paint (String str, String str2, String str3){

        return "";
    }


}

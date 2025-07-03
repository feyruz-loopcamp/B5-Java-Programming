package day25_methods;


//import my_util.StringUtil; // this will import StringUtil class from my_util packager
import my_util.*; // this will import everything from my_util packager

/*
    Fix Format

    create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {

    // TODO: Homework - handle the case where this method does not accept more than one word
    // If more than one word - return a message: "Should be single word"
    public static String fixFormat (String str) {
        String fixed = "";

        /*
            first char to uppercase
            rest is lowercase
         */

        fixed = (""+str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();


        return fixed;
    }

    public static void main(String[] args) {
        System.out.println( FixFormat.fixFormat("TOM") ); // I am calling a methos which is in FixForam class
        System.out.println(  fixFormat("HaNNA") );
        System.out.println(  fixFormat("HaNNA Jama") );

        System.out.println(  StringUtil.fixFormat("JAMES") ); // I am calling a method which is in StringUtil class (is in my_util package)


    }
}

/*
    NOTE:
        When your re-usable method is in a different package, we need to import it
        And if your method is "static" method, we use the Class Name to call that method.
 */
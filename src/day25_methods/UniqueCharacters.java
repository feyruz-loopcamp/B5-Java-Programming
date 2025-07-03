package day25_methods;

import my_util.StringUtil;

import java.util.Arrays;

/*
    Make a method that returns the single characters of each in the String
     loopcamp
        lpcam
 */
public class UniqueCharacters {

    public static String uniqueChars (String str) {
        String unique = "";
        char []  strArr = str.toCharArray();

        // foreach ---  >we can only use with data structures
        for ( char each: strArr){ // [l, o, o, p, c, a, m, p ]

            if (!unique.contains( each+"" )) {
                unique += each;  // lopcam
            }

        }

        return unique;
    }


    public static void main(String[] args) {
        System.out.println( uniqueChars("loopcamp") );

        System.out.println( StringUtil.uniqueChars("Loopcamp") );

    }

}

package day14_string;

import java.util.Locale;

public class StartAndEnd {
    public static void main(String[] args) {
        String str1 = "Loopcamp";
        String str2 = "LOOp";

        // #6 - "".startsWith(""); will check if start or not with exact match - returns boolean
        System.out.println( str1.startsWith("Loop")  );
        System.out.println( str1.startsWith("loop")  );


        System.out.println();
        // Q: How would ignore the case sensitiveness and still check if it starts with same characters

        // take str1 --- > make all lowercase
        // take "Loop" - > make all lowercase
        // then check if it .startsWith()

        System.out.println(   str1.toLowerCase().startsWith( "Loop".toLowerCase()  )    ); // "loopcamp".startsWith("loop")
        System.out.println(   str1.toUpperCase().startsWith( "Loop".toUpperCase()  )    ); // "LOOPCAMP"..startsWith("LOOP")


        System.out.println(str1.startsWith("Loopcamp"));
        System.out.println(str1.startsWith("Loopcamp "));
        System.out.println(str1.startsWith("   Loopcamp"));
        System.out.println(str1.startsWith("   Loop"));

        System.out.println();
        String sentence = "Today is Java class day";
        System.out.println(sentence.startsWith("Today "));
        System.out.println(sentence.startsWith("Today is Java c"));
        System.out.println(sentence.startsWith("Today is Java classd"));
        System.out.println(sentence.startsWith(" is "));


        System.out.println();
        // #7 - "".endsWith(""); will check if ends or not with exact match - returns boolean
        System.out.println( sentence.endsWith("day"));
        System.out.println( sentence.endsWith("ss day"));
        System.out.println( sentence.endsWith( "java class day"));


        System.out.println();
        boolean hasSameEnding = "loopCAMP".endsWith("camp");
        System.out.println(hasSameEnding);
        boolean hasSameBeginnig = "Thursday!".startsWith("THu");
        System.out.println(hasSameBeginnig);


        System.out.println();
        System.out.println("LOOPcamp".startsWith("LOOP"));
    }
}

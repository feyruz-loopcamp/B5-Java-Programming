package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

        // Declared OBJECT/NON-PRIMITIVE reference
        // ClassName(dataType - Scanner) ReferenceName
        Scanner keyboard;

        // Declared OBJECT/NON-PRIMITIVE refence
        // ClassName(dataType - String) ReferenceName
        String word;


        // Declared PRIMITIVE reference
        //dataType-int variableName (variable Reference Name)
        int num;


        // -----------------------------------------------------
        // There are 2 ways of creating String in Java

        // Option 1 - By LITERALS --- > simply create String by double quotations "  "
        String str1 = "Java";


        // Option 2 - By 'new keyword'
        String str2 = new String("Java");


        String str3 = "Java";
        String str4 = new String("Java");


        String str5 = "Java";
        String str6 = "java";
        String str7 = "java";

        System.out.println(str1); // Java
        System.out.println(str2); // Java
        System.out.println(str3); // Java
        System.out.println(str4); // Java
        System.out.println("-------");
        System.out.println(str1 == str2); // "==" we are comparing the memory location of the String values
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);

        String str8 = "Java";
        String str9 = new String("Java");


        // == ---- > DO NOT EVER USE relational equation operator to COMPARE String VALUEs. "==" compares the MEMORY LOCATION not the VALUE



    }
}

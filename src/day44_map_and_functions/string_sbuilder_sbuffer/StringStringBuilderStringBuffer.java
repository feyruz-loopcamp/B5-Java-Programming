package day44_map_and_functions.string_sbuilder_sbuffer;

import my_util.StringUtil;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {
        // 1. String
        //  - Immutable
        //  - We can create by literals and by "new" keyword
        String str1 = "loopcamp";                       // Stored in Heap (String Pool)
        System.out.println("String: " + str1);          // We created a new String. The other one is not changed;

        String str2 = new String("loopamp");     // Stored in Heap (directly in the Heap)
        str2 = str2 + " " + str2;                       // We created a new String. The other one is not changed
        System.out.println("String: " + str2);
        //str2.reverse();
        StringUtil.reverse(str2);

        System.out.println("-----------------------------------");
        // 2. StringBuilder
        //  - Mutable
        //  - We can create only by "new" keyword
        //  - It is NOT Synchronized / Thread-safe
        StringBuilder sb = new StringBuilder("loopcamp");   // Stored in Heap (directly in the Heap)
        System.out.println("StringBuilder: " + sb);
        sb.append(" course");                               // We changed the original String
        System.out.println("StringBuilder: " + sb);


        System.out.println("-----------------------------------");
        // 3. StringBuffer
        //  - Mutable
        //  - We can create only by "new" keyword
        //  - It Synchronized / Thread-safe
        //  - It is older version of StringBuilder
        StringBuffer sbf = new StringBuffer("loopcamp"); // Stored in Heap (directly in the Heap)
        System.out.println("StringBuffer: " + sbf);
        sbf.reverse();
        System.out.println("StringBuffer: " + sbf);

    }
}

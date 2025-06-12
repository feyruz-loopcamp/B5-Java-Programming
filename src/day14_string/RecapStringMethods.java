package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        // Declared String reference
        String str1 = "loop";   // By LITERALS
        String str2 = "loop";   // By LITERALS
        String str3 = new String("loop"); // By 'new' keyword
        String str4 = new String("loop"); // By 'new' keyword


        // Comparing with '==' --- > compares memory location
        System.out.println(str1 == str2); // TRUE
        System.out.println(str1 == str3); // FALSE
        System.out.println(str3 == str4); // TRUE
        System.out.println();


        // "".equals(""); ---- > compares the value (exact characters)
        System.out.println( str1.equals(str2) ); // TRUE
        System.out.println( str1.equals(str3) ); // TRUE
        System.out.println( str3.equals(str4) ); // TRUE
        System.out.println( "loop".equals(str3));// TRUE
        System.out.println( str1.equals("loop"));// TRUE
        System.out.println( new String("loop").equals("loop"));// TRUE
        System.out.println( "loop".equals(new String ("loop")));// TRUE
        System.out.println( new String("loop").equals(new String ("loop")));// TRUE
        System.out.println( "loop".equals("loop") );// TRUE

        boolean resultOfEqualsMethod = str1.equals(str2);
        System.out.println(resultOfEqualsMethod);
        System.out.println();



        // "".equalsIgnoreCase(""); ---- > compares the value (characters without case sensitiveness)
        String str5 = "Loop";
        System.out.println( str1.equalsIgnoreCase(str5) );
        boolean isSameWithoutCaseSensitiveness = "LoOp".equalsIgnoreCase(str5);
        System.out.println(isSameWithoutCaseSensitiveness);


        if (isSameWithoutCaseSensitiveness) {
            System.out.println("These two string values are same without case sensitiveness");
        } else {
            System.out.println("These two string values are NOT same without case sensitiveness");
        }


        System.out.println();
        // "".length();  --- > counts how many characters there are and returns int
        System.out.println( str1.length() ); // 4
        str1 = str1 + "camp"; // We made a new String (String is IMMUTABLE)-- > "loopcamp"
        System.out.println( str1.length() ); // 8

        int num = 10;
        System.out.println( ("" + 10).length() ); // "10".length(); -- > 2
        // System.out.println( 10.length() );


        String str6 = "Loop Academy!";
        // write a code that checks if the word has even or odd number characters


        if (str6.length() % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}

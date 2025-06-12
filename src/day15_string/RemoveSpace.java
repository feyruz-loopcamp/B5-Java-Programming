package day15_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String str = "   loopcamp     "; // 16


        System.out.println(str);
        System.out.println( str.length() );

        System.out.println("--------------------");
        // #9 - "".trim(); - removes the empty spaces from the beginning and end.
        System.out.println( str.trim() ); // we just applied the trim and printed it.
        System.out.println(str);
        str = str.trim();
        System.out.println(str);


        System.out.println("--------------------");
        String str2 = "   java is nice programming language";
        System.out.println(str2.trim());


        System.out.println("--------------------");
        String str3 = "\tThursday"; // 1 tab == 4 spaces
        System.out.println(str3.length());
        String str4 = "    Thursday"; // did 4 x spaces
        System.out.println(str4.length());
        String str5 = "    Thursday";  // did 1 x tab --- still does 4 x spaces
        System.out.println(str5.length());
    }
}

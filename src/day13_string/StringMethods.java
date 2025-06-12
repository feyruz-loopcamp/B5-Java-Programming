package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name1 = "Tom"; // By Literals - In String Pool inside Heap
        String name2 = "Tom"; // By Literals - In String Pool inside Heap
        String name3 = new String("Tom"); // By new keyword  - Directly in Heap


        // == --- > this will compare MEMORY LOCATION (DO NOT USE this to COMPARE value)
        System.out.println(name1 == name2); // True
        System.out.println(name1 == name3); // False
        System.out.println(name2 == name3); // False
        System.out.println("--------------");

        // #1 - .equals(); this will compare the String VALUE (including the case sensitiveness)
        System.out.println( name1.equals(name2)  ); // True
        System.out.println( name1.equals(name3)  ); // True
        System.out.println( name2.equals(name3)  ); // True

        System.out.println( "Tom".equals(name1)  ); // True
        System.out.println( name3.equals("Tom")  ); // True

        String name4 = new String("TOM");
        System.out.println( name1.equals(name4)  ); // "Tom" - "TOM"

        System.out.println( new String("TOM").equals(name4) ); // "TOM" - "TOM"

        boolean isN1SameAsN3 = name1.equals(name3);
        System.out.println(isN1SameAsN3);

        System.out.println("----------");
        // Q: How can we compare by IGNORING the CASE SENSITIVENESS
        // #2 - .equalIgnoreCase(); this will compare the String VALUE (excluding the case sensitiveness - same letters either in UPPER case or LOWER case)

        String str1 = "Wed";
        String str2 = "WED";

        System.out.println( str1.equals(str2)); // false
        System.out.println( str1.equalsIgnoreCase(str2)); //


        System.out.println("----------");
        // Q: Hoe can I get how many characters we have in the String
        // #3 - .length(); this will give us the number of the total characters
        String sentence = "I love java";  // 11
        System.out.println( sentence.length() );

        sentence = "Loopcamp has SDET program. It lasts for 6 months.";
        System.out.println(sentence.length());

        int numOfCharactersInSentence = sentence.length();
        System.out.println(numOfCharactersInSentence);

    }
}

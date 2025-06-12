package day14_string;

public class Contains {
    public static void main(String[] args) {

        // #8 - "".contains(""); -- will check if exact ("") is in anywhere in the "". If yes, returns TRUE, if not FALSE
        String str = "Today's Java topic is all about String methods";

        System.out.println( str.contains("Javatopic") ); // false
        System.out.println( str.contains("Java topic") ); // true
        System.out.println( str.contains( "o"));
        System.out.println( str.contains( " "));
        System.out.println( str.contains( "."));

        System.out.println();
        System.out.println( str.contains("Java") && str.contains("methods") && str.contains("all"));
        //                     true              &&         true            &&   true
        //                                      true                   &&         true
        //                                                          true


        System.out.println(str.contains( "Java && methods" ));




    }
}

package day16_loops;

import java.util.Locale;

public class MethodChaining {
    public static void main(String[] args) {

        String sentence = "Today is Wednesday. Wednesday is a fun day.";
        System.out.println(sentence);

        // METHOD CHAINING: combining multiple methods together.
        // you can combine methods together AS LONG AS method returns String



        sentence = sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim().replace("wednesday", "WEDNESDAY");
        //sentence = sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim().length(); // number - int
        //System.out.println(sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim().length().toLowerCase()); // INVALID after length()
        //System.out.println(sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim().contains("e").toUpperCase()); // INVALID after .contains();
        System.out.println(sentence);


        sentence =  "Today is Wednesday. Wednesday is a fun day.";
        System.out.println(  ( "" + sentence.substring( sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim().length()).toLowerCase() );  // 9 --- >  "" + 9 --- > "9".toUpperCase();


    }
}
